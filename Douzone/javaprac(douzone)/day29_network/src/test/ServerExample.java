package test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



import javafx.scene.*;
import javafx.application.Application;
import javafx.scene.control.TextArea;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ServerExample extends Application {
	public ServerExample() {
		// TODO Auto-generated constructor stub
	}
	
	ExecutorService executorService;
	ServerSocket serverSocket;
	
	List<Client> connections = new Vector<Client>();
	
	TextArea txtDisplay;
	Button btnStartStop;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		BorderPane root = new BorderPane();
		root.setPrefSize(500, 300);
		
		txtDisplay = new TextArea();
		txtDisplay.setEditable(false);
		root.setCenter(txtDisplay);
		
		btnStartStop = new Button("start");
		btnStartStop.setPrefHeight(30);
		btnStartStop.setMaxWidth(Double.MAX_VALUE);
		btnStartStop.setOnAction(e->{
			if(btnStartStop.getText().equals("start")) {
				startServer();
			} else if(btnStartStop.getText().equals("stop")) {
				stopServer();
			}
			
		});
		root.setBottom(btnStartStop);
		
		Scene scene = new Scene(root);
		// css 는 제끼고.
		//scene.getStylesheets();
		primaryStage.setScene(scene);
		primaryStage.setTitle("server");
		primaryStage.setOnCloseRequest(event->stopServer());
		primaryStage.show();		
	}
	void displayText(String text) {
		txtDisplay.appendText(text+"\n");
	}
	
	
	void startServer() {
		executorService = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors()
				);
		try {
			serverSocket = new ServerSocket();
			///////////////////////////////////////////////
			serverSocket.bind(new InetSocketAddress("localhost", 5001)); // 주소, 포트번호  ///////////////////////////////////
			///////////////////////////////////////////////
		} catch (Exception e) {
			// TODO: handle exception
			if( !serverSocket.isClosed() ) {
				stopServer();
			}
			//e.printStackTrace(); //유저정의 stopServer() call. 필요없어짐.
			return;
		}
		
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Platform.runLater(()->{
					//나중에 awt나 javaFX 메세지 띄우는 메소드 하나 추가 필요?
					System.out.println("server start");
					displayText("server start");
					btnStartStop.setText("stop");
				});
				while (true) {
					try {
						Socket socket = serverSocket.accept();
						String message = "conn accepted: "+socket.getRemoteSocketAddress()+" : "+Thread.currentThread().getName();
						Platform.runLater(()->{
							displayText(message);
						});
						Client client = new Client(socket);
						connections.add(client);
						Platform.runLater(()->{
							displayText("conneted clients: "+connections.size());
						});
					} catch (Exception e) {
						// TODO: handle exception
						if(!serverSocket.isClosed()) {
							stopServer();
						}
						//e.printStackTrace(); 유저정의 stopServer() 로 대체.
						break;
					}
				}
				
				
			}
		};
		executorService.submit(runnable);		
	} //startServer() end


	

	
	void stopServer() {
		try {
			Iterator<Client> iterator = connections.iterator();
			while (iterator.hasNext()) {
				Client client = iterator.next();
				client.socket.close();
				iterator.remove();
				
				//ServerExample.Client client = (ServerExample.Client) iterator.next();
							
			}
			if(serverSocket !=null && !executorService.isShutdown()) {
				serverSocket.close();
			}
			if(executorService != null && !executorService.isShutdown()) {
				executorService.shutdown();
			}
			Platform.runLater(()->{
				//나중에 awt나 javaFX 메세지 띄우는 메소드 하나 추가 필요.
				//System.out.println("server start");
				displayText("server stop");
				btnStartStop.setText("start");
			});
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	/*
	 * 클라이언트.
	 * 이거는 다른 java 파일로 만들어서 분리하기
	 * 
	 */
	class Client{
		
		//data communication code
		Socket socket;
		
		Client(Socket socket){
			this.socket = socket;
			receive();
		}

		void receive() {
			// TODO 데이터 받기 코드
			Runnable runnable = new Runnable() {
				
				@Override
				public void run() {
					// TODO receive data from client
					try {
						while (true) {
							byte byteArr[] = new byte[100];
							InputStream inputStream = socket.getInputStream();
							
							//if client make exception?
							int readByteCount = inputStream.read(byteArr);
							
							//if client call close
							if(readByteCount == -1) {
								throw new IOException();
							}
							
							String message = "request process: "+socket.getRemoteSocketAddress()+" : "+Thread.currentThread().getName();
							Platform.runLater(()->{
								displayText(message);
							});
							
							String data = new String(byteArr, 0, readByteCount, "UTF-8");
							
							for(Client client: connections) {
								client.send(data);
							}				
							
						}
						
					} catch (Exception e) {
						// TODO: handle exception
						try {
							connections.remove(Client.this);
							String message = "not connected: "+socket.getRemoteSocketAddress()+" : "+Thread.currentThread().getName();
							Platform.runLater(()->{
								displayText(message);
							});
							socket.close();
						} catch (Exception e2) {
							// TODO: handle exception
						}
					}
					
				}
					
			};
			executorService.submit(runnable);
			
			
		}
		//
		//message send to client
		void send(String data) {
			// data submit code
			Runnable runnable = new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					try {
						byte byteArr[] = data.getBytes("UTF-8");
						OutputStream os = socket.getOutputStream();
						os.write(byteArr);
						os.flush();
					} catch (Exception e) {
						// TODO: handle exception
						try {
							String msg = "can not conn: "+socket.getRemoteSocketAddress()+" "+Thread.currentThread().getName();
							Platform.runLater(()->{
								displayText(msg);
							});
							connections.remove(Client.this);
							socket.close();
						} catch (Exception e2) {
							// TODO: handle exception
							e2.printStackTrace();
						}
					}
					
				}
			};
			executorService.submit(runnable);			
		}
		
		
	} // Client Obj end.

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		launch(args);

	}



}

package test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;



import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import test.ServerExample.Client;

public class ClientExample2  extends Application{
	Socket socket;
	
//	void startClient() {}; //연결 코드
//	void stopClient() {}; //연결 종료 코드
//	void receive() {}; //데이터 수신 코드
//	void send(String data); //데이터 전송 코드
	
	//UI code
	TextArea txtDisplay;
	TextField txtInput;
	Button btnConn, btnSend;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		BorderPane root = new BorderPane();
		root.setPrefSize(500, 300);
		
		txtDisplay = new TextArea();
		txtDisplay.setEditable(false);
		root.setCenter(txtDisplay);
		
		BorderPane bottom = new BorderPane();
		txtInput = new TextField();
		txtInput.setPrefSize(60, 30);
		// setMargin 그냥 생략.
		
		btnConn = new Button("start");
		btnConn.setPrefSize(60, 30);
		btnConn.setOnAction(e->{
			if(btnConn.getText().equals("start")) {
				startClient();
			} else if(btnConn.getText().equals("stop")) {
				stopClient();
			}
			
		});
		
		btnSend = new Button("send");
		btnSend.setPrefSize(60, 30);
		btnSend.setOnAction(e->{
			send(txtInput.getText());
			
		});
		bottom.setCenter(txtInput);
		bottom.setLeft(btnConn);
		bottom.setRight(btnSend);
		root.setBottom(bottom);
		
		Scene scene = new Scene(root);
		// css 생략. scene.getStylesheets();
		primaryStage.setScene(scene);
		primaryStage.setTitle("Client");
		primaryStage.setOnCloseRequest(event->stopClient());
		primaryStage.show();
		
	}
	void displayText(String text) {
		txtDisplay.appendText(text+ "\n");
	}
	//////////
	

	public ClientExample2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}
	
	void startClient() { //연결 코드
		Thread thread = new Thread() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				//super.run();
				try {
					socket = new Socket();
					socket.connect(new InetSocketAddress("localhost", 5001)); // 주소, 포트번호
					Platform.runLater(()->{
						//나중에 awt나 javaFX 메세지 띄우는 메소드 하나 추가 필요.
						System.out.println("server start");
						displayText("conn complete. "+socket.getRemoteSocketAddress());
						btnConn.setText("stop");
						btnSend.setDisable(false);
					});
					
				} catch (Exception e) {
					// TODO: handle exception
					Platform.runLater(()->{
						displayText("server not connected");
						});
					if(!socket.isClosed()) {
						stopClient();
					}
					return;
					
				}
				receive();

			}
			
		};
		thread.start(); //스레드 시작
	}; 
	
	
	void stopClient() {
		try {
			Platform.runLater( ()->{
				displayText("disconnect");
				btnConn.setText("start");
				btnSend.setDisable(true);
				
			});
			if(socket != null && !socket.isClosed()) {
				socket.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	};
	
	void receive() {
		while (true) {
			try {
				byte byteArr[] = new byte[100];
				InputStream inputStream = socket.getInputStream();
				
				//if server make exception?
				int readByteCount = inputStream.read(byteArr);
				
				//if server call close
				if(readByteCount == -1) {
					throw new IOException();
				}
				
				String data = new String(byteArr, 0, readByteCount, "UTF-8");
				
				Platform.runLater(()->{
				    displayText("got it. "+data);
				});	
				
			} catch (Exception e) {
				// TODO: handle exception
				Platform.runLater(()->{
				    displayText("cannot conn to server ");
				});	
				stopClient();
				break;
			}
		}
	};
	
	//message send to server
	void send(String data) {
		// data submit code
		Thread thread = new Thread() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					byte byteArr[] = data.getBytes("UTF-8");
					OutputStream os = socket.getOutputStream();
					os.write(byteArr);
					os.flush();
					Platform.runLater(()->{
						displayText("send success");
					});
				} catch (Exception e) {
					// TODO: handle exception
					try {
						String msg = "can not send: "+socket.getRemoteSocketAddress()+" "+Thread.currentThread().getName();
						Platform.runLater(()->{
							displayText(msg);
						});
						socket.close();
						stopClient();
					} catch (Exception e2) {
						// TODO: handle exception
						e2.printStackTrace();
					}
				}
				
			}
			
		};
		thread.start();
	
	}



}

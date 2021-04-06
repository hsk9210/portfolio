package ex04.userException;

public class UserException extends Exception {
	
	private int port = 772;

	public UserException() {
		// TODO Auto-generated constructor stub
	}

	public UserException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public UserException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public UserException(String arg0, Throwable arg1) {
		//super(arg0, arg1);
		// TODO Auto-generated constructor stub
		super(arg0);
		this.port = port;
	}
	public UserException(String arg0, int arg1) {
		//super(arg0, arg1);
		// TODO Auto-generated constructor stub
		super(arg0);
		this.port = arg1;
	}

	public UserException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}
	public int getPort() {
		return port;
	}

}

package org.hsk9210.auth;

public class User {
	
	private String id;
	private String password;
	
	public User(String id, String password) {
		this.id = id;
		this.password = password;
	}
		
	
	public String getId() {
		return id;
	}

	public boolean matchPassword(String inputPw) {
		// TODO Auto-generated method stub
		return password.equals(inputPw);
	}

	public void changePassword(String oldPw, String newPw) {
		// TODO Auto-generated method stub
		if(matchPassword(oldPw) == false) {
			throw new IllegalArgumentException("illegal password");
		}
		password = newPw;		
	}

}

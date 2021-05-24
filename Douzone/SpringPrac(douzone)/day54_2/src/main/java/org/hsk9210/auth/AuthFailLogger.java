package org.hsk9210.auth;

public class AuthFailLogger {
	private int threshold;
	private int failCounts;
	
	public void insertBadPw(String userId, String inputPw) {
		System.out.println("authfail type: badPw, userId:"+userId+", inputPw: "+inputPw);
		
		failCounts++;
		if(0<threshold && threshold<failCounts) {
			notifyTooManyFail();
			failCounts=0;
		}
		
	}

	private void notifyTooManyFail() {
		// TODO Auto-generated method stub
		System.out.println("너무 많은 로그인 시도 실패");
	}
	public void setThreshold(int threshold) {
		this.threshold=threshold;
	}
	

}

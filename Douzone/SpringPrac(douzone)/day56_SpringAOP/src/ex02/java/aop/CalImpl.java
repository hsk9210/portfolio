package ex02.java.aop;

public class CalImpl implements Icalc {

	@Override
	public int plus(int x, int y) {
		// TODO 보조관심사 || 횡단관심사 (cross-cutting-concern)
		
		int result = x+y;
		
		return result;
	}

	@Override
	public int minus(int x, int y) {
		// TODO Auto-generated method stub
		int result = x-y;
		
		return result;
	}

	@Override
	public int mul(int x, int y) {
		// TODO Auto-generated method stub
		int result = x*y;
		
		return result;
	}

	@Override
	public int div(int x, int y) {
		// TODO Auto-generated method stub
		int result = x/y;
		
		return result;
	}

}

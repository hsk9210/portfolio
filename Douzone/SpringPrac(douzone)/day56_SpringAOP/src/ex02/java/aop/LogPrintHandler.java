package ex02.java.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

public class LogPrintHandler implements InvocationHandler {
	
	private Object target;
	
	public LogPrintHandler(Object target) {
		super();
		this.target = target;
		System.out.println("constructor call: LogPrintHandler");
	}


	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO 보조업무 스타트.
		Log log = LogFactory.getLog(this.getClass());
		StopWatch watch = new StopWatch();
		watch.start();
		log.info("timer start");
		
		//중간지점에 실제 메인 비즈니스를 가진 객체의 함수를 호출.
		int result = (int)method.invoke(this.target, args);
		
		//보조업무 fin해서 결과 제출.
		watch.stop();
		log.info("timer stopped.");
		log.info("[timelog] method: plus. / processing time: "+watch.getTotalTimeSeconds());
		
		
		return result;
	}

}

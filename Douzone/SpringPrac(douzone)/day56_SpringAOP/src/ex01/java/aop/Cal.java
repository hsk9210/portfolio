package ex01.java.aop;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

public class Cal {
	
	//main concern:  calculate
	//sub concern: time to conduct
	
	public int plus(int x, int y) {
		
		Log log = LogFactory.getLog(getClass());
		StopWatch watch = new StopWatch();
		watch.start();
		log.info("timer start");
		
		int result = x+y;
		
		watch.stop();
		log.info("timer stopped.");
		log.info("[timelog] method: plus. / processing time: "+watch.getTotalTimeSeconds());
		
		return result;
	}
	public int div(int x, int y) {
		
		Log log = LogFactory.getLog(getClass());
		StopWatch watch = new StopWatch();
		watch.start();
		log.info("timer start");
		
		int result = x/y;
		
		watch.stop();
		log.info("timer stopped.");
		log.info("[timelog] method: divide. / processing time: "+watch.getTotalTimeSeconds());
		
		return result;
	}
	public int minus(int x, int y) {
		
		Log log = LogFactory.getLog(getClass());
		StopWatch watch = new StopWatch();
		watch.start();
		log.info("timer start");
		
		int result = x-y;
		
		watch.stop();
		log.info("timer stopped.");
		log.info("[timelog] method: minus. / processing time: "+watch.getTotalTimeSeconds());
		
		return result;
	}
	public int mul(int x, int y) {
		
		Log log = LogFactory.getLog(getClass());
		StopWatch watch = new StopWatch();
		watch.start();
		log.info("timer start");
		
		int result = x*y;
		
		watch.stop();
		log.info("timer stopped.");
		log.info("[timelog] method: multiple. / processing time: "+watch.getTotalTimeSeconds());
		
		return result;
	}

}

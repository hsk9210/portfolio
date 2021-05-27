package ex03.Spring.aop;

import java.lang.reflect.Proxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Icalc cal = new CalImpl();
//		LogPrintHandler handler = new LogPrintHandler(cal);
		//가짜를 생성(Proxy 객체 생성)
//		Icalc proxy = (Icalc)Proxy.newProxyInstance(
//				cal.getClass().getClassLoader(), //클래스를 찾는 코드. 클래스로더
//				cal.getClass().getInterfaces(), //인터페이스를 찾는 코드. 행위정보
//				handler); //해당 이벤트 핸들러 h.
//		
//		System.out.println(proxy.plus(3, 5));
		String resourceLocations = "ex03/Spring/aop/appContext.xml";
		ApplicationContext context=  new GenericXmlApplicationContext(resourceLocations);
		Icalc proxyCal = (Icalc) context.getBean("proxy");
		System.out.println(proxyCal.mul(5, 4));

	}

}

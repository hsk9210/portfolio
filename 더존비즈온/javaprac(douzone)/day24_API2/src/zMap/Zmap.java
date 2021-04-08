package zMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

public class Zmap {

	public Zmap() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, SmartPhone> hMap = new HashMap<>();
		
		for(int i=0;i<7;i++) {
			SmartPhone p1 = new SmartPhone(i+"","000-0000-000"+i);
			hMap.put(p1.getPhoneNumber(), p1);
		}

		//Map은 collection 인터페이스가 아님. 사용불가.
		//Collections.sort();
		Set set1 = hMap.entrySet();
		Iterator it = set1.iterator();
		while (it.hasNext()) {
			Map.Entry e = (Map.Entry) it.next();
			System.out.println(e.getKey()+" "+e.getValue());
			
		}
		
//		Set keySet = hMap.keySet();
//		
//		Iterator itr = keySet.iterator();
		
//		while(itr.hasNext()) {
//			String k = (String) itr.next();
//			System.out.println(( hMap.get(k)).getName());
//			System.out.println(( hMap.get(k)).getPhoneNumber());
//			System.out.println(hMap.get(k));
//			System.out.println(hMap.get(k));
//		}

	}

}

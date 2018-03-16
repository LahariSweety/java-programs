package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;

public class LinkedMap {

	public static void main(String[] args) {
		LinkedHashMap hm= new LinkedHashMap();
		hm.put("name", "lahari");
		hm.put("age",22);
		hm.put("desgination", "software engineer");
		hm.put("area","hitech city");
		hm.put("city", "hyderabad");
		System.out.println(hm);
		System.out.println("by using entry set");
		Set e=hm.entrySet();
		Iterator itr=e.iterator();
		while(itr.hasNext())
		{
			Entry e1=(Entry)itr.next();
			System.out.println(e1.getKey()+""+e1.getValue());
			System.out.println("by using key set");
			Set keys=hm .keySet();
			for(Object key:keys)
			{
				System.out.println(key+":"+hm.get(key));
			}
		}
		}
		
		
		
	

	}



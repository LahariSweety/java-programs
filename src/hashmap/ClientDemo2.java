package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class ClientDemo2 {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put(new Customer(13,"lahari",110005), new Employee(15,"ram",10009000));
		System.out.println(hm);
		System.out.println("by using entry set");
		Set e=hm.entrySet();
		Iterator itr=e.iterator();
		while(itr.hasNext())
		{
			Entry e1=(Entry)itr.next();
			System.out.println(e1.getKey()+""+e1.getValue());
		}
	}

}

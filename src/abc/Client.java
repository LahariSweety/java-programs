package abc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;



public class Client {

	public static void main(String[] args) {
		
		ArrayList ts=new ArrayList();
		ts.add(new Customer(12,"lahari",60 ));
		ts.add(new Customer(11,"lahari",50));
		ts.add(new Customer(10,"sathish",30 ));
		ts.add(new Customer(15,"ram",35 ));
		Collections.sort(ts);
		Iterator itr=ts.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}

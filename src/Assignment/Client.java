package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Client {

	public static void main(String[] args) {
		ArrayList ts=new ArrayList();
		ts.add(new Cutomer(12,"lahari",60));
		ts.add(new Cutomer(11,"lahari",50));
		ts.add(new Cutomer(10,"ajith",30));
		ts.add(new Cutomer(15,"ram",35));
		Collections.sort(ts,new CheckComparator());
		Iterator itr=ts.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	}
		

package setbasic;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		TreeSet ts = new TreeSet();
		
		ts.add(new Customer (1,"revanth",23));
		ts.add(new Customer (3,"lahari",23));
		ts.add(new Customer(4,"muzeeb",40));
		ts.add(new Customer(9,"satish",50));
		ts.add(new Customer(10,"anudeep",45));
		
		
		System.out.println(ts);
	}

}

package basic;

import java.util.LinkedHashSet;

public class LinkedHashSetClass {

	public static void main(String[] args) {

		LinkedHashSet al = new LinkedHashSet();
		al.add(new Integer(10));
		al.add(new Integer(20));
		al.add(new Integer(30));
		al.add(new Integer(40));
		al.add(new Integer(40));
		al.add(new String("abc"));
		al.add(new Float(40.12));
		al.add(new Float(40.12));

		al.add(null);
		al.add(null);
		System.out.println(al);
		/*
		for(Object x: al) {
			System.out.println(x.toString());
		}*/
	}

}

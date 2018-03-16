package enumration2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class Clent {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("jhshukuhx");
		al.add("suiqe2yedhnw");
		al.add("uhyfewiul7r");
		al.add("ftie7tfweq98d");
		Enumeration<String> e=Collections.enumeration(al);
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

	}

}

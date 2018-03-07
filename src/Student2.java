import java.util.Comparator;

public class Student2 implements Comparator<Customer>{

	
	public int compare(Customer o1, Customer o2) {
		
		return o1.getName().compareTo(o2.getName());
	}
	

}

import java.util.Comparator;

public class Student implements Comparator<Customer> {
	

	@Override
	public int compare(Customer o1, Customer o2) {
		
		return o1.rollno-o2.rollno;
	}
	

}

import java.util.Comparator;
import java.util.NavigableMap;
import java.util.TreeSet;

public class NewStudent {

	public static void main(String[] args) {
		TreeSet set=new TreeSet(new Student2());
		set.add(new Customer(1,"lahari",13));
		set.add(new Customer(2,"ram",15));
		set.add(new Customer(5,"ajith",24));
System.out.println(set);
	}

}

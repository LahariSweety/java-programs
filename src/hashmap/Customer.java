package hashmap;

public class Customer {
	int rollno;
	String name;
	int id;
	@Override
	public String toString() {
		return "Customer [rollno=" + rollno + ", name=" + name + ", id=" + id + "]";
	}
	public Customer(int rollno, String name, int id) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.id = id;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	


}

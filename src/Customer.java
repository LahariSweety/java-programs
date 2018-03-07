
public class Customer{
	int id;
	String name;
	int rollno;
	public Customer(int id,String name,int rollno) {
		this.id=id;
		this.name=name;
		this.rollno=rollno;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String toString() {
	return this.id+""+this.name+""+this.rollno;
	}
	
	
	}


package abc;

public class Customer implements Comparable<Customer> {
	Integer id;
	String name;
	Integer sal;
	
	
	public Customer(Integer id, String name, Integer sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}


	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getSal() {
		return sal;
	}


	public void setSal(Integer sal) {
		this.sal = sal;
	}


	@Override
	public int compareTo(Customer o) {
		if(this.getName().equals(o.getName()))
		{
			return this.getSal().compareTo(o.getSal());
			
		}
		return this.getName().compareTo(o.getName());	
		
		
			
}




}




package setbasic;

public class Customer implements Comparable<Customer>{
	
	private Integer accNo;
	private String name;
	private Integer age;
	
	
	public Customer(Integer accNo, String name, Integer age) {
		this.accNo = accNo;
		this.name = name;
		this.age = age;
	}
	public Integer getAccNo() {
		return accNo;
	}
	public void setAccNo(Integer accNo) {
		this.accNo = accNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public int compareTo(Customer c ) {
		
	
		
		int nameCompare = this.name.compareTo(c.getName());
		
		return nameCompare;
	}
	@Override
	public String toString() {
		return "Customer [accNo=" + accNo + ", name=" + name + ", age=" + age + "]";
	}
	
	

}

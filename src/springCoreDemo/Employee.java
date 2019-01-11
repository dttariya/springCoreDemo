package springCoreDemo;

//Bean or Model or POJO (Plain old java object)
//Such a class has only attributes & methods.No business logic
public class Employee {
	
	//Attributes
	int eid;
	String ename;
	Address address;
	
	
	//Methods
	//default Constructor
	public Employee() {
		System.out.println("----EMployee object constructed----");
	}
	
	
	//Constructor Injection
	public Employee(Address address) {
		this.address=address;
	}
	
	//getter and setters
		
	  public int getEid() {
		return eid;
	}
public void setEid(int eid) {
		this.eid = eid;
	}

public String getEname() {
		return ename;
	}

public void setEname(String ename) {
		this.ename = ename;
	}
public Address getAddress() {
		return address;
	}


//setter Injection
	public void setAddress(Address address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", address=" + address + "]";
	}

    //Bean Life cycle
	public void myInit() {
	System.out.println("--Object Initilized--");
	}
	
	public void myDestroy() {
	System.out.println("--Object Destroyed--");
	}
	}



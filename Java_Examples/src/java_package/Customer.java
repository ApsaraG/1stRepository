package java_package;

// Create a Class
public class Customer {

	
	// Attributes of class below: -
	String name; 
	String sex;
	String address;
	int fee;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		//Create customer 1 (object)
		Customer john = new Customer();
		john.name = "John";
		john.sex = "Male";
		john.address = "Virginia";
		john.fee = 50;		
		
		//Create customer 2 (object)
		Customer jane = new Customer();
		jane.name = "Jane";
		jane.sex = "Female";
		jane.address = "Maryland";
		jane.fee = 100;	
		
		//Print customer 1
		System.out.println("Customer 1 Name: " + john.name);
		System.out.println("Customer 1 Sex: " + john.sex);
		System.out.println("Customer 1 Address: " + john.address);
		System.out.println("Customer 1 Fee: " + john.fee);
		
		//Print customer 2
		System.out.println("Customer 2 Name: " + jane.name);
		System.out.println("Customer 2 Sex: " + jane.sex);
		System.out.println("Customer 2 Address: " + jane.address);
		System.out.println("Customer 2 Fee: " + jane.fee);
		
		
		
		
		
		
	}

}

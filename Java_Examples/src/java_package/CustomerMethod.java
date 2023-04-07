package java_package;

public class CustomerMethod {
	
	// attributes of Customer2 (Class)
	
	String name;
	String address;
	int ssn;
	int fee_amount;
	
	void fee_paid_amount(int fee) 
	{
		System.out.println("Your Fee is $" + fee);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Customer 1 (object)
		CustomerMethod regina = new CustomerMethod();
		regina.name = "Regina";
		regina.address = "41 St James";
		regina.ssn = 5350;
		regina.fee_amount = 50;
		
		// Customer 2 (object)
		CustomerMethod fidelis = new CustomerMethod();
		fidelis.name = "Fidelis";
		fidelis.address = "62 St James";
		fidelis.ssn = 5550;
		fidelis.fee_amount = 60;
	
		// Perform Task
		
		regina.fee_paid_amount(50);
		fidelis.fee_paid_amount(60);
	}

}

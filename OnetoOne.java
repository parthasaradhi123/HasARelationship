
public class OnetoOne {

	public static void main(String[] args) 
	{
		Account account = new Account("ABC123","Sachin","Savings");
		
		Employee e = new Employee(10,"Sachin","MI",account);
		
		e.getEmployeeDetails();
	}

}

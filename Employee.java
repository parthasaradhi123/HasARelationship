public class Employee 
{
	Integer id;
	String eName;
	String eAddr;
	
	Account account;
	
    Employee(Integer id,String eName, String eAddr,Account account)
    {
    	this.id = id;
    	this.eName = eName;
    	this.eAddr = eAddr;
    	this.account = account;
    }
	
    public void getEmployeeDetails()
    {
    	System.out.println("Enter the Employee Details :--- ");
    	System.out.println("Enployee id is :: "+ id);
    	System.out.println("Employee eName is :: "+eName);
    	System.out.println("Employee eAddr is :: "+eAddr);
    	System.out.println("=====================================");
    	System.out.println("Enter the Account details :---");
    	System.out.println("The Employee Account number is :: "+account.accNo);
    	System.out.println("The Employee Account Name is :: "+account.accName);
    	System.out.println("The Employee Account Type is :: "+account.accType);
    	
    }
}

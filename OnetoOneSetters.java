class Account1
{
	String accNo;
	String accName;
	String accType;
	
	
	
	public void setAccNo(String accNo)
	{
		this.accNo = accNo;
	}
	public void setAccName(String accName)
	{
		this.accName = accName;
	}
	public void setAcctType(String accType)
	{
		this.accType = accType;
	}
	
	
	/**
	 * Build by partha
	 * 
	 *
	 * 
	 * 
	 * */
	
}

class Employee1
{
	Integer id;
	String eName;
	String eAddr;
	Account1 account;
	
	
	public void setId(Integer id)
	{
		this.id = id;
	}
	public void setEname(String eName)
	{
		this.eName = eName;
	}
	public void setEaddr(String eAddr)
	{
		this.eAddr = eAddr;
	}
	public void setAccount(Account1 account)
	{
		this.account = account;
	}
	
	public void getId()
	{
		System.out.println(id);
	}
	public void getEname()
	{
		System.out.println(eName);
	}
	public void getEaddr()
	{
		System.out.println(eAddr);
	}
//	public void getAccount()
//	{
//		System.out.println(account);
//	}
	
	public void getAccNo()
	{
		System.out.println(account.accNo);
	}
	public void getAccName()
	{
		System.out.println(account.accName);
	}
	public void getAccType()
	{
		System.out.println(account.accType);
	}
	
	 
}





public class OnetoOneSetters {

	public static void main(String[] args)
	{
		Account1 account = new Account1();
		Employee1 e = new Employee1();
		
		
		e.setId(10);
		e.setEname("Sachin");
		e.setEaddr("MI");
		e.setAccount(account);
		
		account.setAccNo("ABC10");
		account.setAccName("Sachin");
		account.setAcctType("Savings");
  
		System.out.println("Employee Details :--");
		e.getId();
		e.getAccName();
		e.getEaddr();
		System.out.println("===================================");
		 System.out.println("Employee Account details");
		e.getAccNo();
		e.getAccName();
		e.getAccType();
		

	}

}

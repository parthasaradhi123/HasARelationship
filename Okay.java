class Partha
{
	String name;
	Integer  age;
	Float marks;
	
	Partha(String name, Integer age, Float marks)
	{
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	
//	public void setName(String name)
//	{ 
//		this.name = name;
//	}
//	
//	public void setAge( Integer age)
//	{
//		this.age  = age;
//	}
//	public void setMarks(Float marks)
//	{
//		this.marks = marks;
//	}
}


class Partha1
{
	Integer id;
	String branch;
	String loc;
	
	Partha p;
	//Partha p = new Partha(); //:--> Use this Approach to establish a HAS-A Relationship when you are using setter
	                           // and getters if you are using constructor then it will ask you to pass values here it self
	                           // its upto you.
	
	Partha1(Integer id,String branch,String loc, Partha p)
	{	this.id =id;
		this.branch = branch;
		this.loc = loc;
		this.p = p;
		
		
	
	}
	
	 public void getData()
	 {
		 System.out.println(p.name);
		 System.out.println(p.age);
		 System.out.println(p.marks);
		 System.out.println("=================================");
		 System.out.println(id);
		 System.out.println(branch);
		 System.out.println(loc);
		 
	 }
	
}





public class Okay {

	public static void main(String[] args) 
	{
		Partha p = new Partha("partha",24,99.9f);
		
		Partha1 pa = new Partha1(7020,"CSE","CHENNAI",p);
		
		pa.getData();
		
	}

}

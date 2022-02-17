package encapsulation;

public class Employee 
{
	private String name;
	private int empid;
	private int age;
	public String getName()
	{
		return this.name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getEmpid()
	{
		return empid;
	}
	public void setEmpid(int empid)
	{
		this.empid=empid;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	

}

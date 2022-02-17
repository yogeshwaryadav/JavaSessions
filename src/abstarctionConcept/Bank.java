package abstarctionConcept;

public abstract class Bank 
{
	public void loan()
	{
		System.out.println("Loan method");
	}
	Bank()
	{
		System.out.println("Abstarct class constructor");
	}
}
class SBI extends Bank
{
	public void loan()
	{
		System.out.println("Loan method");
	}
	public void insurance()
	{
		System.out.println("Insureance method");
	}
	
}

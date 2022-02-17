package exceptionhandling;

public class Exceptionhandling 
{
	public static void m1()
	{
		System.out.println("Hello");
		try {
		int i=10/0;
		System.out.println("Hello again");
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("AIE exception");
			e.printStackTrace();
		}
		catch(Exception e)
		{
			System.out.println("Wrong code");
		}
		catch(Throwable e)
		{
			System.out.println("Wrong code");
		}
		System.out.println("Bye");
		
		
		
	}

	public static void main(String[] args) 
	{
		
		m1();
	}

}

package exceptionhandling;

public class ThrowKeyword extends Exception
{
	public static void getData(String excel) throws ThrowKeyword
	{
		if(excel==null)
		{
			throw new ArithmeticException("File not found");
		}
		
	}

	public static void main(String[] args) throws ArithmeticException, ThrowKeyword
	{
		try {
		getData(null);
		}
		finally 
		{
			System.out.println("finally block is always executed");
		}
		}

	}



package exceptionhandling;

public class ThrowsKeywordConcept {

	public static void main(String[] args) {
		
		vote(5);
	}
	public static void vote(int age)
	{
		if(age>=18)
		{
			System.out.println("Hello buddy,Cast your vote");
		}
		else
		{try {
			throw new Exception("Sorry kid");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		}
	}

}

package inheritance;

public class BMW extends Car
{	
	@Override
	public void start()
	{
		System.out.println("BMW start method");
	}
	public BMW autoParking()
	{
		System.out.println("BMW autoparking method");
		return this;
	}
	public static void price()
	{
		System.out.println("BMW price method");
	}

}

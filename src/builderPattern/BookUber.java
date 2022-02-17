package builderPattern;

public class BookUber 
{
	public BookUber login()
	{
		System.out.println("login to app");
		return this;
	}
	public BookUber login(String uname,String pwd)
	{
		System.out.println("login to app"+uname+" "+pwd);
		return this;
	}
	public BookUber selectDestination(String startPoint,String endPoint)
	{
		System.out.println("Select the destination "+startPoint+" to "+endPoint);
		return this;
	}
	public BookUber selectCar(String carname)
	{
		System.out.println("Select the car:"+carname);
		return this;
	}
	public BookUber startRide()
	{
		System.out.println("Ride started");
		return this;
	}
	public BookUber stopRide()
	{
		System.out.println("Reached destination");
		return this;
	}
	public BookUber logout()
	{
		System.out.println("logged out");
		return this;
	}

}

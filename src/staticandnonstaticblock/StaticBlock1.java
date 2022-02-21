package staticandnonstaticblock;

public class StaticBlock1 
{
	static final int  age =20;
	static
	{
	System.out.println("static block ");
	
	}
	static
	{
	System.out.println("static block2 ");
	}
	public static void test()
	{
		System.out.println("static method");
	}
	

}

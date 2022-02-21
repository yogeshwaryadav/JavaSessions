package staticandnonstaticblock;

public class TestStaticBlock1 
{
	public String TestStaticBlock1()
	{
		System.out.println("Hello");
		return "Hello";
	}
	public TestStaticBlock1()
	{
		System.out.println("Hello1");
		
	}

	public static void main(String[] args) {
		System.out.println(StaticBlock1.age);
		new TestStaticBlock1();

	}

}

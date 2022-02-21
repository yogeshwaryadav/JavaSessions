package programs;

public class StaticVariable 
{
	static int a=10;
	int b=50;
	public void print()
	{
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) throws ArithmeticException,NullPointerException
	{
		// TODO Auto-generated method stub
		a=20;
		
		
		StaticVariable s=new StaticVariable();
		s.b=30;
		s.print();
		StaticVariable s1=new StaticVariable();
		s1.print();
		
	}

}

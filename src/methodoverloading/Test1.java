package methodoverloading;

public class Test1 {

	public static void foo(int a,long b)
	{
		System.out.println("int data type method is called");
	}
	public static void foo(long a,int b)
	{
		System.out.println("long data type method is called");
	}
	public static void main(String[] args) 
	{
		Test1 t1=new Test1();
		t1.foo(10, 12l);
		t1.foo(10l, 12);
//		t1.foo(12,121);
//		Test1.foo(10, 100);
		Test1.foo(10, 20l);
		
		
		

	}

}

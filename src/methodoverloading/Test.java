package methodoverloading;

public class Test 
{
	public void show(int a)
	{
		System.out.println("Integer type method is called "+a);
	}
	public void show(byte b)
	{
		System.out.println("Byte type method is called "+b);
	}
	public void show(long c)
	{
		System.out.println("Long type method is called "+c);
	}
	public void show(String s)
	{
		System.out.println(s);
	}

	public static void main(String[] args) 
	{
		Byte b=20;
		Test t=new Test();
		t.show(25);
		t.show(140);
		t.show('0');
		t.show("Yogesh");
		t.show(b);

	}

}

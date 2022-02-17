package staticandnonstaticblock;

public class InitlizeBlock 
{
	static int age;
	{
		System.out.println("init 1");
		age=20;
	}
	{
		System.out.println("init 2");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InitlizeBlock i1=new InitlizeBlock();
		System.out.println(i1.age);

	}

}

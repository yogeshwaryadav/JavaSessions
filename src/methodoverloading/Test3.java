package methodoverloading;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=125;
		int n=125;
		int digit=0;
		
		while(n>0)
		{
			int rem=n%10;
			digit=digit*10+rem;
			n=n/10;
			
		}
		System.out.println(digit);

	}

}

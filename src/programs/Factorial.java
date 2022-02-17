package programs;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact=factorial(5);
		System.out.println(fact);
		System.out.println(factorial1(6));

	}

	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * (factorial(n - 1));
		}
	}

	public static int factorial1(int n)
	{
	int fact=1;
	if(n==0)
	return 1;
	while(n !=0)
	{
	fact=fact * n;
	n--;
	}
	return fact;
	}
}



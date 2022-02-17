package programs;

public class PalindomeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isPalindrome(1);
	}
	public static void isPalindrome(int number)
	{
		int rem=0;
		int temp=number;
		while(temp > 0)
		{
			int lastDigit=temp % 10;
			rem=rem * 10+lastDigit;
			temp=temp / 10;
		}
		if(rem==number)
		{
			System.out.println("Number is palindrome:"+number);
		}
		else
		{
			System.out.println("Number is not palindrome:"+number);
		}
	}

}

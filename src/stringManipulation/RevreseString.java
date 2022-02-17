package stringManipulation;

public class RevreseString 
{
	
	public void reverseString(String str)
	{
		char ch;
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			ch=str.charAt(i);
			rev=rev + ch;
		}
		System.out.println("Original string :"+str);
		System.out.println("Reverse string :"+rev);
		
	}

}

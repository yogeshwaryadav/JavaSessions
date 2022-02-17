package stringManipulation;

public class ReverseStringUsingCharArray 
{
	public void reverseString(String str)
	{
		char [] c=str.toCharArray();
		String rev="";
		for(int i=(c.length)-1;i>=0;i--)
		{
			//char ch=c[i];
			rev+= c[i];
		}
		System.out.println("Original string :"+str);
		System.out.println("Reverse string :"+rev);
		
	}
	
	

}

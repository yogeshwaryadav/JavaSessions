package programs;

import java.util.Arrays;

public class AnagramUsingArray 
{
	public static boolean isAnagram(String s1,String s2)
	{
		String s3=s1.replaceAll("\\s", "");
		String s4=s2.replaceAll("\\s", "");
		char []c1=s3.toLowerCase().toCharArray();
		char []c2=s4.toLowerCase().toCharArray();
		if(c1.length !=c2.length)
		{
			return false;
		}
		else
		{
			Arrays.sort(c1);
			Arrays.sort(c2);
			if(Arrays.equals(c1, c2))
			{
				return true;
			}
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println(isAnagram("CAT","ACy"));

	}

}

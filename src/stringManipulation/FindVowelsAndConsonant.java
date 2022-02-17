package stringManipulation;

public class FindVowelsAndConsonant 
{
	public void findVowelAndConsonant(String str)
	{
		int vcount =0;
		int ccount =0;
		for(int i=0;i<str.length();i++)
		{	
			
			char c=str.charAt(i);
			if(c=='a' || c=='e' ||c=='i' || c=='o' || c=='u')
			{
				vcount ++;
				System.out.println("Vowels " +c);
			}else
			{
				ccount ++;
				System.out.println("Consonant "+c);
			}
			
		}
		System.out.println("Number of vowels :"+vcount);
		System.out.println("Number of Consonant :"+ccount);
		
	}

}

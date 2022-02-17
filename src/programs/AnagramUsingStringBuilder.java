package programs;

public class AnagramUsingStringBuilder 
{
	public static boolean isAnagram(String s1,String s2)
	{
		String s3=s1.replaceAll("\\s", "");
		String s4=s2.replaceAll("\\s", "");
		StringBuilder sb=new StringBuilder(s4);
		char []c1=s3.toCharArray();
		for(char c:c1)
		{
			int index=sb.indexOf(""+c);
			if( index!=-1)
			{
				sb.deleteCharAt(index);
				return true;
			}
			return false;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isAnagram("CAT","ACT"));

	}

}

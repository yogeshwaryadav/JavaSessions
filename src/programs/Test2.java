package programs;

public class Test2 
{
	

	public static void main(String[] args) {
		String str="Hello";
		char [] ch=str.toCharArray();
		int count;
		for(int i=0;i<ch.length;i++)
		{
			count=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i] == ch[j] && ch[j] !=' ')
				{
					count ++;
					ch[j] = '0';
				}
			}
			if(count > 1 && ch[i] !='0')
			{
				System.out.println(ch[i]);
			}
		}

	}

}

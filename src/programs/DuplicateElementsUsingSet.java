package programs;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsUsingSet {

	public static void main(String[] args) {
		
		String [] str= {"yogesh","pankaj","yogesh"};
		Set<String> set=new HashSet<String>();
		int count=0;
		for(String s:str)
		{
			if(set.add(s)==false)
			{
				System.out.println(s);
			}
			
		}

	}

}

package hashMapConcept;

import java.util.HashMap;
import java.util.Map.Entry;

public class DuplicateElements {

	public static void main(String[] args) 
	{
		String[] str= {"Yogesh","Naveen","Rahul","Yogesh"};
		
		HashMap<String,Integer> hm=new HashMap<>();
		
		for(int i=0;i<str.length;i++)
		{
			if(hm.containsKey(str[i]))
			{
				hm.put(str[i], hm.get(str[i])+1);
			}
			else
			{
				hm.put(str[i], 1);
			}

		}
		for(Entry<String,Integer>entry:hm.entrySet())
		{
			if(entry.getValue() > 1)
			{
				System.out.println(entry.getKey());
			}
		}
		
		String str1="Yogeshwar Yadav";
		HashMap<Character,Integer> hm1=new HashMap<>();
		int count=1;
		for(int i=0;i<str1.length();i++)
		{
			char c=str1.charAt(i);
			if(hm1.containsKey(c))
			{
				hm1.put(c, count+1);
			}
			else
			{
				hm1.put(c, count);
			}
		}
		System.out.println(hm1);
		for(Entry<Character,Integer>entry:hm1.entrySet())
		{
			if(entry.getValue() > 1)
			{
				System.out.println(entry.getKey());
			}
		}
		
	}

}

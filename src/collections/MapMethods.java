package collections;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapMethods {

	public static void main(String[] args) {
		
		String str="Hello";
		Map<Character,Integer> map=new HashMap<>();
		char ch[]=str.toCharArray();
		int count=1;
		for(int i=0;i<ch.length;i++)
		{
			if(map.containsKey(ch[i]))
			{
				map.put(ch[i], count+1);
			}
			else
			{
				map.put(ch[i], count);
			}
		}
		for(Entry<Character,Integer>e:map.entrySet())
		{
			if(e.getValue()>1)
			{
				System.out.println(e.getKey()+"--->"+e.getValue());
			}
		}
		

	}

}

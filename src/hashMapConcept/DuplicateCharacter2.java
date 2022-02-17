package hashMapConcept;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class DuplicateCharacter2 {

	public static void main(String[] args) {
		HashSet<Integer>set=new HashSet<Integer>();
		set.add(null);
		set.add(1);
		System.out.println("HashSet "+set);
		Hashtable<Integer,String>ht=new Hashtable<Integer,String>();
		ht.put(1, "A");
		ht.put(2, "B");
		System.out.println("HashTable "+ht);
		TreeMap<Integer,String>tmap=new TreeMap<Integer,String>();
		tmap.put(1, "A");
		tmap.put(2, null);
		tmap.put(3, null);
		System.out.println("TreeMap "+tmap);
		TreeSet<String>tset=new TreeSet<String>();
		tset.add("A");
		tset.add("B");
		System.out.println("TreeSet "+tset);
		
		//printDupliacteCharacter("HellooH");

	}
	
	public static void printDupliacteCharacter(String str)
	{
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		char ch[]=str.toCharArray();
		for(char c:ch)
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c, 1);
			}
		}
//		for(Map.Entry<Character,Integer>entry:map.entrySet())
//		{
//			if(entry.getValue()>1)
//			{
//			System.out.println(entry.getKey()+"-->"+entry.getValue());
//			}
//		}
//		map.forEach((K,V) ->System.out.println(K+":"+V));
//		Iterator<Entry<Character, Integer>> entry = map.entrySet().iterator();
//		while(entry.hasNext())
//		{
//			Entry<Character, Integer> e = entry.next();
//			System.out.println(e.getKey()+":"+e.getValue());
//		}
		System.out.println(map);
	}

}

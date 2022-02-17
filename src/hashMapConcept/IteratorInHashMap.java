package hashMapConcept;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class IteratorInHashMap {

	public static void main(String[] args) {
		
		Map<Integer,String> map=new HashMap<Integer,String>();
		
		map.put(1, "A");
		map.put(2, "B");
		map.put(-1, "C");
		
//		Iterator<Entry<Integer, String>> entry = map.entrySet().iterator();
//		while(entry.hasNext())
//		{
//			System.out.println(entry.next());
//		}
		
		for(Map.Entry<Integer,String>entry:map.entrySet())
		{
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		map.forEach((K,V) -> System.out.println(K+" :"+V));

	}

	

}

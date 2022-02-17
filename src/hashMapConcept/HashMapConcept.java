package hashMapConcept;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapConcept {

	public static void main(String[] args) {
		/**
		 * HashMap is a class which implements the Map interface
		 * HashMap extends the AbstarctMap class
		 * HashMap stores the element based on key,value<K,V>pair
		 * HashMap contains only unique elements
		 * HashMap can contains only one null key but can contains multiple null vales
		 * HashMap does not stores the elements based on index,it uses hashing concept
		 * HashMap is unsynchronized means it is not thread safe
		 */
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "Yogesh");
		hm.put(2, "Supriya");
		hm.put(3, "Madhu");
		hm.put(1, "prakash");
		hm.put(null, null);
		hm.put(null, "Abhishek");
		System.out.println(hm);
		
		Iterator <Integer>itr=hm.keySet().iterator();
		while(itr.hasNext())
		{
			Integer key = itr.next();
			String value=hm.get(key);
			System.out.println(value);
		}
		
		Iterator <Map.Entry<Integer,String>>itr1=hm.entrySet().iterator();
		while(itr1.hasNext())
		{
			Entry<Integer,String> entry= itr1.next();
			System.out.println("key-->"+entry.getKey()+":value-->"+entry.getValue());
			
		}
		
		for(Entry<Integer,String>entry:hm.entrySet())
		{
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		Set<Entry<Integer, String>> e1 = hm.entrySet();
	}

}

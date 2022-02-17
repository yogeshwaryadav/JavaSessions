package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		//iterate the arraylist using interator
		
		Iterator<String> index = list.iterator();
		while(index.hasNext())
		{
			System.out.println(index.next());
		}


	}

}

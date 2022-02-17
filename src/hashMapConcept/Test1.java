package hashMapConcept;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Test1 {

	public static void main(String[] args) {
		Map<String,Employee> map=new HashMap<>();
		Employee e1=new Employee("yogesh",30,1);
		Employee e2=new Employee("praveen",31,2);
		Employee e3=new Employee("karthik",29,3);
		
		map.put("Emp1", e1);
		map.put("Emp2", e2);
		map.put("Emp3", e3);
		
		
		for(Entry<String,Employee> entry:map.entrySet())
		{
			String key=entry.getKey();
			Employee e=entry.getValue();
			System.out.println(key+" Info"+" "+e.name+" "+e.age+" "+e.empid);
		}

	}

}

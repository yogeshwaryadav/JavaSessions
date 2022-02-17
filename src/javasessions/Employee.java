package javasessions;

public class Employee 
{
	String name;
	int age;
	Double salary;

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.name="Ram";
		e1.age=30;
		e1.salary=12.33;
		
		Employee e2=new Employee();
		e2.name="Shikha";
		e2.age=25;
		e2.salary=32.33;
		
		Employee e3=new Employee();
		e3.name="Kate";
		e3.age=27;
		e3.salary=72.33;
		
		e1=e2;
		e2=e3;
		e3=e1;
		
		System.out.println(e1.name + " "+e1.age+" "+e1.salary);
		
		System.out.println(e2.name + " "+e2.age+" "+e2.salary);
		
		System.out.println(e3.name + " "+e3.age+" "+e3.salary);

	}

}

package javasessions;

public class Car 
{
	String name;
	double price;
	String model;
	String color;
	char series;

	public static void main(String[] args) 
	{
		/* we cannot access class/global variable directly.We have to create object to
		access the class variable
		*/ 
		//System.out.println(name);
		Car c=new Car();//Here new Car() is the object and C is the reference to object
		c.name = "BMW";
		c.price = 70;
		c.color = "Black";
		c.model = "520d";
		c.series='A';
		System.out.println(c.name + " " +c.price + " " +c.model + " " +c.color + " "+c.series);
		
		Car c1=new Car();
		System.out.println(c1.name + " " +c1.price + " " +c1.model + " " +c1.color + " "+c1.series);
	}

}

package inheritance;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
		c.name="c10";
		System.out.println(c.name);
		System.out.println(Car.wheels);
		c.start();
		c.stop();
		c.refuel();
		Car.price();
		
		System.out.println("--------");
		BMW b=new BMW();
		b.start();
		b.autoParking();
		b.stop();
		System.out.println(b.name);
		Car.price();
		
		System.out.println("*******************");
		Car c1=new BMW();
		c1.refuel();
		c1.start();
		c1.stop();
		
	
		

	}

}

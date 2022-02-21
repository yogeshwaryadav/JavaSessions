package encapsulation;

public class TestStudent {

	public static void main(String[] args) {
		Student s=new Student();
		System.out.println(s.getName());
		s.setName("yogesh");
		System.out.println(s.getName());
		
		System.out.println(s.getAge());
		s.setAge(30);
		System.out.println(s.getName());


	}

}

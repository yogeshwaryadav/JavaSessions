package encapsulation;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1=new Employee();
		e1.setName("yogesh");
		e1.setEmpid(21);
		e1.setAge(30);
		System.out.println("name:"+e1.getName()+" age:"+e1.getAge()+ " empid:"+e1.getEmpid());

	}

}

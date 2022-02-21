package programs;

public class AddArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a[]= {1,2,3,4};
	AddArray.add(a);

	}
	public static void add(int a[])
	{
		int sum=0;
		
		for(int i=0;i<a.length-1;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
	}
}

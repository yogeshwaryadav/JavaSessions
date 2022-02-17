package javasessions;

public class MaxNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4,3,5,1,6};
		int max=a[0];
		int min=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
			else
			{
				min=a[i];
			}
			
		}

		System.out.println(max);
		System.out.println(min);

	}

}

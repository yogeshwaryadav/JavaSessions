package arrays;

public class Test1 {

	public static void main(String[] args) {
		
		int [][]a= {{1,2,3},{4,5},{6,7,8,9}};
		System.out.println(a);
		System.out.println(a[0]);
		//System.out.println(a[3]);
		for(int []arr:a)
		{
		
			for(int ar:arr)
			{
				System.out.print(ar);
			}
		}

	}

}

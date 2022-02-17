package arrays;

public class FindtheElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr=new int[]{1,4,5,7,3,6};
		int l=arr[0];
		int r=arr[arr.length-1];
		int sum=0;
		int num=10;
		for(int i=l;i<r;i++)
		{
			if(num==l+r)
			{
				System.out.println("Sum of "+l+" +"+r+"=="+num);
			}
			
			if(l<r)
			{
				l++;
				sum=arr[i];
			}
			else
			{
				r--;
				sum=arr[i];
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

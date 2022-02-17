package programs;

import java.util.Arrays;

public class SumofTwoElementsInsideArray {

	public static void main(String[] args) 
	{
		int target=10;
		int num[]= {1,5,3,7,2,4,6};
		int l=0;
		int r=num.length-1;
		Arrays.sort(num);
		while(l<r)
		{
			if(num[l] + num[r] == target)
			{
				System.out.println("Sum of "+num[l]+" and "+num[r]+" are equal to "+target);
				return ;
			}
			else
			{
				if(num[l] + num[r] <target)
				{
					l++;
				}
				else
				{
					r--;
				}
			}
		}

	}

}

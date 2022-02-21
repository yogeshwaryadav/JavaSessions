package arrays;

import java.util.ArrayList;

public class ReturnIndexIfSumEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,7,7,9};
		int b[]=new int[2];
		b=new ReturnIndexIfSumEquals().twoSum(a, 9);
		for(int b1:b)
		{
			System.out.println(b1);
		}
		

	}
	public int[] twoSum(int[] nums, int target) 
    {
        
        for(int i=0;i<nums.length;i++)
        {
            for (int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    return new int[] {i,j};
                }
                
            }
        }
		return null;

        
    }

}

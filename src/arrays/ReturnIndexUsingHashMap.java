package arrays;

import java.util.HashMap;
import java.util.Map;

public class ReturnIndexUsingHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,7,6,9};
		int b[]=new int[2];
		b=new ReturnIndexUsingHashMap().twoSum(a, 9);
		for(int b1:b)
		{
			System.out.println(b1);
		}

	}
	public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            System.out.println("complement="+complement);
            if (map.containsKey(complement)) 
            {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        // In case there is no solution, we'll just return null
        return null;
    }

}

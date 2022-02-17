package programs;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int item=13;
		int a[]={10,2,5,7,8,9,11};
		Arrays.sort(a);
		int li=0;
		int hi=a.length-1;
		int mi=(li+hi)/2;
		while(li<=hi)
		{
		if(a[mi]==item)
		{
		System.out.println(item+" is present at index "+mi);
		break;
		}
		else if(a[mi]<item)
		{
		li=mi+1;
		}
		else
		{
		hi=mi-1;
		}
		mi=(li+hi)/2;
		}
		if(li>hi)
		{
		System.out.println("search item is not found");
		}

	}

}

package javasessions;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] a=new int[2][2];
		a[0][0]=10;
		a[0][1]=20;
		a[1][0]=30;
		a[1][1]=40;
		
		for(int i=0;i<a[0].length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println(a[i][j]);
			}
		}
		System.out.println("--------------");
		for(int[] e:a)
		{
			for(int ele:e)
			{
				System.out.println(ele);
			}
		}
		//System.out.println(a.length);
		
		int b[][][]=new int[2][3][4];
		System.out.println(b[0].length);
		System.out.println(b[0][2].length);

	}

}

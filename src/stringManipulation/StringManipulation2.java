package stringManipulation;

public class StringManipulation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="This is my java code.This is nice";
//		System.out.println(s1.charAt(0));
//		System.out.println(s1.indexOf("code"));
		//print the first occurance of i
		System.out.println(s1.indexOf('i'));
		int i_occ=s1.indexOf('i', s1.indexOf('i')+1);
		System.out.println(i_occ);
		//print third occurance of i
		int i_occ_3=s1.indexOf('i', s1.indexOf(s1.charAt(i_occ)+1));
		System.out.println(i_occ_3);
		System.out.println(s1.indexOf('Y'));
		System.out.println(s1.toLowerCase());
		String s2="Hello";
		String s3="hello";
		s2=null;
		//System.out.println(s2.equals(s3));NPE
		System.out.println(s3.equals(s2));
		//System.out.println(s2.equalsIgnoreCase(s3));
		
		String s4="Hello there               ";
		System.out.println(s4.trim());
		System.out.println(s4.replace(" ", ""));
		String s6="xXTestingxxXSeleniumXxXjava";
		String[] s6_index=s6.split("xX");
		System.out.println(s6_index[1]);
		

	}

}

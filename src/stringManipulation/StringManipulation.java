package stringManipulation;

public class StringManipulation {

	public static void main(String[] args) {
		String s="I am testing the string class method given";
		System.out.println(s.indexOf('i', s.indexOf('i')));
		System.out.println(s.indexOf('i', s.indexOf('i')+1));
		System.out.println(s.indexOf('i', s.indexOf('i')+3));
		int s2=s.indexOf('i', s.indexOf('i')+1);
		System.out.println(s.indexOf('i', s2+1));

	}

}

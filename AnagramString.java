package Program;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		String a="Stop";
		String b="Spot";
		if(a.length()!=b.length()) {
			System.out.println("Not a Anagram");
		}
		else {
			System.out.println("lenght of 2 string are same");
			char [] c1=a.toCharArray();
			char [] c2=b.toCharArray();
			System.out.println("Before sorting :- " +Arrays.toString(c1));
			System.out.println("Before sorting :- " +Arrays.toString(c1));
			Arrays.sort(c1);
			Arrays.sort(c2);
			System.out.println("After sorting :- " +Arrays.toString(c1));
			System.out.println("After sorting :- " +Arrays.toString(c1));
			boolean b1=Arrays.equals(c1, c2);
		if(b1==true) {
			System.out.println("It is anagram");
		}
		else {
			System.out.println("It is not a anagram");
		}
		}
		
		
		
	}

}

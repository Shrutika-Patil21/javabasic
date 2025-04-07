package Program;

public class Palindrom {

	public static void main(String[] args) {
		String input="mom";
		String output="";
		for(int i=input.length()-1; i>=0; i--) {
			char a=input.charAt(i);
			output=output+a;
			//System.out.println(output);
		}
		System.out.println("Ouput of the given inout:- "+output);
		if(input.equals(output)) {
			System.out.println("It is a Palindrom");
		}
		else {
		System.out.println("It is not a Palindrom");
		}
	}

}

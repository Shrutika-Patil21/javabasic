package Program;
public class StringFunction3 {

public static void main(String[] args) {
	//String input="Shrutika";
	String input="mom";
		String output="";
		for(int i=3;i>=0;i--)
			//for(int i=input.length()-1; i>=0;i--)
		{
			char a=input.charAt(i);
			output = output+a;
		//	System.out.println(output);
			}
			System.out.println("Output of given input :-"+output);
			if(input.equals(output)) {
				System.out.println("It is a Palindrom");
			}
			else {
				System.out.println("It is not a Palindrom");
			}
		}
		}



package Program;

public class StringFunction4 {

	public static void main(String[] args) {
		//String input="hello";
		String input="shrutika";
		String output ="";
		//for(int i=input.length()-1; i>=0; i--) 
		for(int i=3; i>=0; i--) 
		{	char a=input.charAt(i);
			output=output+a;
			
		}
		System.out.println("The Output of the given input: "+output);
		
	}

}

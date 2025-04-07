package Program;
public class Stringfunction2 {
public static void main(String[] args) {
		String input=" I am Shrutika ";
		System.out.println(input.trim());  //trim function
		String name1="Shrutika";
		String name2="shrutika";
		boolean b1=name1.equals(name2); //equals function
		System.out.println(b1);
		String name3="Ganesh";
		String name4="ganesh";
		boolean b2=name3.equalsIgnoreCase(name4); //equalsignorecase function
		System.out.println(b2);
		//String input1="Shrutika";
		//System.out.println(input.charAt(5));
		String name5="Shrutika Patil";
		System.out.println(name5.contains("patil")); //contains function
	String name6="Nisha";
	System.out.println(name6.replace('N', 'R'));  //replace (char,char)
System.out.println(input.replace("I am Shrutika", "Ganesh Patil")); // replace (CharSequence target, CharSequence replacement)
String input1="A B C No 21";
//lets remove all numberic letter with nothing?->regex for all number function is [0-9] 
//lets remove all smaller letter?->regex for all number function is [a-z] 
//lets remove all capital letter?->regex for all number function is [A-Z] 
System.out.println(input1.replaceAll("[0-9]", "1"));
System.out.println(name5.replaceAll("[a-z]", ""));
System.out.println(name5.replaceAll("[A-Z]", ""));
		
		
		
		
		
		
		
		
		

	}

}

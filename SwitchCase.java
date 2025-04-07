package Program;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter which case you want");
		int input=s1.nextInt();
		switch (input)
		{ 
		
		case 1:System.out.println("Google Browser");
		break;
		case 2:System.out.println("Mozilla Browser");
	break;
		case 3:System.out.println("Safari Browser");
	break;
		case 4:System.out.println("InternetExproler Browser");
		break;
		default:
			System.out.println("Wrong Selection please select 1,2,3 & 4");
		}

	}

}

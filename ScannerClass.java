package Program;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		String name=s1.next();
		int a=s1.nextInt();
		byte b=s1.nextByte();
		short c=s1.nextShort();
		long d=s1.nextLong();
		float e=s1.nextFloat();
		
		double f=s1.nextDouble();
		s1.close();
		
	}

}

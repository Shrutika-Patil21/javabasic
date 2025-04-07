package Program;

import java.util.Scanner;

public class HumanInputScannerClass
{   public static void main(String[] args) 
	{
	
       Scanner s1=new Scanner(System.in);//constructor 
       //why it is in-accepting human input
      int a =s1.nextInt();  //human input
      int b =s1.nextInt();
      int sum=a+b;
      System.out.println(sum);
      s1.close();
	}

}

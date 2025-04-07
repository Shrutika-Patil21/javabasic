package Program;
import java.util.Scanner;
public class AverageStringArray {
public static void main(String[] args) {
		double sum=0;
		double average;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the array size:-" );
		double[] num=new double[s1.nextInt()];
				for(int i=0; i<=num.length-1; i++) {
					System.out.println("Enter value of array at index :-" +i);
					num[i]=s1.nextDouble();		
					sum=sum+num[i];	}
				System.out.println("Sum values to print:- "  +sum);
				average=sum/num.length;
				System.out.println("Average values to print:-" +average);
	}
	
}

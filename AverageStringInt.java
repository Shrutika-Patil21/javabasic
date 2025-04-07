package Program;
import java.util.Scanner;
public class AverageStringInt {
public static void main(String[] args) {
	double sum=0;
	Scanner s1=new Scanner(System.in);
	System.out.println("Print arrya size:-  ");
int []array=new int[s1.nextInt()];
for(int i=0; i<=array.length-1; i++) 
{	System.out.println("Please enter the value at index postion:-" +i);
	array[i]=s1.nextInt();
	sum=sum+array[i];}
System.out.println("Print the sum:-"  +sum);
double average = sum/array.length;
System.out.println("Print the sum of Average:-"  +average);
}

}

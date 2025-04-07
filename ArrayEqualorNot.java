package Program;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayEqualorNot {
public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter the array size");
int[]array1=new int[s1.nextInt()];
int[]array2=new int[array1.length];
for(int i=0; i<=array1.length-1; i++) {
	System.out.println("Please enter the index position of array1:-"  +i);
	array1[i]=s1.nextInt();
	System.out.println("Please enter the index position of array2:-"  +i);
	array2[i]=s1.nextInt();}
System.out.println("First array1:-"  +Arrays.toString(array1));
System.out.println("Second array2:-"  +Arrays.toString(array2));
boolean b1=Arrays.equals(array1, array2);
if(b1==true) {
	System.out.println("Both Arrays are equal");
}else {
	System.out.println("Both Arrays are not equal");
}
	}

}

package Program;

import java.util.Arrays;
import java.util.Scanner;
public class CountAlphabate {
public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the size of the array");
	int num=s1.nextInt();
		int [] arr1= new int[num];
		int [] arr2= new int[num];
		System.out.println("Enter elemetn of fist array");
		for(int i=0; i<num; i++) {
			arr1[i]=s1.nextInt();
		}
		System.out.println("Enter elemetn of second array");
		for(int i=0; i<num; i++) {
			arr2[i]=s1.nextInt();
		}
System.out.println(Arrays.toString(arr1));
System.out.println(Arrays.toString(arr2));
if(Arrays.equals(arr1, arr2)) {
	System.out.println("Both arrays are equal");
}
else
{
	System.out.println("both arrays are not equal");
}
}}

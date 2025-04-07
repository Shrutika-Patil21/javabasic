package Program;
import java.util.Arrays;
import java.util.Scanner;
public class Arrayequaltoeachother {
public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		int[]array1= new int[s1.nextInt()];
		int[]array2=new int[array1.length];
		for(int i=0; i<=array1.length-1; i++) {
			System.out.println("Print enter the value of array1 of index" +i);
			array1[i]=s1.nextInt();
			System.out.println("Print enter the value of array2 of index" +i);
			array2[i]=s1.nextInt();
		}
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
	}

}

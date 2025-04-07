package Program;
import java.util.Scanner;
public class AreaCircle {
public static void main(String[] args)
  {
	//pi*r*r
		System.out.println("Please emter the value of Redius");
        Scanner s1=new Scanner(System.in);
        int r=s1.nextInt();
        double area=Math.PI*r*r;
        System.out.println(area);
        
  
  }
}

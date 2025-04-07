package Program;
import java.lang.Math;

public class MethodOverloading {

	static void add()
	{
		System.out.println();
	}
	static void add(int a)
	{
		System.out.println(a + 6);
	}
	static void add(int a, int b)
	{
		System.out.println(a+b+ 6);
	}
	void add(double a, double b)
	{
		System.out.println(a+b+6);
	}
	public static void main(String[] args) {
		add(1);
		add(10);
		add(10,30);
		MethodOverloading m1=new MethodOverloading();
		m1.add(30.3, 80.3);
	}
	
}

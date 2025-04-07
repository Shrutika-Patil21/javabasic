package Program;

public class GlobalVariable {
	double pi=3.14;  //global variable bcoz it is decelared inside the class but out side the any mehtod
	static int noofdays2025 =365;
	static double bankbalance;
	static int a=10;
	static int b=20;
	static void add()
	{
		int a=200;  //called local variable
	}
	void sub()
	{
		int b=100;  //called local variable
	}

	public static void main(String[] args) {
	
		int c=3324;  //called local variable
		System.out.println(a+b);
		

	}

}

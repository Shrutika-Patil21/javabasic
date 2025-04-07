package Program;

public class ParaNonPara {
	static void Table(int a, char gender)
	{
		System.out.println(a);
		System.out.println(gender);
	}
	static void add()
	{
		int a=10;
		int b=30;
		System.out.println(a + b);
		
	}
	void Table_details(int a, int b, double num, char gender)
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(num);
		System.out.println(gender);
	}
 void sub()
	{int a=10;
	int b=5;
		System.out.println(a - b);
		
	}
	
	public static void main(String[] args) {
	Table(10,'M');
	add();
	ParaNonPara p1=new ParaNonPara();
	p1.Table_details(10,20, 868786, 'M');
	p1.sub();
	

	}

}

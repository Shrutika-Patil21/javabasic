package Program;

public class ParamitarizedNonStaticMethod {

	void add(int a, int b)
	{
		System.out.println(a + b);
	}
	void mul(int a, int b)
	{
		System.out.println(a * b);
	}
	static void Sub(int a, int b)
	{
		System.out.println(a - b);
	}
	
	public static void main(String[] args) {
		
		ParamitarizedNonStaticMethod p1=new ParamitarizedNonStaticMethod();
		p1.add(10, 3430);
		p1.mul(20,10);
		Sub(100,50);
		
	}

}

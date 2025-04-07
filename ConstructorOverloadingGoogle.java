package Program;

public class ConstructorOverloadingGoogle {
	ConstructorOverloadingGoogle()
	{
		System.out.println(1);
	}
	ConstructorOverloadingGoogle(int a)
	{
		System.out.println(2);
	}
	ConstructorOverloadingGoogle(int a, int b)
	{
		System.out.println(3);
	}
	ConstructorOverloadingGoogle(int a, double b)
	{
		System.out.println(4);
	}
	ConstructorOverloadingGoogle(double a,int b)
	{
		System.out.println(5);
	}
	ConstructorOverloadingGoogle(int a, double b,int c)
	{
		System.out.println(6);
	}
	public static void main(String[] args) {
		ConstructorOverloadingGoogle w=new ConstructorOverloadingGoogle(10);
		 new ConstructorOverloadingGoogle();
		 new ConstructorOverloadingGoogle(10);
		 new ConstructorOverloadingGoogle(10,324);
		 new ConstructorOverloadingGoogle(10,4.78);
		 new ConstructorOverloadingGoogle(10.4564,4767);
		 new ConstructorOverloadingGoogle(3434,10.4564,4767);

	}

}

package Program;

public class ParamiterizedConstructor {
	ParamiterizedConstructor(int a, int b)
	{
		System.out.println("Constructore 1");
	}
	ParamiterizedConstructor(int age, char gender)
	{
		System.out.println("Constructore 2");
	}
	
	
	public static void main(String[] args) {
		new ParamiterizedConstructor(20,20);
		new ParamiterizedConstructor(12,'M');
	}

}

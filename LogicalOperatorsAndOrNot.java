package Program;

public class LogicalOperatorsAndOrNot {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		if ((a>b)&&((b>a || a==20)))
		{
			System.out.println("Hello");
		}
		if ((a>b)||((b>a && a<=20)))
		{
			System.out.println("Bye");
		}
		if (!((a>b)||((b>a && a<=20))))
		{
			System.out.println("Hi Bye");
		}
		
	}

}

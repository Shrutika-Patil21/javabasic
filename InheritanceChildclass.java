package Program;
class Parentclass{
	static void add() {
		int a=10;
		int b=20;
		System.out.println(a+b);}
}
public class InheritanceChildclass extends Parentclass
{
static void sub() {
	int a=10;
	int b=20;
	System.out.println(a-b);
	}
public static void main(String[] arg)
	{
		sub();
		add();
		
	}
}

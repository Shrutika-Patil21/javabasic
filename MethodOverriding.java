package Program;
class MethodOverriding_1{
	void login() {
		System.out.println("Login using emailid ");
	}
}
public class MethodOverriding extends MethodOverriding_1 //relation between classes
{
void login() {
	//super.login();    //Super Keyword
	System.out.println("Login using Mobile Num ");
	}
	public static void main(String[] args) {
		MethodOverriding m1=new MethodOverriding();
		m1.login();

	}

}

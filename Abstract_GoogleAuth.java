package Program;
abstract class Authentication //abstract class
{
	abstract void login();  //abstract method
	
}
public class Abstract_GoogleAuth extends Authentication {

	public static void main(String[] args) {
		System.out.println("Login with OTP");

	}

	
	void login() {
		System.out.println("Login with OTP");
		
	}

}

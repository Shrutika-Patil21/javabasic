package Program;

public class GlobalVariableNonStatic {
int noofdays2025=365;
	public static void main(String[] args) {
		
		int earingperday=300;
		earingperday=600;
		GlobalVariableNonStatic g1= new GlobalVariableNonStatic();
		int totalearing=earingperday*g1.noofdays2025;
		System.out.println(totalearing);
		
		
	}

}

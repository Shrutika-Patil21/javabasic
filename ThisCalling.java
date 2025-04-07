package Program;

public class ThisCalling {
	
	ThisCalling(int a){
		this(100,30);
		System.out.println("1");
	}
ThisCalling(int a, int v){
	this(11.2,50);
	System.out.println("2");
	} 
ThisCalling(double a, int s){
	System.out.println("3");
}
ThisCalling(){
	this(100);
	System.out.println("4");
}
	public static void main(String[] args) {
		new ThisCalling();

	}

}

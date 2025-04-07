package Program;

public class Constructore {

	Constructore() //this is Constructor
	{
		System.out.println("This is Constructor");
	}
	public static void main(String[] args) {
		//after creating an object custructor is call automatically
		Constructore c1= new Constructore();
		Constructore c2= new Constructore();
		
		//2nd syntex to create an object
		 new Constructore();
		 
	}

}

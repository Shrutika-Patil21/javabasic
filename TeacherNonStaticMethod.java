package Program;

public class TeacherNonStaticMethod {
          void add()
          
          {
        	  int a=39787;
        	  int b=76576;
        	  System.out.println(a+b);
          }
void mul()
          
          {
        	  int a=39787;
        	  int b=76;
        	  System.out.println(a*b);
          }
 
	public static void main(String[] args) {
		TeacherNonStaticMethod t=new TeacherNonStaticMethod();//object creation
		//classname variable=new classname();
		t.add();//veriable.nonstaticmethod
		t.mul();
		
		
	

	}

}

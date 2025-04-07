package Program;
class Parent {
    int a;
    
    // Parameterized constructor
    Parent(int x) {
        this.a = x;
        System.out.println("Parent class constructor called with value: " + a);
    }
}

// Child class
class Child extends Parent {
    int b;
    
    // Parameterized constructor
    Child(int x, int y) {
        super(x); // Calling parent class constructor with parameter
        this.b = y;
        System.out.println("Child class constructor called with value: " + b);
    }
}

// Main class to execute the program
public class SuperCallExample {
    public static void main(String[] args) {
        // Creating Child class object
        Child obj = new Child(10, 20);
    }
}
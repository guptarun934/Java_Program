package OOPS.This;

// Java code for using 'this' keyword as method parameter
class Test3 {
    int a;
    int b;

    // Default constructor
    Test3 () {
        a = 10;
        b = 20;
    }

    // Method that receives 'this' keyword as parameter
    void display (Test3 obj) {
        System.out.println("a = " + a + " b = " + b);
    }

    // Method that returns current class instance
    void get () {
        display(this);
    }

    public static void main (String[] args) {
        Test3 object = new Test3();
        object.get();
    }
}

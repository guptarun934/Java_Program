package OOPS.This;

// Java code for using this() to invoke current class constructor
class Test1 {
    int a;
    int b;

    //Default constructor
    Test1 () {
        this(10, 20);
        System.out.println("Inside default constructor \n");
    }

    //Parameterized constructor
    Test1 (int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Inside parameterized constructor");
    }

    public static void main (String[] args) {
        Test1 object = new Test1();
    }
}

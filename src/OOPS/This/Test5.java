package OOPS.This;

// Java code for using this as an argument in constructor call Class with object of Class B as its data member
class A {
    Test5 obj;

    // Parameterized constructor with object of B as a parameter
    A (Test5 obj) {
        this.obj = obj;

        // calling display method of class B
        obj.display();
    }

}

class Test5 {
    int x = 5;
    // Default Contructor that create a object of A with passing this as an argument in the constructor

    Test5 () {
        A obj = new A(this);
    }
    // method to show value of x
    void display () {
        System.out.println("Value of x in Class B : " + x);
    }

    public static void main (String[] args) {
        Test5 obj = new Test5();
    }
}

package OOPS.MethodOverriding;

// A Java program to demonstrate multi-level overriding

// Base Class
class Parent4 {
    void show () {
        System.out.println("Parent's show()");

    }
}

// Inherited class
class Child4 extends Parent4 {
    // This method overrides show() of Parent
    void show () {
        super.show();
        System.out.println("Child's show()");
        //super.show();
    }
}

// Inherited class
class GrandChild4 extends Child4 {
    // This method overrides show() of Parent
    void show () {
        super.show();
        System.out.println("GrandChild's show()");
        //super.show();
    }
}

// Driver class
class Main4 {
    public static void main (String[] args) {
        Parent4 obj1 = new GrandChild4();
        obj1.show();
    }
}

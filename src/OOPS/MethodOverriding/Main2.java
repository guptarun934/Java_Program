package OOPS.MethodOverriding;
/* Java program to show that if static method is redefined by a derived class, then it is not overriding,it is hiding */
class Parent2 {
    // Static method in base class which will be hidden in subclass
   static void m1 () {
        System.out.println("From parent static m1()");
    }
    // Non-static method which will be overridden in derived class
    void m2 () {
        System.out.println("From parent non-static(instance) m2()");
    }

    //TestCase 1
    static void m3 () {
        System.out.println("From parent static m3()");
    }
    // Non-static method which will be overridden in derived class
    void m4 () {
        System.out.println("From parent non-static(instance) m4()");
    }

    // Testcase2

    static void m5 () {
        System.out.println("From parent static m5()");
    }
    // Non-static method which will be overridden in derived class
    void m6 () {
        System.out.println("From parent non-static(instance) m6()");
    }
}

class Child2 extends Parent2 {
    // This method hides m1() in Parent
    static void m1 () {
        System.out.println("From child static m1()");
    }

    // This method overrides m2() in Parent
    @Override
    public void m2 () {
        System.out.println("From child non-static(instance) m2()");
    }

    //TestChild 1

    static void m3() {
        System.out.println("From child static m3()");
    }

    // This method overrides m4() in Parent
    @Override
    public void m4 () {
        System.out.println("From child non-static(instance) m4()");
    }

    //TestChild2

    static void m5() {
        System.out.println("From parent static m5()");
    }
    // Non-static method which will be overridden in derived class
    void m6() {
        System.out.println("From parent non-static(instance) m6()");
    }

}

// Driver class
class Main2 {
    public static void main (String[] args) {
        Parent2 obj1 = new Child2();

        // As per overriding rules this should call to class Child static
        // overridden method. Since static method can not be overridden, it
        // calls Parent's m1()
        obj1.m1();

        // Here overriding works and Child's m2() is called
        obj1.m2();


        Parent2 obj2 = new Parent2();

        obj2.m3();

        obj2.m4();


        Child2 obj3 = new Child2();

        obj3.m5();

        obj3.m6();

    }
}


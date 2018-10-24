package OOPS.MethodOverLoading;

// Java program to demonstrate working of method overloading in static methods
public class Main {

    public static int foo (int a) {
        return 10;
    }

    public static char foo (int a, int b) {
        return 'a';
    }

    public static void main (String args[]) {
        System.out.println(foo(1));
        System.out.println(foo(1, 2));
    }

   /* public int foo () {
        return 10;
      }

    // compiler error: foo() is already defined
    public char foo () {
        return 'a';
    }

    public static void main (String args[]) {
    }*/
}




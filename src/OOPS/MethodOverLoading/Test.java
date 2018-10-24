package OOPS.MethodOverLoading;

// A Java program with overloaded main()

public class Test {

    // Normal main()
    public static void main(String[] args)
    {
        System.out.println("Hi Java (from main)");
        Test.main("Java");
    }

    // Overloaded main methods
    public static void main(String arg1)
    {
        System.out.println("Hi, " + arg1);
        Test.main("Dear Java", "My Java");
    }
    public static void main(String arg1, String arg2)
    {
        System.out.println("Hi, " + arg1 + ", " + arg2);
    }
}

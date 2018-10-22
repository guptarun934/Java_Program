package OOPS;


 class Test {

    // class contents
    void show()
    {
        System.out.println("Test::show() called");
    }
}

public class Main {

    // Driver Code
    public static void main(String[] args)
    {
        /*Test t;  // Error here because t is not initialzed
        t.show();*/

        // all objects are dynamically allocated
        Test t = new Test();
        t.show();
    }
}
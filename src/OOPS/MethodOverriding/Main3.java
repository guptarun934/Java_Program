package OOPS.MethodOverriding;

// A Java program to demonstrate that overridden method can be called from sub-class
// Base Class
class Parent3
{
    void show()
    {
        System.out.println("Parent's show()");
    }
}

// Inherited class
class Child3 extends Parent3
{
    // This method overrides show() of Parent
    @Override
    void show()
    {
        super.show();
        System.out.println("Child's show()");
    }
}

// Driver class
class Main3
{
    public static void main(String[] args)
    {
        Parent3 obj = new Child3();
        obj.show();
    }
}

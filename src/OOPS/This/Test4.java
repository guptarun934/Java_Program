package OOPS.This;

// Java code for using this to invoke current class method
class Test4 {

    void display()
    {
        // calling fuction show()
        this.show();

        System.out.println("Inside display function");
    }

    void show() {
        System.out.println("Inside show funcion");
    }


    public static void main(String args[]) {
        Test4 t1 = new Test4();
        t1.display();
    }
}

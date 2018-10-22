package OOPS;

// A Java program to demonstrate that we can use wrapper classes to swap to objects
// A car with model and no.
class Car2 {

    int model, no;

    // Constructor
    Car2 (int model, int no) {
        this.model = model;
        this.no = no;
    }

    // Utility method to print object details
    void print () {
        System.out.println("no = " + no +
                ", model = " + model);
    }
}

// A Wrapper over class that is used for swapping
class SwapObject3 {
    Car2 c;

    // Constructor
    SwapObject3 (Car2 c) {
        this.c = c;
    }
}

// A Class that use Car and swaps objects of Car using CarWrapper
class Main1 {
    // This method swaps car objects in wrappers cw1 and cw2
    public static void swap (SwapObject3 cw1, SwapObject3 cw2) {
        Car2 temp = cw1.c;
        cw1.c = cw2.c;
        cw2.c = temp;
    }

    // Driver method
    public static void main (String[] args) {
        Car2 c1 = new Car2(101, 1);
        Car2 c2 = new Car2(202, 2);
        SwapObject3 cw1 = new SwapObject3(c1);
        SwapObject3 cw2 = new SwapObject3(c2);
        swap(cw1, cw2);
        cw1.c.print();
        cw2.c.print();
    }
}



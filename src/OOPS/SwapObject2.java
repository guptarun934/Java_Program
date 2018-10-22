package OOPS;

// A Java program to demonstrate that simply swapping object references doesn't work
// A car with number and name

class Car1 {

    int model, no;

    // Constructor
    Car1 (int model, int no) {
        this.model = model;
        this.no = no;
    }

    // Utility method to print Car
    void print () {
        System.out.println("no = " + no +
                ", model = " + model);
    }
}

// A class that uses Car
class SwapObject2 {

    // swap() doesn't swap c1 and c2
    public static void swap (Car1 c1, Car1 c2) {
        Car1 temp = c1;
        c1 = c2;
        c2 = temp;
    }

    // Driver method
    public static void main (String[] args) {
        Car1 c1 = new Car1(101, 1);
        Car1 c2 = new Car1(202, 2);
        swap(c1, c2);
        c1.print();
        c2.print();
    }
}


package OOPS.Encapsulation;

public class TestEncapsulate {
    public static void main (String[] args) {
        Encapsulate obj = new Encapsulate();

        // setting values of the variables
        obj.setName("Arun");
        obj.setAge(24);
        obj.setRoll(10);

        // Displaying values of the variables
        System.out.println("name: " + obj.getName());
        System.out.println("age: " + obj.getAge());
        System.out.println("roll: " + obj.getRoll());

        // Direct access of Roll is not possible
        // due to encapsulation
        // System.out.println("roll: " + obj.geekName);
    }
}

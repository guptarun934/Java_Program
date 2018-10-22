package OOPS.Encapsulation;

// Java program to demonstrate encapsulation
public class Encapsulate {
    // private variables declared
    // these can only be accessed by
    // public methods of class
    private String Name;
    private int Roll;
    private int Age;

    // get method for age to access
    // private variable Age
    public int getAge () {
        return Age;
    }

    // get method for name to access
    // private variable Name
    public String getName () {
        return Name;
    }

    // get method for roll to access
    // private variable Roll
    public int getRoll () {
        return Roll;
    }

    // set method for age to access
    // private variable age
    public void setAge (int newAge) {
        Age = newAge;
    }

    // set method for name to access
    // private variable geekName
    public void setName (String newName) {
        Name = newName;
    }

    // set method for roll to access
    // private variable geekRoll
    public void setRoll (int newRoll) {
        Roll = newRoll;
    }
}


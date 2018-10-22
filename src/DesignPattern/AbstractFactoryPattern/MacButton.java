package DesignPattern.AbstractFactoryPattern;

public class MacButton implements Button {
    @Override
    public void paint () {
        System.out.println("Painting Mac Button...");
    }
}

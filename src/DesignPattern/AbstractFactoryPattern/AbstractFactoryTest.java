package DesignPattern.AbstractFactoryPattern;

public class AbstractFactoryTest {
    public static void main (String[] args) {
        Button button = GUIFactory.createButton();
        button.paint();
    }
}

package DesignPattern.AbstractFactoryPattern;

public class MacFactory implements ButtonFactory {
    @Override
    public Button createButton () {
        System.out.println("creating Mac Button...");
        return new MacButton();
    }
}

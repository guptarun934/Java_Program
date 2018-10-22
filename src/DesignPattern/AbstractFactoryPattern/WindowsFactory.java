package DesignPattern.AbstractFactoryPattern;

public class WindowsFactory implements ButtonFactory {
    @Override
    public Button createButton () {
        System.out.println("Creating Windows Button...");
        return new WindowsButton();
    }
}

package DesignPattern.Prototype;

public class PrototypeTest {
    public static void main (String[] args) {
        ColorStore.getColor("red").fillColor();
        ColorStore.getColor("Green").fillColor();
        ColorStore.getColor("Green").fillColor();
        ColorStore.getColor("red").fillColor();
    }
}

package DesignPattern.AbstractFactoryPattern;

public class GUIFactory {
    private GUIFactory(){

    }
    public static Button createButton(){
        String os = null;
        os ="windows";
        if("windows".equalsIgnoreCase(os)){
            return new WindowsFactory().createButton();
        }
        else if ("mac".equalsIgnoreCase(os)){
            return new MacFactory().createButton();
        }
        return null;
    }
}

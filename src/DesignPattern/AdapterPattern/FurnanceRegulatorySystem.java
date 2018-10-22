package DesignPattern.AdapterPattern;

public class FurnanceRegulatorySystem {
    public void regulateFurnanceTemperature(){
        FurnanceContollerAdapter fca = new FurnanceContollerAdapter();
        fca.controllerFurnance(300);
    }
}

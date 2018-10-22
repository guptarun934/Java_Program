package DesignPattern.AdapterPattern;

public class FurnanceContollerAdapter  extends FurnanceController{
    public void controllerFurnance(int heatLevel){
        heatLevel = (heatLevel - 32)* 5/9;
        changeFurnanceTemperature(heatLevel);
    }
}

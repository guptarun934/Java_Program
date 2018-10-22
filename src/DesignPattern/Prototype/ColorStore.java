package DesignPattern.Prototype;

import java.util.HashMap;
import java.util.Map;

public class ColorStore {
    private static Map<String, Color> colorMap = new HashMap<String, Color>();
    static {
        colorMap.put("red",new RedColor());
        colorMap.put("Green",new GreenColor());
    }
    public static Color getColor(String colorName){
        return (Color) colorMap.get(colorName).clone();
    }
}

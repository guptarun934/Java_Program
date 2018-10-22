package DesignPattern.FactoryPattern;

public class IndiaCurrency implements Currency {
    @Override
    public String getCurrency () {
        return "Rupees";
    }

    @Override
    public String getSymbol () {
        return "Rs";
    }

    @Override
    public String getId () {
        return "1";
    }

    public static void main (String[] args) {
        IndiaCurrency indiaCurrency = new IndiaCurrency();

        System.out.println(indiaCurrency.getSymbol());
    }
}

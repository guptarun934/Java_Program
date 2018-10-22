package DesignPattern.FactoryPattern;

public class USCurrency implements Currency {
    @Override
    public String getCurrency () {
        return "Doller";
    }

    @Override
    public String getSymbol () {
        return "$";
    }

    @Override
    public String getId () {
        return "2";
    }
}

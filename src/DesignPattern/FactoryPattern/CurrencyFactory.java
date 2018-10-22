package DesignPattern.FactoryPattern;

public class CurrencyFactory {

    public static Currency getCurrencyByCountry(String country) throws Exception {
        if("IN".equalsIgnoreCase(country)) {
            return new IndiaCurrency();
        }
        else if ("US".equalsIgnoreCase(country)){
             return new USCurrency();
            }
            throw new Exception("Invalid Country...");
        }

    public static void main (String[] args) {
        Currency india;
        try {
            india = CurrencyFactory.getCurrencyByCountry("IN");
            System.out.println("Country Id::"+india.getId());
            System.out.println("Indian curreny::" + india.getCurrency());
            System.out.println("India currency Symbol::" + india.getSymbol());
        } catch (Exception e) {
            e.printStackTrace();
        }

        Currency us;
        try {
            us = CurrencyFactory.getCurrencyByCountry("US");
            System.out.println("Country Id::"+us.getId());
            System.out.println("American Currency::"+us.getCurrency());
            System.out.println("American Currency Symbol::"+us.getSymbol());
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

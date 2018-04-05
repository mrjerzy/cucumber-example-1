package com.mrjerz.CucumberReport;

public class Converter {

    private static final double UMRECHNUNGS_KURS = 1.23993;

    private double euros;

    public Converter(){
        this.euros = euros;
    }

    public double getUsdFromEur(double eur){

        if(eur < 0){
            return new Double(0);
        }
        return new Double(eur * UMRECHNUNGS_KURS);
    }

    public double getEurFromUsd(double usd){

        if(usd < 0){
            return new Double(0);
        }
        return new Double(usd / UMRECHNUNGS_KURS);
    }

    public String stringify(){
        return new String("TestString");
    }

}

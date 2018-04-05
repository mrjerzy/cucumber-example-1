package com.mrjerz.CucumberReport;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.*;

@SuppressWarnings("unused")
public class JerzyTest {

    private Converter converter;
    private double input_euros;
    private double input_dollars;
    private double output_dollar;
    private double output_euro;

    @Given("^Der User hat (.+) EUR")
    public void setEuro(double euro){
        converter = new Converter();
        input_euros = euro;
    }

    @When("^Er ruft EUR Wechsel Funktionalität auf$")
    public void performConversion_EUR(){
        output_dollar = converter.getUsdFromEur(this.input_euros);
    }

    @Then("^Der User erhält (.+) USD$")
    public void checkDollar(double dollar){
        assertEquals(dollar, output_dollar, 1e-6);
    }

    @Given("^Der User hat (.+) USD$")
    public void setDollar(double usd){
        input_dollars = usd;
        converter = null;
        converter = new Converter();
    }

    @When("^Er ruft USD Wechsel Funktionalität auf$")
    public void performConversion_USD(){
        output_euro = converter.getEurFromUsd(input_dollars);
    }

    @Then("^Der User erhält (.+) EUR$")
    public void checkEuros(double eur){
        assertEquals(eur, output_euro, 1e-6);
    }
}

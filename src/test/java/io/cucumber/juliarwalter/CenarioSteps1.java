package io.cucumber.juliarwalter;

import io.cucumber.java.pt.*;
import io.cucumber.juliarwalter.services.Comando;

public class CenarioSteps1 {

    @Quando("acesso o site da Tricentis: {string}")
    public void acessoSiteTricentis(String string) {
        Comando.abrir(string);
    }

    @Dado("que clico em Automobile")
    public void clicoAutomobile() {
        Comando.seletorQueryCss("#nav_automobile").click();
    }

    @Dado("clico na opcao Make: Audi")
    public void clicoMakeAudi() {
        Comando.seletorQueryXpath("//*[@id='make']/option[2]").click();
    }  
    
    @Dado("preencho o campo Engine Performance [kW]: {string}")
    public void enginePerformance(String string) {
        Comando.seletorQueryXpath("//*[@id='engineperformance']").sendKeys(string);
    }
    
    @Dado("informo a Date of Manufacture: {string}")
    public void dateManufacture(String string) {
        Comando.seletorQueryXpath("//*[@id='dateofmanufacture']").sendKeys(string);
    }
    
    @Dado("clico na opcao Number of Seats 5")
    public void clicoNumberSeats() {
        Comando.seletorQueryXpath("//*[@id='numberofseats']/option[6]").click();
    }

    @Dado("clico na opcao Fuel Type: Eletric Power")
    public void clicoFuelEletricPower() {
        Comando.seletorQueryXpath("//*[@id='fuel']/option[4]").click();
 
    }
    
    @Dado("informo a List Price [$]: {string}")
    public void listPrice(String string) {
        Comando.seletorQueryCss("#listprice").sendKeys(string);

    }
    
    @Dado("informo a License Plate Number: {string}")
    public void licensePlateNumber(String string) {
        Comando.seletorQueryCss("#licenseplatenumber").sendKeys(string);

    }
    
    @Dado("informo a Annual Mileage [mi]: {string}")
    public void annualMileage(String string) {
        Comando.seletorQueryCss("#annualmileage").sendKeys(string);
    }
    
    @Entao("devo clicar em Next")
    public void clicarNext1() {
        Comando.seletorQueryXpath("//*[@id='nextenterinsurantdata']").click();
    }
}
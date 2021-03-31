package io.cucumber.juliarwalter;

import io.cucumber.java.pt.*;
import io.cucumber.juliarwalter.services.Comando;

public class CenarioSteps3 {

    @Dado("que informo o Start Date: {string}")
    public void startDate(String string) {
        Comando.seletorQueryCss("#startdate").sendKeys(string);
    }

    @Dado("que clico na opcao Insurance Sum [$] {double}.{int},{int}")
    public void insuranceSum(Double double1, Integer int1, Integer int2) {   
        Comando.seletorQueryXpath("//*[@id='insurancesum']/option[10]").click();
    }

    @Dado("que clico na opcao Merit Rating: Super Bonus")
    public void ratingSuperBonus() {
        Comando.seletorQueryXpath("//*[@id='meritrating']/option[2]").click();       
    }

    @Dado("que clico na opcao Damage Insurance: Full Coverage")
    public void damageInsurance() {
        Comando.seletorQueryXpath("//*[@id='damageinsurance']/option[4]").click();       

    } 

    @Dado("informo o Optional Products: Euro Protection")
    public void optionalProducts() {
        Comando.seletorQueryXpath("//*[@id='insurance-form']/div/section[3]/div[5]/p/label[1]").click();       

    }

    @Dado("que clico na opcao Courtesy Car: Yes")
    public void CourtesyCar() {
        Comando.seletorQueryXpath("//*[@id='courtesycar']/option[3]").click();       

    } 

    @Entao("clicar no Next")
    public void  clicarNext3() {
        Comando.seletorQueryXpath("//*[@id='nextselectpriceoption']").click();       

    }

}
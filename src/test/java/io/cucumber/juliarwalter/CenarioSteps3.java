package io.cucumber.juliarwalter;

import io.cucumber.java.pt.*;
import io.cucumber.juliarwalter.services.Comando;

public class CenarioSteps3 {

    @Dado("que informo o Start Date: {string}")
    public void que_informo_o_Start_Date(String string) {
        Comando.seletorQueryCss("#startdate").sendKeys(string);
    }

    @Dado("que clico na opcao Insurance Sum [$] {double}.{int},{int}")
    public void que_clico_na_opcao_Insurance_Sum_$(Double double1, Integer int1, Integer int2) {   
        Comando.seletorQueryXpath("//*[@id='insurancesum']/option[10]").click();
    }

    @Dado("que clico na opcao Merit Rating: Super Bonus")
    public void que_clico_na_opcao_Merit_Rating_Super_Bonus() {
        Comando.seletorQueryXpath("//*[@id='meritrating']/option[2]").click();       
    }

    @Dado("que clico na opcao Damage Insurance: Full Coverage")
    public void que_clico_na_opcao_Damage_Insurance_Full_Coverage() {
        Comando.seletorQueryXpath("//*[@id='damageinsurance']/option[4]").click();       

    } 

    @Dado("informo o Optional Products: Euro Protection")
    public void informo_o_Optional_Products_Euro_Protection() {
        Comando.seletorQueryXpath("//*[@id='insurance-form']/div/section[3]/div[5]/p/label[1]").click();       

    }

    @Dado("que clico na opcao Courtesy Car: Yes")
    public void que_clico_na_opcao_Courtesy_Car_Yes() {
        Comando.seletorQueryXpath("//*[@id='courtesycar']/option[3]").click();       

    } 

    @Entao("clicar no Next")
    public void clicar_no_Next() {
        Comando.seletorQueryXpath("//*[@id='nextselectpriceoption']").click();       

    }

}
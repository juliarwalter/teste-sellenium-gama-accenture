package io.cucumber.juliarwalter;

import io.cucumber.java.pt.*;
import io.cucumber.juliarwalter.services.Comando;

public class CenarioSteps2 {

    @Dado("que digito First Name {string}")
    public void firstName(String string) {
        Comando.seletorQueryCss("#firstname").sendKeys(string);
    }
    
    @Dado("que digito Last Name {string}")
    public void lastName(String string) {
        Comando.seletorQueryCss("#lastname").sendKeys(string);
    }
    
    @Dado("preencho o campo Date of Birth {string}")
    public void dateBirth(String string) {
        Comando.seletorQueryXpath("//*[@id='birthdate']").sendKeys(string);
    }
    
    @Dado("informo o Gender: Male")
    public void genderMale() {
        Comando.seletorQueryXpath("//*[@id='insurance-form']/div/section[2]/div[4]/p/label[1]/span").click();
    }
    
    @Dado("preencho o campo Street Address {string}")
    public void streetAddress(String string) {
        Comando.seletorQueryCss("#streetaddress").sendKeys(string);
    }
    
    @Dado("seleciono a opcao: Brasil")
    public void opcaoBrasil() {
        Comando.seletorQueryXpath("//*[@id='country']/option[32]").click();

    }
    
    @Dado("preencho o campo Zip Code {string}")
    public void zipCode(String string) {
        Comando.seletorQueryCss("#zipcode").sendKeys(string);
    }
    
    @Dado("preencho a City {string}")
    public void informoCity(String string) {
        Comando.seletorQueryCss("#city").sendKeys(string);
    }
    
    @Dado("que clico na opcao Occupation: Employee")
    public void occupationEmployee() {
        Comando.seletorQueryXpath("//*[@id='occupation']/option[2]").click();
    }
    
    @Dado("informo os Hoobies")
    public void informoHoobies() {
        Comando.seletorQueryXpath("//*[@id='insurance-form']/div/section[2]/div[10]/p/label[4]").click();
 
    }

    @Dado("preencho o Website: {string}")
    public void informoWebsite(String string) {
        Comando.seletorQueryCss("#website").sendKeys(string);

    }

    @Entao("clico em Next")
    public void  clicarNext2() {
        Comando.seletorQueryXpath("//*[@id='nextenterproductdata']").click();
    }
    
}
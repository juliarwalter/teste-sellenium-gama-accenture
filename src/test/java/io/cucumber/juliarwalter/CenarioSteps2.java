package io.cucumber.juliarwalter;

import io.cucumber.java.pt.*;
import io.cucumber.juliarwalter.services.Comando;

public class CenarioSteps2 {

    @Dado("que digito First Name {string}")
    public void que_digito_First_Name(String string) {
        Comando.seletorQueryCss("#firstname").sendKeys(string);
    }
    
    @Dado("que digito Last Name {string}")
    public void que_digito_Last_Name(String string) {
        Comando.seletorQueryCss("#lastname").sendKeys(string);
    }
    
    @Dado("preencho o campo Date of Birth {string}")
    public void preencho_o_campo_Date_of_Birth(String string) {
        Comando.seletorQueryXpath("//*[@id='birthdate']").sendKeys(string);
    }
    
    @Dado("informo o Gender: Male")
    public void informo_o_Gender_Male() {
        Comando.seletorQueryXpath("//*[@id='insurance-form']/div/section[2]/div[4]/p/label[1]/span").click();
    }
    
    @Dado("preencho o campo Street Address {string}")
    public void preencho_o_campo_Street_Address(String string) {
        Comando.seletorQueryCss("#streetaddress").sendKeys(string);
    }
    
    @Dado("seleciono a opcao: Brasil")
    public void seleciono_a_opcao_Brasil() {
        Comando.seletorQueryXpath("//*[@id='country']/option[32]").click();

    }
    
    @Dado("preencho o campo Zip Code {string}")
    public void preencho_o_campo_Zip_Code(String string) {
        Comando.seletorQueryCss("#zipcode").sendKeys(string);
    }
    
    @Dado("preencho a City {string}")
    public void preencho_a_City(String string) {
        Comando.seletorQueryCss("#city").sendKeys(string);
    }
    
    @Dado("que clico na opcao Occupation: Employee")
    public void que_clico_na_opcao_Occupation_Employee() {
        Comando.seletorQueryXpath("//*[@id='occupation']/option[2]").click();
    }
    
    @Dado("informo os Hoobies")
    public void informo_os_Hoobies() {
        Comando.seletorQueryXpath("//*[@id='insurance-form']/div/section[2]/div[10]/p/label[4]").click();
 
    }

    @Dado("preencho o Website: {string}")
    public void preencho_o_Website(String string) {
        Comando.seletorQueryCss("#website").sendKeys(string);

    }

    @Entao("clico em Next")
    public void devo_clicar_em() {
        Comando.seletorQueryXpath("//*[@id='nextenterproductdata']").click();
    }
    
}
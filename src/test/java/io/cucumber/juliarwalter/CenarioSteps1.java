package io.cucumber.juliarwalter;

import io.cucumber.java.pt.*;
import io.cucumber.juliarwalter.services.Comando;

public class CenarioSteps1 {

    @Quando("acesso o site da Tricentis: {string}")
    public void acesso_o_site_da_Tricentis(String string) {
        Comando.abrir(string);
    }

    @Dado("que clico em Automobile")
    public void que_clico_em_Automobile() {
        Comando.seletorQueryCss("#nav_automobile").click();
    }

    @Dado("clico na opcao Make: Audi")
    public void clico_na_opcao_Make_Audi() {
        Comando.seletorQueryXpath("//*[@id='make']/option[2]").click();
    }  
    
    @Dado("preencho o campo Engine Performance [kW]: {string}")
    public void preencho_o_campo_Engine_Performance_kW(String string) {
        Comando.seletorQueryXpath("//*[@id='engineperformance']").sendKeys(string);
    }
    
    @Dado("informo a Date of Manufacture: {string}")
    public void informo_a_Date_of_Manufacture(String string) {
        Comando.seletorQueryXpath("//*[@id='dateofmanufacture']").sendKeys(string);
    }
    
    @Dado("clico na opcao Number of Seats 5")
    public void clico_na_opcao_Number_of_Seats() {
        Comando.seletorQueryXpath("//*[@id='numberofseats']/option[6]").click();
    }

    @Dado("clico na opcao Fuel Type: Eletric Power")
    public void clico_na_opcao_Fuel_Type_Eletric_Power() {
        Comando.seletorQueryXpath("//*[@id='fuel']/option[4]").click();
 
    }
    
    @Dado("informo a List Price [$]: {string}")
    public void informo_a_List_Price_$(String string) {
        Comando.seletorQueryCss("#listprice").sendKeys(string);

    }
    
    @Dado("informo a License Plate Number: {string}")
    public void informo_a_License_Plate_Number(String string) {
        Comando.seletorQueryCss("#licenseplatenumber").sendKeys(string);

    }
    
    @Dado("informo a Annual Mileage [mi]: {string}")
    public void informo_a_Annual_Mileage_mi(String string) {
        Comando.seletorQueryCss("#annualmileage").sendKeys(string);
    }
    
    @Entao("devo clicar em Next")
    public void devo_clicar_em() {
        Comando.seletorQueryXpath("//*[@id='nextenterinsurantdata']").click();
    }
}
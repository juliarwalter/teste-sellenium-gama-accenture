package io.cucumber.juliarwalter;

import io.cucumber.java.pt.*;
import io.cucumber.juliarwalter.services.Comando;

public class CenarioSteps4 {

    @Dado("que seleciono a opcao de preco")
    public void que_seleciono_a_opcao_de_preco() {
        Comando.seletorQueryXpath("//*[@id='priceTable']/tfoot/tr/th[2]/label[4]").click();
    }  
    
    @Entao("clico no botao Next")
    public void clico_no_botao_Next() throws InterruptedException{
        Thread.sleep(2000); 
        Comando.seletorQueryXpath("//*[@id='nextsendquote']").click();

    }
}
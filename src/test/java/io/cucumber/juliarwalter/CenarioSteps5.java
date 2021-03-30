package io.cucumber.juliarwalter;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.pt.*;
import io.cucumber.juliarwalter.services.Comando;

public class CenarioSteps5 {
    @Dado("que informo o E-mail: {string}")
    public void que_informo_o_E_mail(String string) {
        Comando.seletorQueryCss("#email").sendKeys(string);
    }
    
    @Dado("preencho o campo Phone: {string}")
    public void preencho_o_campo_Phone(String string) {
        Comando.seletorQueryCss("#phone").sendKeys(string);
    }
    
    @Dado("preencho o campo Username: {string}")
    public void preencho_o_campo_Username(String string) {
        Comando.seletorQueryCss("#username").sendKeys(string);
    }
    
    @Dado("preencho o campo Password: {string}")
    public void preencho_o_campo_Password(String string) {
        Comando.seletorQueryCss("#password").sendKeys(string);
    }
    
    @Dado("confirmo o campo Password: {string}")
    public void confirmo_o_campo_Password(String string) {
        Comando.seletorQueryCss("#confirmpassword").sendKeys(string);
    }
    
    @Entao("devo clicar em Send")
    public void devo_clicar_em_Send() {
        Comando.seletorQueryCss("#sendemail").click();
    }
    
    @Entao("verificar a mensagem: {string}")
    public void verificar_a_mensagem(String string) throws  InterruptedException{
        Thread.sleep(10000); 
        assertEquals(Comando.seletorQueryCss("body > div.sweet-alert.showSweetAlert.visible > h2").getText(), string);
        Comando.fechar();
    }
}
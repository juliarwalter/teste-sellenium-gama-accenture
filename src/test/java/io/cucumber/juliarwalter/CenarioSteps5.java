package io.cucumber.juliarwalter;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.pt.*;
import io.cucumber.juliarwalter.services.Comando;

public class CenarioSteps5 {
    @Dado("que informo o E-mail: {string}")
    public void infoEail(String string) {
        Comando.seletorQueryCss("#email").sendKeys(string);
    }
    
    @Dado("preencho o campo Phone: {string}")
    public void campoPhone(String string) {
        Comando.seletorQueryCss("#phone").sendKeys(string);
    }
    
    @Dado("preencho o campo Username: {string}")
    public void campoUsername(String string) {
        Comando.seletorQueryCss("#username").sendKeys(string);
    }
    
    @Dado("preencho o campo Password: {string}")
    public void campoPassword(String string) {
        Comando.seletorQueryCss("#password").sendKeys(string);
    }
    
    @Dado("confirmo o campo Password: {string}")
    public void confirmoPassword(String string) {
        Comando.seletorQueryCss("#confirmpassword").sendKeys(string);
    }
    
    @Entao("devo clicar em Send")
    public void clicarEmSend() {
        Comando.seletorQueryCss("#sendemail").click();
    }
    
    @Entao("verificar a mensagem: {string}")
    public void verificarMensagem(String string) throws  InterruptedException{
        Thread.sleep(10000); 
        assertEquals(Comando.seletorQueryCss("body > div.sweet-alert.showSweetAlert.visible > h2").getText(), string);
        Comando.fechar();
    }
}
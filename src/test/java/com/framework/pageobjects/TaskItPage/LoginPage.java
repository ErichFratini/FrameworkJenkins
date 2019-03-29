package com.framework.pageobjects.TaskItPage;

import com.framework.support.Reports;
import com.framework.support.Utils;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class LoginPage {

    private WebDriver navegador = null;

    public LoginPage(WebDriver navegador){
        this.navegador = navegador;
    }

    public LoginPage clicarLogin() throws RuntimeException {
        try {
            this.navegador.findElement (By.cssSelector ("body > nav > div > div > ul.right.hide-on-med-and-down > li > a")).click ();
            return this;
        }catch (Exception e){
            Reports.tirarFoto (this.navegador, Utils.getTimestamp ());
            throw new RuntimeException ("Não foi possivel clicar no botão de login"+e);
        }
    }

    public LoginPage inserirLogin(String login) throws RuntimeException {
        try{
        this.navegador.findElement (By.xpath ("//*[@id='signinbox']/div[1]/form/div[2]/div[1]/input")).sendKeys (login);
        return this;
        }catch (Exception e){
            Reports.tirarFoto (this.navegador, Utils.getTimestamp ());
            throw new RuntimeException ("Não foi possivel clicar no botão de login"+e);
        }
    }

    public LoginPage inserirSenha(String senha) throws RuntimeException {
        try{
        this.navegador.findElement (By.xpath ("//*[@id='signinbox']/div[1]/form/div[2]/div[2]/input")).sendKeys (senha);
        return this;
        }catch (Exception e){
            Reports.tirarFoto (this.navegador, Utils.getTimestamp ());
            throw new RuntimeException ("Não foi possivel clicar no botão de login"+e);
        }
    }

    public LoginPage botaoLogar() throws RuntimeException {
            try {
                this.navegador.findElement (By.xpath ("//*[@id='signinbox']/div[2]/a")).click ();
                Thread.sleep (5000);
                return this;
            } catch (Exception e) {
                WebElement mensagemPop = navegador.findElement (By.id ("toast-container"));
                String mensagem = mensagemPop.getText();
                Reports.tirarFoto(this.navegador, Utils.getTimestamp());
                assertEquals("Maybe you brain dropped the password or login in some place!", mensagem);
                throw new RuntimeException ("Usuario não cadastrado ou senha invalida");
            }
    }

}


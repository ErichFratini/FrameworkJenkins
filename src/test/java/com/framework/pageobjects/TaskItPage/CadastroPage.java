package com.framework.pageobjects.TaskItPage;


import com.framework.support.Reports;
import com.framework.support.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;

import static org.junit.Assert.assertEquals;

public class CadastroPage {

    private WebDriver navegador = null;

    public CadastroPage(WebDriver navegador){
        this.navegador = navegador;
    }

    public CadastroPage botaoCadastro() throws RuntimeException {
        try {
            this.navegador.findElement (By.xpath ("//*[@id='signup']")).click ();
            Reports.tirarFoto (this.navegador, Utils.getTimestamp ());
            return this;
        }catch (Exception e){
            Reports.tirarFoto (this.navegador, Utils.getTimestamp ());
            throw new RuntimeException ("Não foi possivel clicar no botão de cadastro"+e);
        }
    }

    public CadastroPage inserirNome(String nome) throws RuntimeException {
        try {
            this.navegador.findElement (By.xpath ("//*[@id='signupbox']/div[1]/form/div[2]/div/input")).sendKeys (nome);
            Reports.tirarFoto (this.navegador, Utils.getTimestamp ());
            return this;
        }catch (Exception e){
            Reports.tirarFoto (this.navegador, Utils.getTimestamp ());
            throw new RuntimeException ("Não foi possivel inserir o nome"+e);
        }
    }

    public CadastroPage inserirLogin(String login) throws RuntimeException {
        try {
            this.navegador.findElement (By.xpath ("//*[@id='signupbox']/div[1]/form/div[3]/div[1]/input")).sendKeys (login);
            Reports.tirarFoto (this.navegador, Utils.getTimestamp ());
            return this;
        }catch (Exception e){
            Reports.tirarFoto (this.navegador, Utils.getTimestamp ());
            throw new RuntimeException ("Não foi possivel inserir login"+e);
        }
    }

    public CadastroPage inserirSenha(String senha) throws RuntimeException {
        try {
            this.navegador.findElement (By.xpath ("//*[@id='signupbox']/div[1]/form/div[3]/div[2]/input")).sendKeys (senha);
            Reports.tirarFoto (this.navegador, Utils.getTimestamp ());
            return this;
        }catch (Exception e){
            Reports.tirarFoto (this.navegador, Utils.getTimestamp ());
            throw new RuntimeException ("Não foi possivel inserir a senha"+e);
        }
    }

    public CadastroPage botaoFinalizarCadastro() throws RuntimeException {
        try {
            this.navegador.findElement (By.xpath ("//*[@id='signupbox']/div[2]/a")).click ();
            return this;
        }catch (Exception e){
            Reports.tirarFoto (this.navegador, Utils.getTimestamp ());
            throw new RuntimeException ("Clicar no botão de confirmar cadastro"+e);
        }
    }



    public boolean loginEfetuado() throws RuntimeException {
            try {
                Reports.tirarFoto (this.navegador, Utils.getTimestamp ());
                return this.navegador.findElement (By.className ("me")).isDisplayed ();
            } catch (Exception e) {
                WebElement mensagemPop = navegador.findElement (By.id ("toast-container"));
                String mensagem = mensagemPop.getText();
                assertEquals("Someone choose this login before, please pick another!", mensagem);
                Reports.tirarFoto (this.navegador, Utils.getTimestamp ());
                throw new RuntimeException ("Não foi possivel logar na pagina" + e);
            }
    }
}


package com.framework.support;


import org.openqa.selenium.WebDriver;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Utils {

    private WebDriver navegador = null;

    public Utils(WebDriver navegador) {
        this.navegador = navegador;
    }

    public static String getTimestamp() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("ddMMyyyyhhmmss"));
    }

    public void navegarPara(String arg1) {
        try {
            this.navegador.get (arg1);
            Reports.tirarFoto (this.navegador, Utils.getTimestamp ());
        }catch (Exception e){
            Reports.tirarFoto (this.navegador, Utils.getTimestamp ());
            throw new RuntimeException ("Não foi possivel acessar o site"+e);
        }
    }
}

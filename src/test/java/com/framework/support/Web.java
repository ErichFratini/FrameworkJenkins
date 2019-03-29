package com.framework.support;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;

public class Web {

    public static final String BINARY_CHROME_DRIVER = "src/main/resources/drivers/chromedriver";

    public static WebDriver getChromeDriver() {
        Dimension d = new Dimension(1382,744);
        ChromeOptions options = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", BINARY_CHROME_DRIVER);
        //options.addArguments("--headless");
        WebDriver navegador = new ChromeDriver(options);
        //navegador.manage().window().maximize();
        navegador.manage().window().setSize (d);
        navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return navegador;

    }

}

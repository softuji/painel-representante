package org.dev.webscraping.webscraping.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.dev.webscraping.webscraping.model.Product;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import model.Product;

public class Controller {
    public static void main(String[] args) {
        rasparDados();
    }

    private static ArrayList<Product> rasparDados() {
        //definir o caminho do driver
        System.setProperty("webdriver.edge.driver", "resources/msedgedriver.exe");

        EdgeOptions options = new EdgeOptions();

        //nao exibe o navegador
        options.addArguments("--headless=new");


        //para corrigir possiveis erros na execução
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        //evitar detecao dos sites

        options.addArguments("--disable-blink-features=AutomationControlled");
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        options.setExperimentalOption("useAutomationExtension", null);

        options.addArguments("window-size=1600,800");

        //para ajudar a não ser identificado como bot
        options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.169 Safari/537.36");

        WebDriver driver = new EdgeDriver(options = options);

        driver.get("https://amazon.com.br");

        WebElement inputPesquisa = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));

        inputPesquisa.sendKeys("smartphone");

        inputPesquisa.submit();

        waitForIt(5000);

        List<WebElement> descricoesProdutos = driver.findElements(By.xpath("//span[@class=\"a-size-base-plus a-color-base a-text-normal\"]"));

        List<WebElement> valoresProdutos = driver.findElements(By.xpath("//div[@class=\"a-row a-size-base a-color-base\"]"));

        ArrayList<Product> produtos = new ArrayList<>();
        for(int i = 0; i < descricoesProdutos.size(); i++) {

            produtos.add(new Product(descricoesProdutos.get(i).getText(), valoresProdutos.get(i).getText()));
        }

        waitForIt(5000);

        driver.quit();

        return produtos;
    }

    //metodo para pausar a execução
    private static void waitForIt(long tempo) {

        try {
            new Thread().sleep(tempo);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
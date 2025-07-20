package org.prog.session8.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.prog.session7.Allo.AlloUa;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;

//TODO: add allo.ua page and move iphone search there

//TODO: confirm price has ₴ sign in it
public class PageObjectAllo {

    private WebDriver driver;

    public PageObjectAllo(WebDriver driver){
        System.out.println("init page...");
        this.driver = driver;
        System.out.println("init page done");
    }

    public void loadPage(){
        driver.get("https://allo.ua/");
    }

    public void findIphone(){
        WebElement search = driver.findElement(By.xpath("//input[@id='search-form__input']"));
        search.sendKeys("IPhone 16");
        search.sendKeys(Keys.ENTER);
    }


    public void findSymbol(){
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(30L));
        webDriverWait.until(ExpectedConditions.urlContains("result"));


        boolean priceHasCurrency = driver.findElements(By.xpath("//*[contains(text(),'₴')]")).size() > 0;
        System.out.println("My test is Ok");
    }
}
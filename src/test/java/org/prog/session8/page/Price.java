package org.prog.session8.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;

//TODO: add allo.ua page and move iphone search there

//TODO: confirm price has ₴ sign in it

public class Price {
    private WebDriver driver;

    @BeforeSuite
    public void initWebDriver() {
        driver = new ChromeDriver();
    }

    @Test
    public void myAlloTest() {
        driver.get("https://allo.ua/?srsltid=AfmBOopizgWnz4A57ctysWMEfKv5VcPJq0CMLdRR0PWU1H0V9XD9RZxv");

        WebElement search = driver.findElement(By.xpath("//input[@id='search-form__input']"));
        search.sendKeys("IPhone 16");
        search.sendKeys(Keys.ENTER);

        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(30L));
        webDriverWait.until(ExpectedConditions.urlContains("result"));


        boolean priceHasCurrency = driver.findElements(By.xpath("//*[contains(text(),'₴')]")).size() > 0;
        System.out.println("My test is Ok");
    }

    @AfterSuite
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

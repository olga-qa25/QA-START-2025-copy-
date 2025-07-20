package org.prog.session8.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AlloPageTest {

    private WebDriver driver;
    private PageObjectAllo pageObjectAllo;

    @BeforeSuite
    public void initWebDriver() {
        driver = new ChromeDriver();
        pageObjectAllo = new PageObjectAllo(driver);
    }

    @Test
    public void myAlloTest() {
        pageObjectAllo.loadPage();
        pageObjectAllo.findIphone();
        pageObjectAllo.findSymbol();

    }


    @AfterSuite
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            System.out.println("Everything worked out!");
        }
    }

}

package org.prog.session8.page;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


//TODO: add allo.ua page and move iphone search there
//TODO: confirm price has ₴ sign in it


public class GooglePage {

    private final WebDriver driver;

    public GooglePage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Load Google Page")
    public void loadPage() {
        driver.get("https://www.google.com");
    }

    public boolean isCookiesPresent() {
        List<WebElement> cookies = driver.findElements(By.xpath(
                "//a[contains(@href, 'technologies/cookies')]"));
        if (!cookies.isEmpty()) {
            return cookies.get(0).isDisplayed();
        } else {
            return false;
        }
    }

    @Step("Accept Cookies on Google main page if Cookies are visible")
    public void acceptCookiesIfPresent() {
        if (isCookiesPresent()) {
            driver.findElements(By.tagName("button")).get(4).click();
        }
    }

    @Step("Search for Ben Affleck")
    public void searchForSomething() {
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("Ben Affleck");
        search.sendKeys(Keys.ENTER);
    }

    public void setSearchFieldValue(String value) {
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys(value);
    }

    public String getSearchFieldValue() {
        WebElement search = driver.findElement(By.name("q"));
        return search.getAttribute("value");
    }
}

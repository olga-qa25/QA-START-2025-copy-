package org.prog.session14;

import lombok.SneakyThrows;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
import java.util.HashMap;

public class WebDriverFactory {

    @SneakyThrows
    public static WebDriver getDriver() {
        String browser = System.getProperty("browser", "local_chrome");
        switch (browser) {
            case "local_chrome":
                return new ChromeDriver();
            case "local_edge":
                return new EdgeDriver();
            case "local_grid":
                return new RemoteWebDriver(new URL("http://localhost:4444"), remoteChrome());
            case "jenkins_grid":
                return new RemoteWebDriver(new URL("http://selenium-hub:4444"), remoteChrome());
            default:
                return new FirefoxDriver();
        }
    }

    public static ChromeOptions remoteChrome() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setAcceptInsecureCerts(true);
        chromeOptions.addArguments("--remote-allow-origins=*");
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.setCapability("selenoid:options", new HashMap<String, Object>() {{
            put("enableVideo", true);
            put("enableVNC", true);
        }});
        return chromeOptions;
    }
}

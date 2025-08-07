package org.prog.session12;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.prog.session11.steps.DBSteps;
import org.prog.session11.steps.WebSteps;
import org.prog.session14.DBConnectionFactory;
import org.prog.session14.WebDriverFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;

@CucumberOptions(
//        tags = "@work-in-progress",
        features = "src/test/resources/features",
        glue = "org.prog.session11.steps",
        plugin = {
                "pretty",
                "json:target/cucumber-reports/Cucumber.json",
                "html:target/cucumber-report.html"
        }
)
public class CucumberRunner extends AbstractTestNGCucumberTests {

    @BeforeSuite
    public void beforeSuite() throws ClassNotFoundException, SQLException, MalformedURLException {
        WebSteps.driver = WebDriverFactory.getDriver();
        DBSteps.connection = DBConnectionFactory.getConnection();
    }

    @AfterSuite
    public void tearDown() throws SQLException {
        if (WebSteps.driver != null) {
            WebSteps.driver.quit();
        }
        if (DBSteps.connection != null) {
            DBSteps.connection.close();
        }
    }

    private static ChromeOptions remoteChrome() {
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

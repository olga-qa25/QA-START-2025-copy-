package org.prog.session13;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.prog.session11.steps.DBSteps;
import org.prog.session11.steps.WebSteps;
import org.prog.session14.DBConnectionFactory;
import org.prog.session14.WebDriverFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.sql.SQLException;

@CucumberOptions(
//        tags = "@work-in-progress",
        features = "src/test/resources/features",
        glue = "org.prog.session11.steps",
        plugin = {
                "pretty",
                "json:target/cucumber-reports/Cucumber.json",
                "html:target/cucumber-report.html",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
        }
)
public class CucumberRunner extends AbstractTestNGCucumberTests {

    @BeforeSuite
    public void beforeSuite() {
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


}

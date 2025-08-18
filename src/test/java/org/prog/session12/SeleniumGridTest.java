import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumGridTest {
    public static void main(String[] args) throws MalformedURLException {
        // Адрес Selenium Grid Hub
        URL gridUrl = new URL("http://localhost:4444/wd/hub");

        // Настройки браузера (можно поменять на firefox)
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");

        // Создаем удалённый драйвер
        WebDriver driver = new RemoteWebDriver(gridUrl, capabilities);

        // Тест: открыть сайт и вывести заголовок
        driver.get("https://www.google.com");
        System.out.println("Title is: " + driver.getTitle());

        driver.quit();
    }
}

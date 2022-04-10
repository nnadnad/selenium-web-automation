package driver;

import lombok.SneakyThrows;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;
import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URI;

public class FirefoxDriver implements DriverSource {
    @SneakyThrows
    @Override
    public WebDriver newDriver() {
        EnvironmentVariables properties = SystemEnvironmentVariables.createEnvironmentVariables();
        DesiredCapabilities capabilities = new DesiredCapabilities();
        WebDriver driver;
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        capabilities.setCapability("browserName", "firefox");
        capabilities.setCapability("browserVersion", "98.0");
        driver = new RemoteWebDriver(URI.create(properties.getProperty("endpoint")).toURL(), capabilities);
        driver.manage().window().maximize();
        return driver;
    }

    @Override
    public boolean takesScreenshots() {
        return false;
    }
}

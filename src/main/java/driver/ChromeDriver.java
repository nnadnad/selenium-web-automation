package driver;

import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.WebDriver;

public class ChromeDriver implements DriverSource {
    @Override
    public WebDriver newDriver() {
//        EnvironmentVariables properties
        return null;
    }

    @Override
    public boolean takesScreenshots() {
        return false;
    }
}

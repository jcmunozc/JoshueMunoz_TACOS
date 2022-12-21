package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

import java.io.File;

public class BaseTest {

    public WebDriver driver = getDriver();

    private WebDriver getDriver() {
        setupDriver();
        driver.manage().window().maximize();
        driver.get("https://sheltered-mesa-19374.herokuapp.com/");
        return driver;
    }

    private void setupDriver() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + File.separator +
                "chromedriver" + File.separator + "chromedriver");
        driver = new ChromeDriver();
    }

    @AfterMethod(alwaysRun = true)
    public void afterTest() {
        driver.quit();
    }
}

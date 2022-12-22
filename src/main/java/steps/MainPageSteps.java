package steps;

import elements.MainPageElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import javax.xml.bind.Element;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class MainPageSteps extends BaseSteps {

    MainPageElements mainPageElements = PageFactory.initElements(webDriver, MainPageElements.class);

    public MainPageSteps(WebDriver webDriver) {
        super(webDriver);
    }

    Wait<WebDriver> wait = new FluentWait<WebDriver>(webDriver).withTimeout(
            Duration.ofSeconds(20)).pollingEvery(Duration.ofMillis(500)).ignoring(NoSuchElementException.class);

    private static final String username = "joshuuu";
    private static final String password = "G7vnvnomads";

    public void logIn() {
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        mainPageElements.getTxtUsername().sendKeys(username);
        mainPageElements.getTxtPassword().sendKeys(password);
        mainPageElements.getBtnLogIn().click();
    }

    public void navigateToNewPost() {
        wait.until(ExpectedConditions.visibilityOf(mainPageElements.getBtnNewPost()));
        mainPageElements.getBtnNewPost().click();
    }

    public String getUsername() {
        return username;
    }
}

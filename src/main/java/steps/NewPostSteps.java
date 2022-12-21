package steps;

import elements.NewPostElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.NoSuchElementException;

public class NewPostSteps extends BaseSteps {

    NewPostElements newPostElements = PageFactory.initElements(webDriver, NewPostElements.class);
    public NewPostSteps(WebDriver webDriver) { super(webDriver); }

    Wait<WebDriver> wait = new FluentWait<WebDriver>(webDriver).withTimeout(
            Duration.ofSeconds(20)).pollingEvery(Duration.ofMillis(500)).ignoring(NoSuchElementException.class);

    public void createNewPost(String title, String subtitle, String body) {
        wait.until(ExpectedConditions.visibilityOf(newPostElements.getTxtTitle()));
        newPostElements.getTxtTitle().sendKeys(title);
        newPostElements.getTxtSubtitle().sendKeys(subtitle);
        newPostElements.getTxtBody().sendKeys(body);
        newPostElements.getBtnCreate().click();
    }

    public void validateNewPost(String title, String subtitle, String body) {

    }
}

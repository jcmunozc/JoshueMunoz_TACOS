package steps;

import elements.NewPostElements;
import elements.PostsElements;
import net.bytebuddy.build.Plugin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import tests.CustomAssertions;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.NoSuchElementException;

public class NewPostSteps extends BaseSteps {

    private static final String dateFormat = "MMM. dd, yyyy, K:mm";

    NewPostElements newPostElements = PageFactory.initElements(webDriver, NewPostElements.class);
    PostsElements postsElements = PageFactory.initElements(webDriver, PostsElements.class);
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

    public void validateNewPost(String title, String subtitle, String body, String username) {
        DateTimeFormatter actualDate = DateTimeFormatter.ofPattern(dateFormat);
        LocalDateTime dateTimeNow = LocalDateTime.now();

        wait.until(ExpectedConditions.visibilityOf(postsElements.getLblVerifyTitle()));
        CustomAssertions.isTitleEquals(title, webDriver.getTitle());
        CustomAssertions.isTextEquals(subtitle, postsElements.getLblVerifySubtitle().getText());
        CustomAssertions.isTextEquals(body, postsElements.getLblVerifyBody().getText());
        CustomAssertions.textContains(username, postsElements.getLblPostDetails().getText());
        CustomAssertions.textContains(actualDate.format(dateTimeNow), postsElements.getLblPostDetails().getText());
    }

    public void validateTitleRequired() {
        wait.until(ExpectedConditions.visibilityOf(newPostElements.getTxtTitle()));
        CustomAssertions.isElementDisplayed(newPostElements.getLblTitleRequired().isDisplayed(), webDriver.getTitle());
    }

    public void validateSubtitleRequired() {
        wait.until(ExpectedConditions.visibilityOf(newPostElements.getTxtTitle()));
        CustomAssertions.isElementDisplayed(newPostElements.getLblSubtitleRequired().isDisplayed(),
                webDriver.getTitle());
    }
}

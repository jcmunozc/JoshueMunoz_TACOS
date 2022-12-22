package tests;

import org.testng.annotations.Test;
import steps.MainPageSteps;
import steps.NewPostSteps;

public class FeatureOneTests extends BaseTest {
    MainPageSteps mainPageSteps = new MainPageSteps(driver);
    NewPostSteps newPostSteps = new NewPostSteps(driver);

    public static final String title = "This is a test";
    public static final String subtitle = "an automated test execution";
    public static final String body = "This is... I want a taco not TACOS.";

    @Test
    public void testLogin() {
        mainPageSteps.logIn();
    }

    @Test(groups = "Feature1")
    public void testNewPostSuccessful() {
        mainPageSteps.logIn();
        mainPageSteps.navigateToNewPost();
        newPostSteps.createNewPost(title, subtitle, body);
        newPostSteps.validateNewPost(title, subtitle, body, mainPageSteps.getUsername());
    }

    @Test(groups = "Feature1")
    public void testNewPostMissingTitle() {
        mainPageSteps.logIn();
        mainPageSteps.navigateToNewPost();
        newPostSteps.createNewPost(" ", subtitle, body);
        newPostSteps.validateTitleRequired();
    }

    @Test(groups = "Feature1")
    public void testNewPostMissingSubtitle() {
        mainPageSteps.logIn();
        mainPageSteps.navigateToNewPost();
        newPostSteps.createNewPost(title, " ", body);
        newPostSteps.validateSubtitleRequired();
    }

}

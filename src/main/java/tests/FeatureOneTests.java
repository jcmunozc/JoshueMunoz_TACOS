package tests;

import org.testng.annotations.Test;
import steps.MainPageSteps;
import steps.NewPostSteps;

public class FeatureOneTests extends BaseTest {
    MainPageSteps mainPageSteps = new MainPageSteps(driver);
    NewPostSteps newPostSteps = new NewPostSteps(driver);

    public static final String title = "This is a test";
    public static final String subtitle = "an automated test execution";
    public static final String body = "This is one test execution";

    @Test
    public void testLogin() {
        mainPageSteps.logIn();
    }

    @Test(groups = "Feature1")
    public void testNewPostSuccessful() {
        mainPageSteps.logIn();
        mainPageSteps.navigateToNewPost();
        newPostSteps.createNewPost(title, subtitle, body);
        newPostSteps.validateNewPost(title, subtitle, body);
    }

}

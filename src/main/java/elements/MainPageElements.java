package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPageElements extends BaseElements {

    public MainPageElements(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(name = "username")
    private WebElement txtUsername;

    @FindBy(name = "password")
    private WebElement txtPassword;

    @FindBy(className = "btn-success")
    private WebElement btnLogIn;

    @FindBy(linkText = "New Post")
    private WebElement btnNewPost;

    @FindBy(linkText = "Posts")
    private WebElement btnPosts;

    @FindBy(linkText = "Log Out")
    private WebElement btnLogOut;

    public WebElement getTxtUsername() {
        return txtUsername;
    }

    public WebElement getTxtPassword() {
        return txtPassword;
    }

    public WebElement getBtnLogIn() {
        return btnLogIn;
    }

    public WebElement getBtnNewPost() {
        return btnNewPost;
    }

    public WebElement getBtnPosts() {
        return btnPosts;
    }

    public WebElement getBtnLogOut() {
        return btnLogOut;
    }
}

package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PostsElements extends BaseElements {

    public PostsElements (WebDriver webDriver){
        super(webDriver);
    }

    @FindBy(xpath = "/html/body/div/h1")
    private WebElement lblVerifyTitle;

    @FindBy(xpath = "/html/body/div/h5")
    private WebElement lblVerifySubtitle;

    @FindBy(xpath = "/html/body/div/p")
    private WebElement lblVerifyBody;

    @FindBy(xpath = "/html/body/div/small")
    private WebElement lblPostDetails;

    @FindBy(className = "btn-outline-primary")
    private WebElement btnEditPost;

    @FindBy(className = "btn-outline-danger")
    private WebElement btnDeletePost;

    public WebElement getLblVerifyTitle() {
        return lblVerifyTitle;
    }

    public WebElement getLblVerifySubtitle() {
        return lblVerifySubtitle;
    }

    public WebElement getLblVerifyBody() {
        return lblVerifyBody;
    }

    public WebElement getLblPostDetails() {
        return lblPostDetails;
    }

    public WebElement getBtnEditPost() {
        return btnEditPost;
    }

    public WebElement getBtnDeletePost() {
        return btnDeletePost;
    }

}

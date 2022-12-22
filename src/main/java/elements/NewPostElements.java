package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class NewPostElements extends BaseElements {

    public NewPostElements(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(id = "id_title")
    private WebElement txtTitle;

    @FindBy(id = "id_subtitle")
    private WebElement txtSubtitle;

    @FindBy(id = "id_body")
    private WebElement txtBody;

    @FindBy(className = "btn-success")
    private WebElement btnCreate;

    @FindBy(id = "error_1_id_title")
    private WebElement lblTitleRequired;

    @FindBy(id = "error_1_id_subtitle")
    private WebElement lblSubtitleRequired;

    @FindBy(id = "error_1_id_body")
    private WebElement lblBodyRequired;

    public WebElement getTxtTitle() {
        return txtTitle;
    }

    public WebElement getTxtSubtitle() {
        return txtSubtitle;
    }

    public WebElement getTxtBody() {
        return txtBody;
    }

    public WebElement getBtnCreate() {
        return btnCreate;
    }

    public WebElement getLblTitleRequired() { return lblTitleRequired; }

    public WebElement getLblSubtitleRequired() { return lblSubtitleRequired; }

    public WebElement getLblBodyRequired() { return lblBodyRequired; }
}

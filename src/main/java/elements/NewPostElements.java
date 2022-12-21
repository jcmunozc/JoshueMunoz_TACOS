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
}

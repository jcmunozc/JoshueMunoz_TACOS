package elements;

import org.openqa.selenium.WebDriver;

public class BaseElements {
    WebDriver _webDriver;

    public BaseElements (WebDriver webDriver) {
        this._webDriver = webDriver;
    }
}

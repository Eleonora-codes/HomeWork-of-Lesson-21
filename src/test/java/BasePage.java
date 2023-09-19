import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class BasePage implements Loadable {
    protected WebDriver driver;

    protected SeleniumActions actions;

    public BasePage(WebDriver webDriver) {
        this.driver = webDriver;
        this.actions = new SeleniumActions(driver);
    }
}


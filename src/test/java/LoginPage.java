import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{


    By emailFieldLocator = By.name("login");
    By passwordFieldLocator = By.name("password");

    By loginButtonLocator = By.name("commit");




    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String email, String password) {
        WebElement emailElement = driver.findElement(emailFieldLocator);
        emailElement.sendKeys(email);
        WebElement passwordElement = driver.findElement(passwordFieldLocator);
        passwordElement.sendKeys(password);
        WebElement buttonElement  = driver.findElement(loginButtonLocator);
        buttonElement.click();
    }

    @Override
    public boolean isDisplayed(){

        boolean isLoginButtonDisplayed= actions.isDisplayed(loginButtonLocator, 10);
        return isLoginButtonDisplayed;
    }
}

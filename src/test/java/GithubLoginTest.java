import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.time.Instant;

public class GithubLoginTest {


    @Test
    //This method is validating that user can log in with valid mail and password.
    //Steps
    // 1. Open https://github.com/login page
    // 2. Input valid email
    // 3. Input valid password
    // 4. Click on 'Sign In' button
    // 5. Validate user is  logged in and the user's page is being displayed.
    public void validLoginEntering() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeDriver driver1 = new ChromeDriver();
        driver1.get("https://github.com/login");

        By locatorOfAvatarElement = By.cssSelector("svg[height = '48']");
        SeleniumActions actions = new SeleniumActions(driver1);
        boolean isLocatorOfAvatarElementDisplayed = actions.isDisplayed(locatorOfAvatarElement, 5);
        Assert.assertTrue(isLocatorOfAvatarElementDisplayed);


        WebElement emailElement = driver1.findElement(By.name("login"));
        emailElement.sendKeys("elinamanukyan3@gmail.com");

        WebElement passwordElement = driver1.findElement(By.name("password"));
        passwordElement.sendKeys("Elin/1234");

        WebElement signinElement = driver1.findElement(By.name("commit"));
        signinElement.click();

        By locatorOfAvatarElement1 = By.cssSelector(".Button-label .avatar.circle");
        SeleniumActions actions1 = new SeleniumActions(driver1);
        boolean isLocatorOfAvatarElement1Displayed = actions.isDisplayed(locatorOfAvatarElement1, 5);
        Assert.assertTrue(isLocatorOfAvatarElement1Displayed);

        WebElement dashboardElement = driver1.findElement(By.className("AppHeader-context-item-label"));
        Assert.assertEquals(dashboardElement.getText(), "Dashboard");

        driver1.quit();
    }


    @Test
    //This method is validating that user cannot log in with invalid password.\
    //Steps
    // 1. Open https://github.com/login page
    // 2. Input valid email
    // 3. Input invalid password
    // 4. Click on 'Sign In' button
    // 5. Validate user is not logged in and "Incorrect username or password" error is displayed
    public void invalidPasswordEntering() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeDriver driver1 = new ChromeDriver();
        driver1.get("https://github.com/login");

        // Wait for the "Sign in to GitHub" link to be visible

        By locatorOfAvatarElement2 = By.cssSelector("svg[height = '48']");
        SeleniumActions actions2 = new SeleniumActions(driver1);
        boolean isLocatorOfAvatarElement2Displayed = actions2.isDisplayed(locatorOfAvatarElement2, 5);
        Assert.assertTrue(isLocatorOfAvatarElement2Displayed);




        WebElement emailElement = driver1.findElement(By.name("login"));
        emailElement.sendKeys("elinamanukyan3@gmail.com");

        WebElement passwordElement = driver1.findElement(By.name("password"));
        passwordElement.sendKeys("Elin/1334");

        WebElement signinElement = driver1.findElement(By.name("commit"));
        signinElement.click();


        WebElement errorElement = driver1.findElement(By.className("js-flash-alert"));
        Assert.assertEquals(errorElement.getText(), "Incorrect username or password.");

        By invalidElement = By.cssSelector("svg[aria-hidden = 'true']");
        SeleniumActions actions22 = new SeleniumActions(driver1);
        boolean invalidElementElementDisplayed = actions22.isDisplayed(invalidElement, 5);
        Assert.assertTrue(invalidElementElementDisplayed);
        driver1.quit();
    }




    @Test
    //This method is validating that user cannot log in with empty password.
    //Steps
    // 1. Open https://github.com/login page
    // 2. Input valid email
    // 3. Click on 'Sign In' button
    // 4. Validate user is not logged in and "Incorrect username or password" error is displayed
    public void emptyPasswordChecking() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeDriver driver1 = new ChromeDriver();
        driver1.get("https://github.com/login");


        By locatorOfAvatarElement3 = By.cssSelector("svg[height = '48']");
        SeleniumActions actions3 = new SeleniumActions(driver1);
        boolean isLocatorOfAvatar3ElementDisplayed = actions3.isDisplayed(locatorOfAvatarElement3, 5);
        Assert.assertTrue(isLocatorOfAvatar3ElementDisplayed);

        WebElement emailElement = driver1.findElement(By.name("login"));
        emailElement.sendKeys("elinamanukyan3@gmail.com");



        WebElement signinElement = driver1.findElement(By.name("commit"));
        signinElement.click();

        WebElement errorElement = driver1.findElement(By.className("js-flash-alert"));
        Assert.assertEquals(errorElement.getText(), "Incorrect username or password.");

        By invalidElement = By.cssSelector("svg[aria-hidden = 'true']");
        SeleniumActions actions33 = new SeleniumActions(driver1);
        boolean invalidElementElement33Displayed = actions33.isDisplayed(invalidElement, 5);
        Assert.assertTrue(invalidElementElement33Displayed);
        driver1.quit();



    }


    @Test
    //This method is validating that user can log in with valid mail and password with different browser( FireFox).
    //Steps
    // 1. Open https://github.com/login page
    // 2. Input valid email
    // 3. Input valid password
    // 4. Click on 'Sign In' button
    // 5. Validate user is  logged in and the user's page is being displayed.
    public void validLoginEntering1() {
        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
        FirefoxDriver driver1 = new FirefoxDriver();
        driver1.get("https://github.com/login");

        By locatorOfAvatarElement3 = By.cssSelector("svg[ height = '48']");
        SeleniumActions actions3 = new SeleniumActions(driver1);
        boolean isLocatorOfAvatar3ElementDisplayed = actions3.isDisplayed(locatorOfAvatarElement3, 5);
        Assert.assertTrue(isLocatorOfAvatar3ElementDisplayed);



        WebElement emailElement = driver1.findElement(By.name("login"));
        emailElement.sendKeys("elinamanukyan3@gmail.com");

        WebElement passwordElement = driver1.findElement(By.name("password"));
        passwordElement.sendKeys("Elin/1234");

        WebElement signinElement = driver1.findElement(By.name("commit"));
        signinElement.click();


        By locatorOfAvatarElement1 = By.cssSelector("svg[height = '32']");
        SeleniumActions actions1 = new SeleniumActions(driver1);
        boolean isLocatorOfAvatarElement1Displayed = actions1.isDisplayed(locatorOfAvatarElement1, 5);
        Assert.assertTrue(isLocatorOfAvatarElement1Displayed);

        WebElement dashboardElement = driver1.findElement(By.className("AppHeader-context-item-label"));
        Assert.assertEquals(dashboardElement.getText(), "Dashboard");

        driver1.quit();
    }

    //This method is validating that user cannot log in with invalid password with different browser ( FireFox ).
    @Test
//This method is validating that user cannot log in with invalid password with different browser ( FireFox ).
    //Steps
    // 1. Open https://github.com/login page
    // 2. Input valid email
    // 3. Input invalid password
    // 4. Click on 'Sign In' button
    // 5. Validate user is not logged in and "Incorrect username or password" error is displayed
    public void invalidPasswordEntering1() {
        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
        FirefoxDriver driver1 = new FirefoxDriver();
        driver1.get("https://github.com/login");

        By locatorOfAvatarElement3 = By.cssSelector("svg[ height = '48']");
        SeleniumActions actions3 = new SeleniumActions(driver1);
        boolean isLocatorOfAvatar3ElementDisplayed = actions3.isDisplayed(locatorOfAvatarElement3, 5);
        Assert.assertTrue(isLocatorOfAvatar3ElementDisplayed);

        WebElement emailElement = driver1.findElement(By.name("login"));
        emailElement.sendKeys("elinamanukyan3@gmail.com");

        WebElement passwordElement = driver1.findElement(By.name("password"));
        passwordElement.sendKeys("Elin/1334");

        WebElement signinElement = driver1.findElement(By.name("commit"));
        signinElement.click();

//        By invalidElement = By.xpath("svg[aria-hidden = 'true']");
//        SeleniumActions actions22 = new SeleniumActions(driver1);
//        boolean invalidElementElementDisplayed = actions22.isDisplayed(invalidElement, 5);
//        Assert.assertTrue(invalidElementElementDisplayed);


        WebElement errorElement = driver1.findElement(By.className("js-flash-alert"));
        Assert.assertEquals(errorElement.getText(), "Incorrect username or password.");

        By invalidElement = By.cssSelector("svg[aria-hidden = 'true']");
        SeleniumActions actions22 = new SeleniumActions(driver1);
        boolean invalidElementElementDisplayed = actions22.isDisplayed(invalidElement, 5);
        Assert.assertTrue(invalidElementElementDisplayed);

        driver1.quit();

    }


    @Test
//This method is validating that user cannot log in with empty password with different browser ( FireFox ).
    //Steps
    // 1. Open https://github.com/login page
    // 2. Input valid email
    // 3. Click on 'Sign In' button
    // 4. Validate user is not logged in and "Incorrect username or password" error is displayed
    public void emptyPasswordChecking1() {
        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
        FirefoxDriver driver1 = new FirefoxDriver();
        driver1.get("https://github.com/login");


        By locatorOfAvatarElement3 = By.cssSelector("svg[ height = '48']");
        SeleniumActions actions3 = new SeleniumActions(driver1);
        boolean isLocatorOfAvatar3ElementDisplayed = actions3.isDisplayed(locatorOfAvatarElement3, 5);
        Assert.assertTrue(isLocatorOfAvatar3ElementDisplayed);

        WebElement emailElement = driver1.findElement(By.name("login"));
        emailElement.sendKeys("elinamanukyan3@gmail.com");



        WebElement signinElement = driver1.findElement(By.name("commit"));
        signinElement.click();

        WebElement errorElement = driver1.findElement(By.className("js-flash-alert"));
        Assert.assertEquals(errorElement.getText(), "Incorrect username or password.");


        By invalidElement = By.cssSelector("svg[aria-hidden = 'true']");
        SeleniumActions actions22 = new SeleniumActions(driver1);
        boolean invalidElementElementDisplayed = actions22.isDisplayed(invalidElement, 5);
        Assert.assertTrue(invalidElementElementDisplayed);

        driver1.quit();
    }
}


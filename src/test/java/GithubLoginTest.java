import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GithubLoginTest {

    @Test
    //positive login case
    public void validLoginEntering() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeDriver driver1 = new ChromeDriver();
        driver1.get("https://github.com/login");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        WebElement emailElement = driver1.findElement(By.name("login"));
        emailElement.sendKeys("elinamanukyan3@gmail.com");

        WebElement passwordElement = driver1.findElement(By.name("password"));
        passwordElement.sendKeys("Elin/1234");

        WebElement signinElement = driver1.findElement(By.name("commit"));
        signinElement.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver1.quit();
    }

    @Test
    public void invalidPasswordEntering() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeDriver driver1 = new ChromeDriver();
        driver1.get("https://github.com/login");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement emailElement = driver1.findElement(By.name("login"));
        emailElement.sendKeys("elinamanukyan3@gmail.com");

        WebElement passwordElement = driver1.findElement(By.name("password"));
        passwordElement.sendKeys("Elin/1334");

        WebElement signinElement = driver1.findElement(By.name("commit"));
        signinElement.click();


        WebElement errorElement = driver1.findElement(By.className("js-flash-alert"));
        Assert.assertEquals(errorElement.getText(), "Incorrect username or password.");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver1.quit();
    }

    @Test
    public void emptyPasswordChecking() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeDriver driver1 = new ChromeDriver();
        driver1.get("https://github.com/login");


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement emailElement = driver1.findElement(By.name("login"));
        emailElement.sendKeys("elinamanukyan3@gmail.com");

        WebElement passwordElement = driver1.findElement(By.name("password"));
        passwordElement.sendKeys(" ");

        WebElement signinElement = driver1.findElement(By.name("commit"));
        signinElement.click();

        WebElement errorElement = driver1.findElement(By.className("js-flash-alert"));
        Assert.assertEquals(errorElement.getText(), "Incorrect username or password.");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver1.quit();
    }


    @Test
    //positive login case
    public void validLoginEntering1() {
        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
        FirefoxDriver driver1 = new FirefoxDriver();
        driver1.get("https://github.com/login");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement emailElement = driver1.findElement(By.name("login"));
        emailElement.sendKeys("elinamanukyan3@gmail.com");

        WebElement passwordElement = driver1.findElement(By.name("password"));
        passwordElement.sendKeys("Elin/1234");

        WebElement signinElement = driver1.findElement(By.name("commit"));
        signinElement.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver1.quit();
    }

    @Test
    public void invalidPasswordEntering1() {
        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
        FirefoxDriver driver1 = new FirefoxDriver();
        driver1.get("https://github.com/login");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement emailElement = driver1.findElement(By.name("login"));
        emailElement.sendKeys("elinamanukyan3@gmail.com");

        WebElement passwordElement = driver1.findElement(By.name("password"));
        passwordElement.sendKeys("Elin/1334");

        WebElement signinElement = driver1.findElement(By.name("commit"));
        signinElement.click();


        WebElement errorElement = driver1.findElement(By.className("js-flash-alert"));
        Assert.assertEquals(errorElement.getText(), "Incorrect username or password.");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver1.quit();

    }


    @Test
    public void emptyPasswordChecking1() {
        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
        FirefoxDriver driver1 = new FirefoxDriver();
        driver1.get("https://github.com/login");


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement emailElement = driver1.findElement(By.name("login"));
        emailElement.sendKeys("elinamanukyan3@gmail.com");

        WebElement passwordElement = driver1.findElement(By.name("password"));
        passwordElement.sendKeys(" ");

        WebElement signinElement = driver1.findElement(By.name("commit"));
        signinElement.click();

        WebElement errorElement = driver1.findElement(By.className("js-flash-alert"));
        Assert.assertEquals(errorElement.getText(), "Incorrect username or password.");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver1.quit();
    }
}


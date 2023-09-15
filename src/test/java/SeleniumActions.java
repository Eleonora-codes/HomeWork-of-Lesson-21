import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumActions {
    private WebDriver driver;
    SeleniumActions (WebDriver driver){
        this.driver = driver;


    }
   public boolean isDisplayed(WebElement e,int timeout){

       try {
           WebDriverWait wait = new WebDriverWait(driver, timeout);
           wait.until(ExpectedConditions.visibilityOf(e));
           return true;
       } catch (Exception a) {
           return false;
       }
   }

   public boolean isDisplayed (By e, int timeout) {
       try {
           WebDriverWait wait = new WebDriverWait(driver, timeout);
           wait.until(ExpectedConditions.visibilityOfElementLocated(e));
           return true;
       } catch (Exception a) {
           return false;
       }

    }

    public boolean isPresent(WebElement e , int timeout){

        try {
            WebDriverWait wait = new WebDriverWait(driver, timeout);
            wait.until(ExpectedConditions.visibilityOf(e));
            return true;
        } catch (Exception a) {
            return false;
        }
}

public boolean isPresent( By e, int timeout) {
    try {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.presenceOfElementLocated(e));
        return true;
    } catch (Exception a) {
        return false;
    }

}

//        public boolean isClickable(By e, int timeout) {
//            try {
//                new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(e));
//            } catch (Exception a){
//                return false;
//            }
//            return true ;
//
//        }

//    public boolean isClickable(WebElement e, int timeout) {
//        try {
//            new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(e));
//        } catch (Exception a){
//            return false;
//        }
//        return true ;
//
//    }



    }




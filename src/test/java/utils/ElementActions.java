package utils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;
import static envsetup.BaseEnv.driver;
public class ElementActions {
    public static WebElement getElement(By locator) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        }
        catch (Exception e) {
            System.out.println("Locator not found within 20 seconds");
        }
        return driver.findElement(locator);
    }
    public static void clickElement(By locator) throws InterruptedException {
        getElement(locator).click();
    }
    public static String getText(By locator) throws InterruptedException {
        return getElement(locator).getText();
    }
    public static void doEnterValue(By locator, String value) throws InterruptedException {
        getElement(locator).clear();
        getElement(locator).sendKeys(value);
    }

}

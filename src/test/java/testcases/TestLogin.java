package testcases;
import listener.Retry;
import envsetup.BaseEnv;
import org.testng.annotations.Test;
import pageobject.LoginLocators;
import testdata.LoginData;

public class TestLogin extends BaseEnv {
    @Test(priority = 1,description = "Login test",retryAnalyzer = Retry.class)
    public void LoginTest() throws InterruptedException {
        driver.get("http://teststore.automationtesting.co.uk/");
        LoginLocators.clickSignInButton();
        LoginLocators.enterEmail(LoginData.userEmail);
        Thread.sleep(2000);
    }
    @Test(priority = 1,description = "Login test",retryAnalyzer = Retry.class)
    public void LoginTest2() throws InterruptedException {
        driver.get("http://teststore.automationtesting.co.uk/");
        LoginLocators.clickSignInButton();
        LoginLocators.enterEmail(LoginData.userEmail);
        Thread.sleep(2000);
    }
}
package testcases;
import listener.Retry;
import envsetup.BaseEnv;
import org.testng.annotations.Test;
import pagelocator.LoginLocator;
import testdata.UserData;
import utils.ElementActions;

public class TestLogin extends BaseEnv {
    @Test(retryAnalyzer = Retry.class)
    public void LoginTest1() throws InterruptedException {
        ElementActions.clickElement(LoginLocator.signin_locator);
        ElementActions.doEnterValue(LoginLocator.email_locator, UserData.userEmail);
    }
}
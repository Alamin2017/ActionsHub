package testcases;
import envsetup.BaseEnv;
import listener.Retry;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagelocator.ProductLocator;
import utils.ElementActions;

public class TestProduct extends BaseEnv {
    @Test(retryAnalyzer = Retry.class)
    public void product_test() throws InterruptedException {
        ElementActions.clickElement(ProductLocator.product_locator);
        Assert.assertEquals(ElementActions.getText(ProductLocator.titleProduct_locator),"HUMMINGBIRD PRINTED T-SHIRT");
    }
}


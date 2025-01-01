package envsetup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
public class BaseEnv {
    public static WebDriver driver;
    public static String browser = "chrome";
    @BeforeMethod
    public void setup() {
        switch (browser) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("http://teststore.automationtesting.co.uk/");
    }
    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}

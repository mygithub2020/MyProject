import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Sharma
 * Date: 1/4/14
 * Time: 12:31 AM
 * To change this template use File | Settings | File Templates.
 */
public class LogInLogOutTest extends BaseCraigsList
{
     /*@BeforeClass
    public void setUp() throws Exception {

        DesiredCapabilities capabillities = DesiredCapabilities.firefox();
        capabillities.setCapability("version", "5.0");
        capabillities.setCapability("platform", Platform.WINDOWS);
        this.driver = new RemoteWebDriver(
                new URL("http://andwhat08:e8b9504d-21fc-44ab-8760-b2a6bde11813@ondemand.saucelabs.com:80/wd/hub"),
                capabillities);
    } */

    /*
    @Parameters({"username", "key", "os", "browser", "browserVersion"})
    @BeforeMethod
    public void setUp(@Optional("andwhat08") String username,
                      @Optional("e8b9504d-21fc-44ab-8760-b2a6bde11813") String key,
                      @Optional("Windows") String os,
                      @Optional("Firefox") String browser,
                      @Optional("25.0") String browserVersion,
                      Method method) throws Exception {

        // Choose the browser, version, and platform to test
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName(browser);
        capabilities.setCapability("version", browserVersion);
        capabilities.setCapability("platform", Platform.WINDOWS);
        capabilities.setCapability("name", method.getName());
        // Create the connection to Sauce Labs to run the tests
        this.driver = new RemoteWebDriver(
                new URL("http://" + username + ":" + key + "@ondemand.saucelabs.com:80/wd/hub"),
                capabilities);
    }
    */

    @BeforeTest
    public void go_to_WebSite()
    {
        driver.get(siteUrl);
    }

    @Test
    public void logIn_Test()

    {

        clickByXpath(BaseCraigsList.myAccount_Link);
        typeByXpath(BaseCraigsList.emailInput_Box, emailLogIn);
        typeByXpath(BaseCraigsList.passwordInput_Box, pswd);
        clickByXpath(BaseCraigsList.logIn_Button);
        String displayed_User_Name = driver.findElement(By.xpath(BaseCraigsList.username_top_Link)).getText();
        Assert.assertEquals(displayed_User_Name, "home of " + emailLogIn);

    }

    @Test
    public void log_Out()
    {
        clickByXpath(BaseCraigsList.logOut_Link);
        String displayed_Logout_Text = driver.findElement(By.xpath(BaseCraigsList.logged_Out_Display)).getText();
        Assert.assertEquals(displayed_Logout_Text, "craigslist: Account Log In");
    }
    @AfterTest
    public void close_Browser()
    {
        driver.quit();
    }

}

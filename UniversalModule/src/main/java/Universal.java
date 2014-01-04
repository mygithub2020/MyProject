import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created with IntelliJ IDEA.
 * User: Sharma
 * Date: 1/3/14
 * Time: 10:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class Universal
{
    public static WebDriver driver = new FirefoxDriver();

    public void clickByXpath(String locator)
    {
        driver.findElement(By.xpath(locator)).click();
    }
    public void typeByXpath(String locator, String value)
    {
        driver.findElement(By.xpath(locator)).sendKeys(value);
    }

}

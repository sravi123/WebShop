package Pages;


import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

public class GeneralActions {

    public static WebDriver driver = null;
    public static final long WAIT = 5;

    public GeneralActions() {

        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    /**
     * A general action to navigate to web page.
     * @param url
     * @author Sravanthi Chitumalla
     */
    public static void urlNavigation(String url) {
        driver.navigate().to(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    /**
     * A general action to wait for an element.
     * @param e Generic object which should be By type
     * @author Sravanthi Chitumalla
     */
    public void waitForVisibility(By e) {

        WebDriverWait wait = new WebDriverWait(driver, WAIT);
        wait.until(ExpectedConditions.visibilityOfElementLocated(e));
    }

    /**
     * A general action to click an element.
     * @param e Generic object which should be By type
     * @author Sravanthi Chitumalla
     */
    public void click(By e) {
        waitForVisibility(e);
        driver.findElement(e).click();
    }

    /**
     * A general action to send data to a element.
     * @param e Generic object which should be By type and data to send
     * @author Sravanthi Chitumalla
     */
    public void sendKeys(By e, String txt) {
        waitForVisibility(e);
        driver.findElement(e).sendKeys(txt);
    }

    /**
     * A general action to find an element.
     * @param element Generic object which should be By type and time units
     * @return WebElement
     * @author Sravanthi Chitumalla
     */
    public WebElement find(final By element, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        return driver.findElement(element);
    }

    /**
     * Sequentially replaces series of 'XXX' within given By locators and
     * replaces it with the new value. Does this by turning the By into a string
     * @param locator      By locator to update
     * @param replaceWith String to replace 'XXX' with
     * @return By which is the newly updated By with its path
     * @author Sravanthi Chitumalla
     */
    public  By replaceXXXFromByLocator(By locator, String replaceWith) throws InterruptedException {
        String elementDescription = locator.toString().substring(locator.toString().lastIndexOf(": ") + 2,
                locator.toString().length()); //locator.toString().lastIndexOf("]") + 1);
        String val = elementDescription.replace("XXX", replaceWith);
        return By.xpath(val);
    }
}



package Pages;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.util.Map;


public class OrderPageObject extends GeneralActions {
    By username = By.xpath("//input[@id='Email']");
    By password = By.xpath("//input[@id='Password']");
    By errormessage = By.xpath(".//*[contains(text(),'Invalid E-mail or Password.')]");
    By LoginBtn = By.xpath("//input[@value='Log in']");
    By Login = By.xpath("//a[contains(text(),'XXX')]");
    By category = By.xpath("//div[@class='listbox']//a[contains(text(),'Books')]");
    By Book = By.xpath("//div[@class='item-box'][1]//div[@class='buttons']/input");
    By shoppingcartbtn = By.xpath("//span[contains(text(),'Shopping cart')]");
    By gotocartbtn = By.xpath("//div[@class='mini-shopping-cart']//div[@class='buttons']/input");
    By agreecheckbox = By.xpath("//input[@id='termsofservice']");
    By checkoutbtn = By.xpath("//button[@id='checkout']");
    By billingaddress = By.xpath("//*[contains(text(),'XXX')]/parent::div/following-sibling::div/div/input");
    By shippingaddress = By.xpath("//*[contains(text(),'XXX')]/parent::div/following-sibling::div/div/input");
    By shippingmethod = By.xpath("//div[@class='section shipping-method']//*[contains(text(),'XXX')]/parent::div/input");
    By shippingmethodctnbtn = By.xpath("//*[contains(text(),'Shipping method')]/parent::div/following-sibling::div/form//input[@type='button']");
    By paymentmethod = By.xpath(" //*[contains(text(),'Payment method')]/parent::div/following-sibling::div//input[@value='Payments.CashOnDelivery']");
    By paymentmethodctnbtn = By.xpath("//*[contains(text(),'Payment method')]/parent::div/following-sibling::div/div/input");
    By paymentinfo = By.xpath("//*[contains(text(),'Payment information')]/parent::div/following-sibling::div//*[contains(text(),'You will pay by COD')]");
    By paymentinfoctnbtn = By.xpath("//*[contains(text(),'Payment information')]/parent::div/following-sibling::div//input");
    By confirmbtn = By.xpath("//input[@value='XXX']");
    By btn = By.xpath("//a[contains(text(),'XXX')]");

    /**
     * Function used to click on visible text.
     * @param txt is a string type on which want to click
     * @author Sravanthi Chitumalla
     */
    public void clickOnVisibletext(String txt) throws InterruptedException {
        By lbtn = replaceXXXFromByLocator(btn, txt);
        waitForVisibility(lbtn);
        Thread.sleep(3000); //required while clicking on log out btn
        click(lbtn);
    }

    /**
     * Function to login to application
     * @param usernametext and passwordtext
     * @author Sravanthi Chitumalla
     */
    public void login(String usernametext, String passwordtext) {
        waitForVisibility(username);
        sendKeys(username,usernametext);
        sendKeys(password,passwordtext);
        click(LoginBtn);
    }

    public void chooseCategory(String txt) throws InterruptedException {
        By ele = replaceXXXFromByLocator(category, txt);
        click(ele);
    }

    public void choosebook() {
        click(Book);
    }

    public void gotoshoppingcart() throws InterruptedException {
        WebElement list = find(shoppingcartbtn, 2);
        Actions a = new Actions(driver);
        Thread.sleep(2000);
        a.moveToElement(list).build().perform();
        click(gotocartbtn);
    }

    public void checkout() {
        click(agreecheckbox);
        click(checkoutbtn);
    }

    public void paymentDetails(Map<String, String> Fields) throws InterruptedException {
        for (String key : Fields.keySet()) {
            switch (key) {
                case "Billing address":
                    By Baddress = replaceXXXFromByLocator(billingaddress, Fields.get(key));
                    click(Baddress);
                    break;
                case "Shipping Address":
                    By saddress = replaceXXXFromByLocator(shippingaddress, Fields.get(key));
                    click(saddress);
                    break;
                case "Shipping method":
                    By smethod = replaceXXXFromByLocator(shippingmethod, Fields.get(key));
                    click(smethod);
                    click(shippingmethodctnbtn);
                    break;
                case "Payment method":
                    click(paymentmethod);
                    click(paymentmethodctnbtn);
                    break;

                    default:
                    throw new IllegalStateException("Unexpected value: " + key);
            }
        }
    }

    public void validateModeOfPayment() {
        Assert.assertTrue(find(paymentinfo, 2).isDisplayed());
        click(paymentinfoctnbtn);
    }

    public void clickOnConfirmbtn(String txt) throws InterruptedException {
        By btn = replaceXXXFromByLocator(confirmbtn, txt);
        waitForVisibility(btn);
        click(btn);
    }
}
   
    
    


    
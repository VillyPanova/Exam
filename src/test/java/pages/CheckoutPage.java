package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage extends BasePage {

    @FindBy (id = "checkout")
    private WebElement checkoutBtn;



    public CheckoutPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public void goToCheckout() {
        WebElement checkoutBtn = driver.findElement(By.id("checkout"));
        checkoutBtn.click();
    }
}

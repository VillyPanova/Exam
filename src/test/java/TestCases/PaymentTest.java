package TestCases;

import base.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class PaymentTest extends TestUtil {
    @Test
    public void PaymentOrder() {
        LoginPage loginPage = new LoginPage(driver);
        ProductPage productPage = loginPage.login("standard_user", "secret_sauce");
        productPage.addItemToTheCart("backpack");
        productPage.goToCart();
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.goToCheckout();
        CheckoutInfoPage checkoutInfoPage = new CheckoutInfoPage(driver);
        checkoutInfoPage.addNames("Violeta", "Panova", "1000");
        CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage(driver);
        checkoutOverviewPage.clickBtn();


        WebElement BackHomeBtn = driver.findElement(By.id("back-to-products"));
        Assert.assertTrue(BackHomeBtn.isDisplayed());
        //Assert.assertNotNull(sumTotalLabel);

    }
}
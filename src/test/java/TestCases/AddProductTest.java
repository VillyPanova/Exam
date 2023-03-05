package TestCases;


import base.TestUtil;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductPage;

public class AddProductTest extends TestUtil {

    @Test
    public void addItemToTheCart() {
        LoginPage lgnPage = new LoginPage(driver);
        ProductPage prPage = lgnPage.login("standard_user", "secret_sauce");
        prPage.addItemToTheCart("backpack");
        prPage.addItemToTheCart("bike-light");

        Assert.assertEquals(prPage.getItemsInTheCart(), 2);
    }
}


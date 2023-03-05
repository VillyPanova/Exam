package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutOverviewPage extends BasePage {

    @FindBy(id = "finish")
    WebElement finishBtn;

    @FindBy (xpath = "//div[@class='summary_total_label']")
    WebElement sumTotalLabel;

    //WebElement sumTotalLabel = driver.findElement (By.className("summary_total_label"));


    public CheckoutOverviewPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickBtn() {

        finishBtn.click();
    }
}




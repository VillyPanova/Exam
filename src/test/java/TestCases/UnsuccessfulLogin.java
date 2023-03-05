package TestCases;

import base.TestUtil;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class UnsuccessfulLogin extends TestUtil {
    @Test (dataProvider = "wrongUser")
    public void UnsuccessfulLogin (String userName, String password)   {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(userName, password);

        WebElement errorMessage = driver.findElement(By.cssSelector("h3[data-test='error']"));
        Assert.assertEquals(errorMessage.getText(),
                "Epic sadface: Username and password do not match any user in this service");

    }

    @DataProvider(name = "wrongUser")
    public static Object[][] readUserFromCsv() {
        try {
            CSVReader csvReader = new CSVReader(new FileReader("src/test/resources/wrongUser.csv"));
            List<String[]> csvData = csvReader.readAll();
            Object[][] csvDataObj = new Object[csvData.size()][2];
            for (int i = 0; i < csvData.size(); i++) {
                csvDataObj[i] = csvData.get(i);
            }
            return csvDataObj;
        } catch (IOException e) {
            System.out.println("Not Possible to find CSV!");
            return null;
        } catch (CsvException e) {
            return null;
        }
    }
}

package TestCases;

import base.TestUtil;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductPage;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class SuccessfulLogin extends TestUtil {
    @Test(dataProvider = "correctUser")
    public void successfulLogin(String userName, String password) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(userName, password);
        ProductPage productPage = new ProductPage(driver);

        Assert.assertEquals(productPage.checkPageHeading(), "PRODUCTS");

    }




    @DataProvider(name = "correctUser")
    public static Object[][] readUserFromCsv() {
        try {
            CSVReader csvReader = new CSVReader(new FileReader("src/test/resources/correctUser.csv"));
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
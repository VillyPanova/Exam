package TestCases;

import base.TestUtil;
import org.testng.annotations.Test;
import pages.LoginPage;

public class SuccesfullLogin extends TestUtil {
    @Test (dataProvider = "correctUser", dataProviderClass = pages.LoginPage.class)
    public void succesfullLogin(String userName, String password) {
        //LoginPage loginPage = new LoginPage(driver);
        //loginPage.login(dataProvider);
        //Assert.assertTrue(productsPageHeading.isDisplayed());
        //Assert.assertEquals(productsPageHeading.getText(), "PRODUCTS");
    }
}
    //@DataProvider(name = "correctUser")
   // public static Object [][] readUserFromCsv() {
       // try {
           // CSVReader csvReader = new CSVReader(new FileReader("src/test/resources/correctUser.csv"));
           // List<String[]> csvData = csvReader.readAll();
           // Object[][] csvDataObj = new Object[csvData.size()][2];
           // for (int i = 0; i < csvData.size(); i++) {
                //csvDataObj[i] = csvData.get(i);
            //}
            //return csvDataObj;
      //  } catch (IOException e) {
        //    System.out.println("Not Possible to find CSV!");
         //  return null;
       // } catch (CsvException e) {
         //   return null;
      //  }
   // }
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Test01 extends BaseTest {

    TabBarPage tabBarPage;

    ResultPage resultPage;

    ProductDetailPage productDetailPage;

    @Test(priority = 1)
    public void searchTest(){
        //driver.get("");
        tabBarPage = new TabBarPage(driver);
        tabBarPage.search("laptop");
    }

    @Test(priority = 2)
    public void resultPageTest(){
        resultPage = new ResultPage(driver);
        WebElement body = driver.findElement(By.tagName("body"));
        body.sendKeys(Keys.PAGE_DOWN);
        WebElement resultElement = resultPage.getResults();
        softAssert.assertTrue(resultElement.isDisplayed());
        resultPage.clickToFirst();
    }

    @Test(priority = 3)
    public void addToCartTest(){
        productDetailPage = new ProductDetailPage(driver);
        productDetailPage.clickToAdd();
        softAssert.assertTrue(tabBarPage.getTotalNum().equals("1"));
    }
}

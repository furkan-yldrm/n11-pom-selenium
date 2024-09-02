import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class TabBarPage {

    private final WebDriver driver;

    private final By searchLocator = By.id("searchData");

    private final By totalNumLocator = By.className("basketTotalNum");


    public TabBarPage(WebDriver driver){
        this.driver = driver;
    }

    public void search(String value){
        driver.findElement(searchLocator).sendKeys(value+ Keys.ENTER);
    }

    public String getTotalNum(){
        return driver.findElement(totalNumLocator).getText();
    }

}

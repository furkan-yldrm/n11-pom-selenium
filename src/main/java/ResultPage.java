import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResultPage {

    private final WebDriver driver;

    private final By resultLocator = By.className("resultText");

    private final By productNameLocator = By.className("productName");


    public ResultPage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement getResults(){
        return driver.findElement(resultLocator);
    }

    public void clickToFirst(){
        driver.findElement(productNameLocator).click();
    }
}

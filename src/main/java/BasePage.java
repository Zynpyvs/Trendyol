import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

public class BasePage {


    WebDriver driver;

   // List<WebElement> products = driver.findElements(new By.ByClassName("p-card-wrppr with-campaign-view"));



    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement find(By locator) {
        return driver.findElement(locator);
    }

    public void switchToSecondTab(){
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
    }

    public List<WebElement> findALL(By locator) {

        return driver.findElements(locator);
    }

    public void click(By locator) {
        find(locator).click();

    }

    public void type(By locator, String text) {
        find(locator).sendKeys(text);
    }

    public boolean isDisplayed(By locator) {
        return find(locator).isDisplayed();
    }
}
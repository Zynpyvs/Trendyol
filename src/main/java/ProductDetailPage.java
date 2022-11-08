import org.apache.log4j.lf5.LogRecord;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class ProductDetailPage extends  BasePage {

    By addToCartLocator =  new By.ByCssSelector("#product-detail-app > div > div.flex-container > div.product-container > div:nth-child(2) > div.container-right-content > div.product-button-container > button > div.add-to-basket-button-text");
    By overlay = new By.ByXPath("/html/body/div[1]/div[3]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[4]/div[1]/div/div[2]/div[1]/a/div[2]");
    By productNameLocator = new By.ByClassName("p-card-wrppr with-campaign-view");


    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductDetailPage() {
        return isDisplayed(addToCartLocator);
    }

    public void addToCart() {
        click(addToCartLocator);
    }

    public void anyClick() {
        //$('.overlay').click()

        WebElement backGround = driver.findElement(By.className("overlay"));
        backGround.click();

    }

    private List<WebElement> anyClickLocator(int i) {
        return findALL(overlay);
    }


    private List<WebElement> getAllProducts(){
        return findALL(productNameLocator);
    }


}


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.Console;
import java.util.List;


public class ProductsPage extends BasePage {

    By shippingLocator=  new By.ByCssSelector("flotr-item-text chckd ctgry");
    By productNameLocator=  new By.ByClassName("product-down");


    public ProductsPage(WebDriver driver) {
        super(driver);

    }

   public boolean isOnProductPage() {
     return  isDisplayed(shippingLocator);

    }

    public void selectProduct(int i) {
        getAllProducts().get(i).click();
    }

    private List<WebElement> getAllProducts(){
        return findALL(productNameLocator);
    }
}

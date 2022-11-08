import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartPage  extends  BasePage{

    By productsNameLocator=new By.ByClassName("pb-item");
    public CartPage(WebDriver driver) {
        super(driver);

    }
    public boolean checkıfProductAdded() {
        return getProducts().size() > 0;
    }
    private List<WebElement> getProducts(){
        return findALL(productsNameLocator);
    }
}

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import javax.naming.directory.DirContext;

public class HomePage extends  BasePage {

    SearchBox searchBox;

    By cartCountLocator= By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[3]/div/div/div/div[2]/a");
    By acceptCookiesLocator= new By.ById("onetrust-accept-btn-handler");
By cartContainerLocator=By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[3]/div/div/div/div[2]/a/p");

   public HomePage(WebDriver driver) {
        super(driver);
        searchBox=new SearchBox(driver);
    }
    public  SearchBox searchBox() {
        return this.searchBox;
    }

    public boolean isProductCountUp() {
         return getCartCount()>0;
    }

    public void goToCart() {
        click(cartContainerLocator);
    }

    private int getCartCount(){
      String count = find(cartCountLocator).getText();
      return Integer.parseInt(count);
    }
public void acceptCookies(){
        if(isDisplayed(acceptCookiesLocator)){
        click (acceptCookiesLocator);
}


}
}
import org.junit.jupiter.api.Assertions;
        import org.junit.jupiter.api.Order;
        import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class Test_Process extends Base_Test {

    HomePage homePage;
    ProductsPage productsPage;
    ProductDetailPage productDetailPage;
    CartPage cartPage;

    @Test
    @Order(1)
    public void search_a_product() throws InterruptedException {
        homePage= new HomePage(driver);
        homePage.acceptCookies();
        productsPage= new ProductsPage(driver);
        homePage.searchBox().search("sort");
        Thread.sleep(5000);
        productDetailPage=new ProductDetailPage(driver);
        productDetailPage.anyClick();
      //Assertions.assertTrue(productsPage.isOnProductPage(),"Not on products page!");
    }
    @Test
    @Order(2)
    public void select_a_product() {
        productsPage.selectProduct(1);
        //Assertions.assertTrue(productDetailPage.isOnProductDetailPage(), "Not on product detail page!");

    }

    @Test
    @Order(3)
    public void add_product_to_cart() throws InterruptedException {
        productsPage.switchToSecondTab();
        Thread.sleep(3000);
        productDetailPage.addToCart();
        Thread.sleep(3000);
        //Assertions.assertTrue(homePage.isProductCountUp(), "Product count did not increase!");

    }
    @Test
    @Order(4)
    public void go_to_cart(){
        cartPage=new CartPage(driver);
        homePage.goToCart();
        //Assertions.assertTrue(cartPage.checkıfProductAdded(), "Product was not added to cart!");


    }
}


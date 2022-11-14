import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static jdk.nashorn.internal.objects.NativeJava.type;

public class SearchBox  extends  BasePage {

    By searchBoxLocator = By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div/div[1]/input");
    By submitButtonLocator = By.xpath("/html/body/div[1]/div[1]/div/div[2]/div/div/div[2]/div/div/div/i");


    public SearchBox(WebDriver driver) {
        super(driver);

    }

    public void search(String text) {
        type(searchBoxLocator, text);
        click(submitButtonLocator);
        click(submitButtonLocator);
        click(submitButtonLocator);
    }
}


package PageModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class BasketModel extends BaseModel {
    public static By hdBasket = By.className("basket_headerTop_15H0U");
    public static By basketItemCount = By.className("basket_item_1rDra");
    public static By productItemCount = By.xpath("/html/body/div/div/div/div[2]/div/div[2]/section/section/ul/li/div/div/div[2]/div[4]/div[2]/div/input");
    public static By btnCompleteShopping = By.id("continue_step_btn");

    public String chekIfBasketOpenPage() {
        return getText(hdBasket);
    }

    public List<WebElement> chekIfBasketItemCount(){
        return findElements(basketItemCount);
    }

    public String chekIfProductItemCount() {
        return getAttribute(productItemCount,"value");
    }

    public void clickCompleteShopping(){
        clickElement(btnCompleteShopping);
    }
}

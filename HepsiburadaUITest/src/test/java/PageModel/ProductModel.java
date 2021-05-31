package PageModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class ProductModel extends BaseModel {

    public static By productCount = By.className("search-item");
    public static By btnAddToBasket = By.cssSelector("ul > li:nth-child(2) > div > a > div.product-detail > span.info.add-to-cart.on-hover.hb-pl-cn.no-bg > button");
    public static By productImage = By.xpath("/html/body/div[3]/main/div[2]/div/div/div/div/div[2]/section/div[1]/div[4]/div/div/div/div/ul/li[1]/div/a/div[1]/figure/div");
    public static By btnBasket = By.id("shoppingCart");

    public List<WebElement> checkIfProductCount(){
        return findElements(productCount);
    }

    public void clickAddToBasket() {
        scrollToElement("500");
        moveToElement (productImage);
        clickElement(btnAddToBasket);
    }

    public void clickBasket() {
        scrollToElement("1");
        clickElement(btnBasket);
    }
}

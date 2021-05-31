package PageModel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class MyOrdersModel extends BaseModel {

    public static By hdMyOrders = By.cssSelector("div.main__container__title > h1");
    public static By order = By.xpath("/html/body/div/div/section/div/div[5]/div[1]/div[2]/div");
    public static By btnCancel = By.className("cancel-line-item-button");
    public static By rdSelectOrder = By.className("solo-checkbox");
    public static By reasonForProductCancellation = By.xpath("/html/body/div[4]/div/div/div[2]/div/div/div[1]/div/div[2]/div/div/div/div/div[2]/div");
    public static By btnCancelSelectedProducts = By.className("solo-button solo-button--style-primary");
    public static By canceledProducts = By.cssSelector("#xu02num9uvlbo6gw39kxp9 > div > div > div > h5");
    public static By reasonProductCancellation = By.xpath("/html/body/div[4]/div/div/div[2]/div/div/div[1]/div/div[2]/div/div/div/div/div[1]");

    public boolean chekIfMyOrdersOpenPage() {
        return displayed(hdMyOrders);
    }

    public void clickOrder() {
        clickElement(order);
    }

    public void clickCancel() {
        clickElement(btnCancel);
    }

    public void clickSelectOrder() {
        clickElement(rdSelectOrder);
    }

    public void clickReasonForProductCancellation() {
        sendKeys(reasonProductCancellation,"Ürünleri almaktan vazgeçtim");
        webDriver.findElement(reasonProductCancellation).sendKeys(Keys.ENTER);
    }

    public void clickCancelSelectedProducts() {
        clickElement(btnCancelSelectedProducts);
    }

    public String chekIfCanceledProducts() {
        return getText(canceledProducts);
    }
}

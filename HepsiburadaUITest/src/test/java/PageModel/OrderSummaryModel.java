package PageModel;

import org.openqa.selenium.By;

public class OrderSummaryModel extends BaseModel {

    public static By hdOrderSummary = By.className("order_details_2l_7F");
    public static By orderReceivedMessage = By.cssSelector("div.order_details_2l_7F > div.caption_20JUG > h1");
    public static By btnMyOrders = By.xpath("/html/body/div[1]/div/div/div[1]/div/div/div/div/div/div/div/div[4]/div[1]/div/a/div");

    public boolean chekIfOrderSummaryOpenPage() {
        return displayed(hdOrderSummary);
    }

    public String chekIfOrderReceivedMessage() {
        return getText(orderReceivedMessage);
    }

    public void clickMyOrders() {
        clickElement(btnMyOrders);
    }
}

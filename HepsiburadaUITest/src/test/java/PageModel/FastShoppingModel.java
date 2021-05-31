package PageModel;

import org.openqa.selenium.By;

public class FastShoppingModel extends BaseModel {

    public static By hdFastShopping = By.cssSelector("div.shipping_container_3UOwQ > h2");
    public static By registeredDeliveryAddress = By.cssSelector("div.shipping_container_3UOwQ > div > div");
    public static By preInformationForm = By.xpath("/html/body/div/div/div/div[1]/div/div[2]/div/div/div[1]/div[2]/div/label/div/div[3]");
    public static By btnContinue = By.id("continue_step_btn");

    public String checkIfFastShoppingOpenPage() {
        return getText(hdFastShopping);
    }

    public boolean checkIfRegisteredDeliveryAddress() {
        return displayed(registeredDeliveryAddress);
    }

    public void clickPreInformationForm() {
        clickElement(preInformationForm);
    }

    public void clickContinue() {
        clickElement(btnContinue);
    }
}

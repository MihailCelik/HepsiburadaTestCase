package PageModel;

import org.openqa.selenium.By;

public class LoginModel extends BaseModel {

    public static By tdLogin = By.cssSelector("div._1TxjTFlVZPBnn-I7vOVL2U._2kBZQPq-lRfZa5Zbc9SbZn > div");
    public static By txtEmail = By.id("txtUserName");
    public static By txtPassword = By.id("txtPassword");
    public static By btnLogin = By.id("btnLogin");

    public String chekIfLoginOpenPage() {
        return getText(tdLogin);
    }

    public void setEmail(String name){
        sendKeys(txtEmail,name);
    }

    public void setPassword(String password){
        sendKeys(txtPassword,password);
    }

    public void clickLogin(){
        clickElement(btnLogin);
    }
}

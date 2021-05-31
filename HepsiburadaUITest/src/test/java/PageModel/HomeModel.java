package PageModel;

import org.openqa.selenium.By;

public class HomeModel extends  BaseModel{

    public static By tdOldHeader = By.className("sf-OldHeader-1NFKi");
    public static By btnAccount = By.id("myAccount");
    public static By btnLogin = By.id("login");
    public static By tdMyAccount = By.xpath("//*[@class='sf-OldMyAccount-1k66b']");
    public static By txtSearchBox = By.cssSelector("div.desktopOldAutosuggestTheme-container > input");
    public static By btnSearch = By.cssSelector("div.SearchBoxOld-buttonContainer");

    public void userVisitSite(String url){
        webDriver.get(url);
    }

    public String checkIfLoginOpenPage() {
        return getAttribute(tdOldHeader,"title");
    }

    public void clickAccount(){
        clickElement(btnAccount);
    }

    public void clickLogin(){
        clickElement(btnLogin);
    }

    public String chekIfLogin() {
        return getAttribute(tdMyAccount,"title");
    }

    public void clickSearchBox(){
        clickElement(txtSearchBox);
    }

    public void setSearchBox(String productName){
        sendKeys(txtSearchBox, productName);
    }

    public void clickSearch(){
        clickElement(btnSearch);
    }
}

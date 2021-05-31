package Tests;

import PageModel.HomeModel;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;

public class HomeTest {

    HomeModel homeModel = new HomeModel();

    @Step("<key> sayfası açılır")
    public void userVisitSite(String key){
        homeModel.userVisitSite(key);
    }

    @Step("Hepsiburada Ana sayfasının açıldığı görülür")
    public void checkIfLoginOpenPage(){
        Assert.assertEquals("Hepsiburada sayfasi acilmadi", "Hepsiburada",homeModel.checkIfLoginOpenPage());
    }

    @Step("Giriş Yap veya üye ol butonuna tıklanılır")
    public void clickAccount(){
        homeModel.clickAccount();
    }

    @Step("Giriş yap yazısına tıklanılır")
    public void clickLogin(){
        homeModel.clickLogin();
    }

    @Step("Kullanıcı hesabına giriş yapıldığı görülür")
    public void chekIfCreateAccount(){
        Assert.assertNotEquals("Kullanici hesabina giris yapilamadi", "veya üye ol",homeModel.chekIfLogin());
    }

    @Step("Ürün, kategori veya marka ara çubuğuna tıklanılır")
    public void clickSearchBox(){
        homeModel.clickSearchBox();
    }

    @Step("Ürün, kategori veya marka ara çubuğuna <key> yazılır")
    public void setSearchBox(String productName){
        homeModel.setSearchBox(productName);
    }

    @Step("Ara butonuna tıklanılır")
    public void clickSearch(){
        homeModel.clickSearch();
    }
}

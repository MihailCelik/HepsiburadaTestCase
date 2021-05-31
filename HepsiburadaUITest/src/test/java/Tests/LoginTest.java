package Tests;

import PageModel.LoginModel;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;

public class LoginTest {

    LoginModel loginModel = new LoginModel();

    @Step("Giriş Yap ekranının açıldığı görülür")
    public void chekIfRegisterPage(){
        Assert.assertEquals("Giris Yap sayfasi acilmadi", "Giriş yap",loginModel.chekIfLoginOpenPage());
    }

    @Step("E-posta adresi alanına <key> yazılır")
    public void setEmail(String email){
        loginModel.setEmail(email);
    }

    @Step("Şifre alanına <key> yazılır")
    public void setPassword(String password){
        loginModel.setPassword(password);
    }

    @Step("Giriş Yap butonuna tıklanılır")
    public void clickLogin(){
        loginModel.clickLogin();
    }
}

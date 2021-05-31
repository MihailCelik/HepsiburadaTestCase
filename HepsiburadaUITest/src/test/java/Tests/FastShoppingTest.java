package Tests;

import PageModel.FastShoppingModel;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;

public class FastShoppingTest {

    FastShoppingModel fastShoppingModel = new FastShoppingModel();

    @Step("Hızlı alışveriş sayfasının açıldığı görülür")
    public void chekIfPaymentMethodOpenPage(){
        Assert.assertEquals("Hizli alisveris sayfasi acilmadi", "Teslimat adresi", fastShoppingModel.checkIfFastShoppingOpenPage());
    }

    @Step("Adresin kayıtlı olduğu görülür")
    public void checkIfRegisteredDeliveryAddress(){
        Assert.assertTrue("Adres kayitli degil",fastShoppingModel.checkIfRegisteredDeliveryAddress());
    }

    @Step("Ön bilgilendirme formunu ve Mesafeli satış sözleşmesini onaylıyorum tıklanılır")
    public void clickPreInformationForm(){
        fastShoppingModel.clickPreInformationForm();
    }

    @Step("Hızlı alışveriş sayfasındaki Siparişi Onayla butonuna tıklanılır")
    public void clickContinue(){
        fastShoppingModel.clickContinue();
    }
}

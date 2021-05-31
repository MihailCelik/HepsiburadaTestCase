package Tests;

import PageModel.MyOrdersModel;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;

public class MyOrdersTest {

    MyOrdersModel myOrdersModel = new MyOrdersModel();

    @Step("Siparişlerim sayfasının açıldığı görülür")
    public void chekIfBasketHeader(){
        Assert.assertTrue("Siparislerim sayfasi acilmadi", myOrdersModel.chekIfMyOrdersOpenPage());
    }

    @Step("İptal edilecek siparişe tıklanılır")
    public void clickOrder(){
        myOrdersModel.clickOrder();
    }

    @Step("İptal et butonuna tıklanılır")
    public void clickMyOrder(){
        myOrdersModel.clickCancel();
    }

    @Step("İptal edilecek ürün seçilir")
    public void clickSelectOrder(){
        myOrdersModel.clickSelectOrder();
    }

    @Step("Bu ürünün neden iptal edildiği seçilir")
    public void clickReasonForProductCancellation(){
        myOrdersModel.clickReasonForProductCancellation();
    }

    @Step("Seçili ürünleri iptal et bunonuna basılır")
    public void clickCancelSelectedProducts(){
        myOrdersModel.clickCancelSelectedProducts();
    }

    @Step("Siparişin iptal olduğu görülür")
    public void chekIfCanceledProducts(){
        Assert.assertEquals("Siparislerim sayfasi acilmadi", "İptal edilen ürünleriniz",myOrdersModel.chekIfCanceledProducts());
    }
}

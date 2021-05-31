package Tests;

import PageModel.OrderSummaryModel;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;

public class OrderSummaryTest {

    OrderSummaryModel orderSummaryModel = new OrderSummaryModel();

    @Step("Sipariş Özeti sayfasının açıldığı görülür")
    public void chekIfBasketHeader(){
        Assert.assertTrue("Siparis ozeti sayfasi acilmadi", orderSummaryModel.chekIfOrderSummaryOpenPage());
    }

    @Step("Siparişiniz alındı mesajı görülür")
    public void chekIfCreateAccount(){
        Assert.assertEquals("Siparis islemi gerceklesmistir", "Siparişiniz alındı",orderSummaryModel.chekIfOrderReceivedMessage());
    }

    @Step("Siparişlerim butonuna tıklanılır")
    public void clickMyOrders(){
        orderSummaryModel.clickMyOrders();
    }
}

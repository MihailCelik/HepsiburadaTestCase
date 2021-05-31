package Tests;

import PageModel.BasketModel;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;

public class BasketTest {

    BasketModel basketModel = new BasketModel();

    @Step("Sepet sayfasının açıldığı görülür")
    public void chekIfBasketHeader(){
        Assert.assertEquals("Sepetim sayfasi acilmadi", "Sepetim", basketModel.chekIfBasketOpenPage());
    }

    @Step("Sepette 1 ürün olduğu görülür")
    public void chekIfBasketItemCount(){
        Assert.assertEquals("Sepet bos veya birden fazla urun icermektedir", 1, basketModel.chekIfBasketItemCount().size());
        Assert.assertEquals("Sepette aynı üründen birden fazla var", "1", basketModel.chekIfProductItemCount());
    }

    @Step("Alışverişi tamamla butonuna tıklanılır")
    public void clickCompleteTheExchange(){
        basketModel.clickCompleteShopping();
    }
}

package Tests;

import PageModel.ProductModel;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;

public class ProductTest {
    ProductModel productModel = new ProductModel();

    @Step("Aranan ürünün listelendiği görülür")
    public void chekIfCreateAccount(){
        Assert.assertTrue("Aranan ürün listelenemedi",productModel.checkIfProductCount().size()>0);
    }

    @Step("Sepete ekle butonuna tıklanılır")
    public void clickAddToBasket(){
        productModel.clickAddToBasket();
    }

    @Step("Sepetim butonuna tıklanılır")
    public void clickBasket(){
        productModel.clickBasket();
    }
}

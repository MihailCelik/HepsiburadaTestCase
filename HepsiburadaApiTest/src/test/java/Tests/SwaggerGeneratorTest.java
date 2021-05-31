package Tests;

import  Model.SwaggerGeneratorModel;
import io.cucumber.java.en.Given;

public class SwaggerGeneratorTest {

    SwaggerGeneratorModel swaggerGeneratorModel = new SwaggerGeneratorModel();

    @Given("Apideki responsesların 200 döndüğü kontrol edilir.$")
    public void checkAllStatusCode(){
        swaggerGeneratorModel.checkAllStatusCode();
    }
}

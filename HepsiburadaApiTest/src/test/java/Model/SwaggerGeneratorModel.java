package Model;

import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class SwaggerGeneratorModel {

    public String baseURL="https://generator.swagger.io/api/swagger.json";

    public void checkAllStatusCode(){
        Response response = given()
                .get(baseURL)
                .then()
                .statusCode(200)
                .extract()
                .response();
    }
}

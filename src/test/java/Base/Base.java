package Base;

import Data.DataToken;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Before;
import org.junit.Test;
import org.testng.annotations.BeforeTest;


public class Base {


    public static void basePath(String path) {
        RestAssured.basePath = path;
    }
    public static String Token() {
        basePath("/auth");
        Object obj;
        DataToken dataToken = new DataToken();
        obj = dataToken.getDataToken();

        Response res = RestAssured.given()
                .contentType(ContentType.JSON)
                .when()
                .body(obj)
                .post();

      return  res.jsonPath().get("token");
    }

    @BeforeTest
    public void innit() {
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";
    }
}

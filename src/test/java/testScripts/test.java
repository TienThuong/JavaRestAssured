package testScripts;

import Base.Base;
import Data.DataBooking;
import Models.CreateBooking;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import java.util.List;

public class test extends Base {


    @Test
    public void createToken() {
        String token = "";
        token = Base.Token();
        System.out.println(token);
    }

    @Test
    public void createBooking() {
        basePath("/booking");
        int bookingid = 0;
        DataBooking dataBooking = new DataBooking();

        List<CreateBooking> bookingList = dataBooking.BookingInfo();
        for (int i = 0; i < bookingList.size(); i++) {
            Response res = RestAssured.given()
                    .contentType(ContentType.JSON)
                    .header("Authorization", "Bearer " + Token())
                    .when()
                    .body(bookingList.get(i))
                    .post();
            bookingid = res.jsonPath().get("bookingid");
        }
        System.out.println(bookingid);
    }

    @Test
    public void getBooking() {
        basePath("/booking");

        Response res = RestAssured.given()
                .contentType(ContentType.JSON)
                .when()
                .get();
        res.prettyPrint();

    }

}


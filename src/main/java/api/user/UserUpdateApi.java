package api.user;

import api.RequestApi;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class UserUpdateApi extends RequestApi {

    public String requestUserUpdate(Object model, String token, Integer code) {
        Response response = given().auth()
                .oauth2(token.replace("Bearer ", ""))
                .header("Content-type", "application/json")
                .and()
                .body(model)
                .when()
                .patch("/auth/user");
        response.then().statusCode(code);
        return response.getBody().asString();
    }

    public String requestUserUpdate(Object model, Integer code) {
        Response response = given()
                .header("Content-type", "application/json")
                .and()
                .body(model)
                .when()
                .patch("/auth/user");
        response.then().statusCode(code);
        return response.getBody().asString();
    }
}
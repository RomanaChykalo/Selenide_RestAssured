package restassure.clients;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class BaseClient {

   protected RequestSpecification setUp(){
       return RestAssured.given()
               .baseUri("https://reqres.in/api")
               .contentType(ContentType.JSON)
               .filters(new RequestLoggingFilter(),
                       new ResponseLoggingFilter(),
                       new AllureRestAssured());
   }

}

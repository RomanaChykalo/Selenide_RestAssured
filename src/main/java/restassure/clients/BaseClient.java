package restassure.clients;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public abstract class BaseClient {

   protected RequestSpecification setUp(){
       return RestAssured.given()
               .baseUri("https://reqres.in/api")
               .contentType(ContentType.JSON)
               .filters(new RequestLoggingFilter(),
                       new ResponseLoggingFilter(),
                       new AllureRestAssured());
   }
    /*return type T*/
    public abstract <T> T getById(int id);

    public abstract <T> T getAll();

    public abstract <T> T createEntity(Object entity);

    public abstract void deleteEntity(int id);

    public abstract <T>T updateEntity(int id, Object updatedData);
}

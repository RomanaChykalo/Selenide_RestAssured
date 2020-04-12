package restassure.clients;

import io.restassured.http.ContentType;
import restassure.models.ManyUserResponse;
import restassure.models.User;

import java.util.List;

public class UserClient extends BaseClient {

    public User getUserById(int id){
       return setUp()
                .get("users/"+id)
                .then()
                .statusCode(200)
                .extract().as(User.class);
    }

    public ManyUserResponse getAllUsers(){
        return setUp()
                .get("users")
                .then()
                .statusCode(200)
                .extract().as(ManyUserResponse.class);
    }
}

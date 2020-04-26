package restassure.clients;

import io.restassured.http.ContentType;
import io.restassured.internal.http.Status;
import javafx.scene.media.MediaPlayer;
import restassure.models.ManyUserResponse;
import restassure.models.User;
import restassure.models.post.UserRequest;
import restassure.models.post.UserResponse;

public class UserClient extends BaseClient {

    @Override
    public User getById(int id) {
        return setUp()
                .get("users/" + id)
                .then()
                .statusCode(200)
                .extract().as(User.class);
    }

    @Override
    public ManyUserResponse getAll() {
        return setUp()
                .get("users")
                .then()
                .statusCode(200)
                .extract().as(ManyUserResponse.class);
    }

    @Override
    public UserResponse createEntity(Object userRequest) {
        return setUp()
                .body(userRequest)
                .post("users")
                .then()
                .statusCode(201)
                .extract().as(UserResponse.class);
    }

    @Override
    public void deleteEntity(int id) {
        setUp()
                .delete("users/" + id)
                .then()
                .statusCode(204)
                .log();
    }

    @Override
    public restassure.models.patch.UserResponse updateEntity(int id, Object userRequest) {
        return setUp()
                .body(userRequest)
                .patch("users/" + id)
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(restassure.models.patch.UserResponse.class);
    }
}

package com.restassure;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import restassure.clients.BaseClient;
import restassure.clients.UserClient;
import restassure.models.ManyUserResponse;
import restassure.models.User;
import restassure.models.post.UserRequest;
import restassure.models.post.UserResponse;

import static org.assertj.core.api.Assertions.assertThat;

public class UserServiceTesting {

    BaseClient userClient;

    UserServiceTesting() {
        userClient = new UserClient();
    }

    @Test
    public void testPostMethod() {
        UserResponse userResponse = userClient.createEntity(new UserRequest("Roma", "manager"));
        assertThat(userResponse.getName().equalsIgnoreCase("Roma"));
    }

    @Test
    public void testGetUser() {
        assertThat((User)userClient.getById(2)).as("User Entity is null").isNotNull();
    }

    @Test
    public void testGetAllUsers() {
        assertThat((ManyUserResponse)userClient.getAll()).isNotNull();
    }

    @Test
    public void testUpdateUserPatch(){
        restassure.models.patch.UserResponse updatedEntity = userClient.updateEntity(1, new UserRequest("inna", "developer"));
        assertThat(updatedEntity.getName().equalsIgnoreCase("inna"));
        assertThat(updatedEntity.getJob().equalsIgnoreCase("developer"));
    }

    @Test(dataProvider = "usersIds")
    public void deleteUser(int userId) {
        userClient.deleteEntity(userId);
    }

    @DataProvider
    Object[] usersIds() {
        return new Object[]{
                1, 2, 3
        };
    }
}

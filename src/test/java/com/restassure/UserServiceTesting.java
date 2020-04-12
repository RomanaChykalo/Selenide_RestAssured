package com.restassure;

import org.testng.annotations.Test;
import restassure.clients.UserClient;
import static org.assertj.core.api.Assertions.assertThat;
public class UserServiceTesting {

    UserClient userClient;
    UserServiceTesting(){
        userClient = new UserClient();
    }

    @Test
    public void testPostMethod(){

    }

    @Test
    public void testGetUser(){
        assertThat(userClient.getUserById(2)).as("User Entity is null").isNotNull();
    }

    @Test
    public void testGetAllUsers(){
      assertThat(userClient.getAllUsers().getData()).size().isGreaterThan(5);
    }
}

package com.autotestkit.api;

import io.restassured.response.Response;

public class UserClient extends BaseApiClient {

    public Response getUserById(String id) {
        return getRequestSpec().get("/users/" + id);
    }

    public Response getAllUsers() {
        return getRequestSpec().get("/users");
    }
}

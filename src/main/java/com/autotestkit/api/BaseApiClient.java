package com.autotestkit.api;

import com.autotestkit.utils.ConfigReader;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public abstract class BaseApiClient {

    protected RequestSpecification getRequestSpec() {
        return RestAssured.given()
                .baseUri(ConfigReader.getProperty("base.url.api"))
                .contentType("application/json");
    }
}

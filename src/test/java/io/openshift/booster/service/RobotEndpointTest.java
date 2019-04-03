package io.openshift.booster.service;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class RobotEndpointTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/my_robot")
          .then()
             .statusCode(200)
             .body(is("hello"));
    }

}
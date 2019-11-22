package restAssuredTest;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


import java.util.HashMap;

public class Demo2_POST_Post_Request {
    public static HashMap map=new HashMap();
    @BeforeClass
    public void postData()
    {
        map.put("external_id",RestUtils.external_id());
        map.put("Name",RestUtils.name());
        RestAssured.baseURI="http://samples.openweathermap.org";
        RestAssured.basePath="/data/3.0/stations?appid=b1b15e88fa797225412429c1c50c122a1";
    }
    @Test
    public void testData()
    {
                given()
                        .contentType("application/json; charset=utf-8")
                        .body(map)
                .when()
                        .post()
                        .then()
                        .assertThat()
                        .body("external_id",equalTo("SF_TEST001"));


    }
}

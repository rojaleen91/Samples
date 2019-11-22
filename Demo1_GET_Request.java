package restAssuredTest;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Demo1_GET_Request {
    @Test
    public void getWeatherDetails(){

                given().
                when().
                get("http://samples.openweathermap.org/data/2.5/weather?id=2172797&appid=b6907d289e10d714a6e88b30761fae22").
                then().
                statusCode(200).
                assertThat().body("id",equalTo(2172797)).
                header("Content-Type","application/json; charset=utf-8");


    }
}

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;


public class BODY_RESPONSE {
    @Test

    void getBodyResponse() {
        //Soecify base URI
        RestAssured.baseURI = "https://reqres.in/api/users?id";
        //Request Object
        RequestSpecification httprequest = RestAssured.given();
        //Response Object
        Response response = httprequest.request(Method.GET, "12");
        JsonPath jsonpath = response.jsonPath();



    }
}

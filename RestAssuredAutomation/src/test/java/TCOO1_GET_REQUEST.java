import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TCOO1_GET_REQUEST {
    @Test
    void getweatherDetails() {
        //Soecify base URI
        RestAssured.baseURI = "https://reqres.in/api/users?id";
        //Request Object
        RequestSpecification httprequest = RestAssured.given();
        //Response Object
        Response response = httprequest.request(Method.GET, "12");
        JsonPath jsonpath=response.jsonPath();
        //Print Response in console window
        String responseBody = response.getBody().asString();
        System.out.println("Response Body is:" + responseBody);
        //Verify a spefic resonse fron Response body
        Assert.assertEquals(responseBody.contains("12"),true);
        //Verify status code from resonse
        int statuscode = response.getStatusCode();
        System.out.println("Status code is: " + statuscode);
        Assert.assertEquals(statuscode, 200);
        //Capture details of header from resonse
        String contenttype = response.header("Content-Type");
        System.out.println("Contenttype is"+contenttype);
        Assert.assertEquals(contenttype, "application/json; charset=utf-8");
        Headers allheaders=response.headers();
        for (Header headers:allheaders)
        {
          System.out.println(headers.getName() + " " + headers.getValue());
          System.out.println(headers.getValue());
        }
    }
}

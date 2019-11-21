import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC002_POST_REQUEST {
    @Test
    void registrationSucessful() {
        //Soecify base URI
        RestAssured.baseURI = "https://reqres.in";
        //Request Object
        RequestSpecification httprequest=RestAssured.given();
        //Request payload along with POST request
        JSONObject requestparam=new JSONObject();
        requestparam.put("email","eve.holt@reqres.in");
        requestparam.put("password","pistol");
        httprequest.header("Content-Type","application/json");
        httprequest.body(requestparam.toJSONString());
        //Response Object
        Response response= httprequest.request(Method.POST,"/api/register");
        //Print Response in console window
        String responseBody=response.getBody().asString();
        System.out.println("Response Body is:"+responseBody);
        //statuscode validation
        int statuscode=response.getStatusCode();
        System.out.println("Status code is: "+statuscode);
        Assert.assertEquals(statuscode,200);
        //token validation
        String token=response.jsonPath().get("token");
        Assert.assertEquals(token,"QpwL5tke4Pnpja7X4");
    }
}

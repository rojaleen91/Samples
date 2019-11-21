package DtadrivenTest;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DataDrivenTest_Add_New_Employees {
    @Test
    void postNewEmpployee(){
        RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
        RequestSpecification httpRequest = RestAssured.given();
        //Here we created data which we can send along with the POST request
        JSONObject requestprams = new JSONObject();
        requestprams.put("name","Roja758");
        requestprams.put("salary","40000");
        requestprams.put("age","67");
        //we add header stating request body is json
        httpRequest.header("Content-Type","application/json");
        //Add the json to body of the request
        httpRequest.body(requestprams.toJSONString());
        //POST request
        Response response=httpRequest.request(Method.POST,"/create");
        //Capture resonse body to perform validation
        String responsebody = response.getBody().asString();
        Assert.assertEquals(responsebody.contains("Roja758"),true);
        Assert.assertEquals(responsebody.contains("40000"),true);
        Assert.assertEquals(responsebody.contains("67"),true);
        //Verifing status code
        int statuscode=response.getStatusCode();
        Assert.assertEquals(statuscode,200);



    }
}

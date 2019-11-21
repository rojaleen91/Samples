package DtadrivenTest;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTest_Add_New_Employees_Data_From_Excel {
    @Test(dataProvider = "empdataprovider")
    void postNewEmployee(String ename, String esalary, String eage) {
        RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
        RequestSpecification httpRequest = RestAssured.given();
        //Here we created data which we can send along with the POST request
        JSONObject requestprams = new JSONObject();
        requestprams.put("name", ename);
        requestprams.put("salary", esalary);
        requestprams.put("age", eage);
        //we add header stating request body is json
        httpRequest.header("Content-Type", "application/json");
        //Add the json to body of the request
        httpRequest.body(requestprams.toJSONString());
        //POST request
        Response response = httpRequest.request(Method.POST, "/create");
        //Capture resonse body to perform validation
        String responsebody = response.getBody().asString();
        System.out.println("Resopnse Body is:" + responsebody);
        Assert.assertEquals(responsebody.contains(ename), true);
        Assert.assertEquals(responsebody.contains(esalary), true);
        Assert.assertEquals(responsebody.contains(eage), true);
        //Verifing status code
        int statuscode = response.getStatusCode();
        Assert.assertEquals(statuscode, 200);
    }


    @DataProvider (name ="empdataprovider")
    public Object[] getEmpData() {
        String empdata[][] = { {"abc1g23", "300", "40"}, {"artr3", "3900", "490"}, {"abcirtro3", "3000", "490"} };
        return(empdata);
    }
}



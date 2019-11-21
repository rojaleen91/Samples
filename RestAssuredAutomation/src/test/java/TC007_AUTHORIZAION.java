import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.PreemptiveAuthSpec;
import io.restassured.specification.RequestSpecification;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC007_AUTHORIZAION {
    @Test
    public void authorization() {
        //Soecify base URI
        RestAssured.baseURI = "https://reqres.in/api/users?id";
        //Basic authentication
        PreemptiveBasicAuthScheme authScheme=new PreemptiveBasicAuthScheme();
        authScheme.setUserName("jhjkhkj");
        authScheme.setPassword("gguyguy");
        RestAssured.authentication=authScheme;
        //Request Object
        RequestSpecification httprequest = RestAssured.given();
        //Response Object
        Response response = httprequest.request(Method.GET, "12");


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


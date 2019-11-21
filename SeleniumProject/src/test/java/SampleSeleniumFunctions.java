import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleSeleniumFunctions {
    @Test
    public void testFun()
    {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","C:\\Rojaleen\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://www.google.com");
        WebElement google_search=driver.findElement(By.name("q"));
        google_search.sendKeys("key", Keys.ENTER);
        driver.navigate().back();
        WebElement google_image=driver.findElement(By.id("hplogo"));
        if (google_image.isDisplayed())
        {
            System.out.println("Testcase passed");
        }
        else
            System.out.println("Testcase Failed");
        //Close Browser
        driver.close();

    }
}

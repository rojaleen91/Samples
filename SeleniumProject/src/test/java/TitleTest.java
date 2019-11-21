
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TitleTest {
    @Test
    public void testOne () {
        {
            WebDriver browser;
            // declaration and instantiation of objects/variables
            System.setProperty("webdriver.chrome.driver", "C:\\Rojaleen\\chromedriver.exe");
            browser = new ChromeDriver();
            //Launch chrome browser
            browser.get("https://www.google.com/");
            String title="Google";
            //Get the actual value of title
            String actual_Title=browser.getTitle();
            System.out.println(actual_Title);
            if (actual_Title.contentEquals(title))
            System.out.println("TESTCASE PASSED");
            else
                System.out.println("TESTCASE FAILED");
            browser.close();
        }
    }
}

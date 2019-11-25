import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class openAllLinks {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Rojaleen\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.gmail.com/");
        List<WebElement> link = driver.findElements(By.tagName("a"));
        System.out.println(link.size());

        for (WebElement link2: link) {

            //print the links i.e. http://google.com or https://www.gmail.com
            System.out.println(link2.getAttribute("href"));

            //print the links text
            System.out.println(link2.getText());
        }
    }
}
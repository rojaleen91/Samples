import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {
    public static void main(String[] args) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Rojaleen\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://toolsqa.com/automation-practice-switch-windows/");
        Thread.sleep(3000);
        WebElement clickElement = driver.findElement(By.id("button1"));

        for(int i = 0; i < 3; i++)
        {
            clickElement.click();
            Thread.sleep(3000);
        }


    }
}
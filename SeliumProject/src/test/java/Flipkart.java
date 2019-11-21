import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;


public class Flipkart {
    @Test
    public void testOne () throws InterruptedException {
        {
            WebDriver browser;
            // declaration and instantiation of objects/variables
            System.setProperty("webdriver.chrome.driver", "C:\\Rojaleen\\chromedriver.exe");
            browser = new ChromeDriver();
            //Launch chrome browser
            browser.get("https://www.amazon.in/");
            //Mouse over operation to click signin button
//            Actions action = new Actions(browser);
//            WebElement we = browser.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[2]"));
//            action.moveToElement(we).build().perform();
            browser.findElement(By.id("twotabsearchtextbox")).sendKeys("cup", Keys.ENTER);
            browser.findElement(By.linkText("Arttdinox Seamless Belly Tea Cups Set of 2")).click();
           browser.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//            String winHandleBefore = browser.getWindowHandle();
//            browser.switchTo().window(winHandleBefore);
            browser.findElement(By.cssSelector("#add-to-cart-button")).click();

            //browser.close();
        }
    }
}

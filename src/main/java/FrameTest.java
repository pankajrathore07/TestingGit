import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FrameTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "/Users/machd/Downloads/chromedriver");
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.get("https://www.online.citibank.co.in/");
    }
    @Test
    public void switchFrame(){
        driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/div[2]/div/div[1]/div[1]/p[2]/a[1]/img")).click();
        String ParentWindow= driver.getWindowHandle();
        for(String Subwindow: driver.getWindowHandles())
        {
            driver.switchTo().window(Subwindow);
        }
        System.out.println(driver.findElement(By.cssSelector(" .bold")).getText());
        driver.close();
        driver.switchTo().window(ParentWindow);
    }
    @AfterMethod
    public void tearDown(){

        driver.close();
    }

}

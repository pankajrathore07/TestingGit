import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestSample {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){

        System.setProperty("webdriver.chrome.driver", "/Users/machd/Downloads/chromedriver");
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.get("http://google.com");

    }
    @Test
    public void googleTitleTest(){
        String Title= driver.getTitle();
        System.out.println("Title");
        Assert.assertEquals(Title, "Google");
    }

    @Test
    public void googLogoTest(){
        boolean b= driver.findElement(By.xpath("//*[@id= 'hplogo']")).isDisplayed();
        Assert.assertTrue(b);

    }

    @Test
    public void googlemailLinkTest(){
        boolean b= driver.findElement(By.linkText("Gmail")).isDisplayed();
    }
    @AfterMethod
    public void tearDown(){

        driver.close();
    }
}

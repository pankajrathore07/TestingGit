import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropDown {

    WebDriver driver;

    @BeforeMethod
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/machd/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/newtours/register.php");
        Thread.sleep(2000);
    }

    @Test
    public void countryList() throws InterruptedException {
        Select drpCountry = new Select(driver.findElement(By.name("country")));
        drpCountry.selectByVisibleText("INDIA");
        Thread.sleep(2000);
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
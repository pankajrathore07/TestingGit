import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test

{
    public static void main( String []args)
    {
        System.setProperty("webdriver.gecko.driver", "/Users/machd/Downloads/geckodriver");
        WebDriver driver = new FirefoxDriver();
        String baseUrl =  "http://google.com";
        String expectedTile= "google";
        String actualTitle = "";
        driver.get(baseUrl);

        actualTitle = driver.getTitle();

        if(actualTitle.contentEquals(expectedTile))

        {
            System.out.println("Test Passed");
        }
            else
        {
            System.out.println("Test Failed");
        }
         driver.close();
    }
}

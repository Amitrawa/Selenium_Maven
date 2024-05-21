import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg {

    WebDriver driver;
    @BeforeMethod
    public void setup(){

        driver = new ChromeDriver();

    }

    @Test
    void openGoogle(){

        driver.get("https://www.google.co.uk/");

    }

    @Test
    void openFacebook(){

        driver.get("https://www.facebook.com/");
    }

    @AfterMethod
    void tearDown(){
        if(driver != null)
        {
            driver.quit();
        }
    }

}

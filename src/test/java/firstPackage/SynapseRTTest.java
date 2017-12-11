package firstPackage;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by mart.kiviselg on 11.12.2017.
 */

public class SynapseRTTest {
    @Test
    public void navigateToGoogle(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        System.out.println(driver.getTitle());
        driver.close();
    }
    
    
    @Test
    public void navigateToFacebook(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        String title = driver.getTitle();
        driver.close();
        Assert.assertEquals("Facebook", title);
        
    }
}

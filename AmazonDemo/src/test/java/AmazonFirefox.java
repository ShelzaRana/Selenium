import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class AmazonFirefox {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver1 = new FirefoxDriver();

        String URL = "https://www.amazon.ca/";
        driver1.get(URL);
        driver1.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
        driver1.manage().window().maximize();

        driver1.findElement(By.id("nav-hamburger-menu")).click();
        Thread.sleep(2000);
        driver1.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/ul[1]/li[9]/a[1]/i[1]")).click();
        Thread.sleep(2000);
        driver1.findElement(By.linkText("All-new Kindle")).click();
        Thread.sleep(2000);
        driver1.findElement(By.id("buy-now-button")).click();
        //driver.findElement(By.id("ap_email")).sendKeys("shelzarana83@gmail.com");
        driver1.findElement(By.xpath("//input[@id='continue']")).click();

        // driver1.close();


    }
}


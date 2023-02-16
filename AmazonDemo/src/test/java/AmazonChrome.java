import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AmazonChrome {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        String URL = "https://www.amazon.ca/";
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();

        driver.findElement(By.id("nav-hamburger-menu")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/ul[1]/li[9]/a[1]/i[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("All-new Kindle")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("buy-now-button")).click();
        //driver.findElement(By.id("ap_email")).sendKeys("shelzarana83@gmail.com");
        driver.findElement(By.xpath("//input[@id='continue']")).click();

       driver.quit();


    }
}

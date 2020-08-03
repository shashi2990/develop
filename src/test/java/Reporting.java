
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static io.github.bonigarcia.wdm.WebDriverManager.getInstance;

public class Reporting {
    public static void main(String[] args) throws InterruptedException {
        getInstance(DriverManagerType.CHROME).setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://social.ndtv.com/static/Weather/report/?pfrom=home-topsubnavigation");
//        driver.get("https://www.ndtv.com/");
//        driver.findElement(By.xpath("//a[@id='h_sub_menu']")).click();
//        driver.findElement(By.xpath("//a[text()='WEATHER']")).click();
        driver.findElement(By.xpath("//div[@class='searchContainer']/input[@id='searchBox']")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//input[@class='searchBox']")).sendKeys("P");

        driver.findElement(By.xpath("//input[@class='searchBox']")).sendKeys("u");

        driver.findElement(By.xpath("//input[@class='searchBox']")).sendKeys("n");

        driver.findElement(By.xpath("//input[@class='searchBox']")).sendKeys("e");


//        driver.findElement(By.xpath("//input[@class='searchBox']")).sendKeys(Keys.ENTER);
//        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//        driver.findElement(By.xpath("//span[@id='icon_holder']")).click();
        driver.findElement(By.xpath("//input[@id='Pune']")).click();
        driver.findElement(By.xpath("//div[text()='Pune']")).click();
//        driver.quit();
    }

}

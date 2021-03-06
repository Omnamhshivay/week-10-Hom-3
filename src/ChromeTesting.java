import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeTesting {
    public static void main(String[] args) {

        String baseUrl = "http://the-internet.herokuapp.com/login";
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // Lunch the Url
        driver.get(baseUrl);
        // Maximise window
        driver.manage().window().maximize();
        // We give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Get the title of the page
        String title = driver.getTitle();
        System.out.println(title);
        //Get the current Url
        String url = driver.getCurrentUrl();
        System.out.println("Current Url " + url);
        // Print the page source
        String pageSource = driver.getPageSource();
        System.out.println("Page source " + pageSource);
        // find email field element
        WebElement emailField = driver.findElement(By.id("username"));
        // Sending email to email field element
        emailField.sendKeys("miteshhhh.patel@yahooo.com");
        // Find password field element
        WebElement passwordfield = driver.findElement(By.name("password"));
        // Sending password to password field element
        passwordfield.sendKeys("333333");
        // Close browser
        driver.close();
    }
}
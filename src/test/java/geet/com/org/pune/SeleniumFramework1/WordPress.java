package geet.com.org.pune.SeleniumFramework1;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class WordPress {
	WebDriver driver;
   
     
    		 
	@Test
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "Resoures/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demosite.center/wordpress/wp-login.php?");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Test
	public void Login() {
		WebElement Username = driver.findElement(By.xpath("//input[@id='user_login']"));
		
		Username.sendKeys("admin");

		WebElement Password = driver.findElement(By.xpath("//input[@id='user_pass']"));
		Password.sendKeys("demo123");

		WebElement loginbnt = driver.findElement(By.xpath("//input[@id='wp-submit']"));
		loginbnt.click();
	}

	@Test
	public void DashBoard() {
		WebElement postclick = driver.findElement(By.className("wp-menu-name"));
		postclick.click();

		WebElement Addnew = driver.findElement(By.xpath("//a[@href='post-new.php']"));
		//System.out.println("I am happy");
		Addnew.click();

		WebElement Enter = driver.findElement(By.xpath("//input[@name='post_title']"));
		Enter.sendKeys("Kumodinipost");

		WebElement publish = driver.findElement(By.xpath("//input[@name='publish']"));
		publish.click();
	}

	@Test
	public void afterTest() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}

}

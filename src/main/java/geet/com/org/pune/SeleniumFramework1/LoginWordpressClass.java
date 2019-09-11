package geet.com.org.pune.SeleniumFramework1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginWordpressClass {
	WebDriver driver;
	
	By locatorofUsername=By.xpath("//input[@id='user_login']");
	By locatorofPassword=By.xpath("//input[@id='user_pass']");
	
	By locatorofloginbnt=By.xpath("//input[@id='wp-submit']");
	
			
	public LoginWordpressClass(WebDriver driver) {
		this.driver=driver;
		
	}
	public void LoginWordPressFunctions() {
   WebElement Username = driver.findElement(locatorofUsername);
		Username.sendKeys("admin");

		WebElement Password = driver.findElement(locatorofPassword);
		Password.sendKeys("demo123");

		WebElement loginbnt = driver.findElement(locatorofloginbnt);
		loginbnt.click();
	}

}

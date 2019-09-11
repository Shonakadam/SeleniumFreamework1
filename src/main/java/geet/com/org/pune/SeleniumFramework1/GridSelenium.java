package geet.com.org.pune.SeleniumFramework1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridSelenium {
	static WebDriver driver;

	public static void main(String[] args) {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName("chrome");
		// capabilities.setPlatform(Platform.VISTA);
		try {
			driver = new RemoteWebDriver(new URL("http://192.168.1.204:5555/wd/hub"), capabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.get("https://www.facebook.com/login");

		WebElement Username = driver.findElement(By.xpath("//input[@id='email']"));
		Username.sendKeys("shonali11@gmail.com");

		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys("shonali22");

		WebElement clickbnt = driver.findElement(By.xpath("//button[@id='loginbutton']"));
		clickbnt.click();

		driver.quit();

	}

}

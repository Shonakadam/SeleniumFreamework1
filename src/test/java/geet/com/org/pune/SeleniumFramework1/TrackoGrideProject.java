package geet.com.org.pune.SeleniumFramework1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;

public class TrackoGrideProject {
	static  WebDriver driver;
  @Test
  public void f() {
	  WebElement signUpBtn=driver.findElement(By.xpath("//a[text()='Sign Up Free']"));
			signUpBtn.click();

  }
  @Parameters("browsername")
  @BeforeTest
  public void setup(String bro) {
	  System.out.println(bro);
            DesiredCapabilities capabilities= new DesiredCapabilities();
            capabilities.setBrowserName("chrome");
		 try {
			driver=new RemoteWebDriver(new URL("http://192.168.1.204:4444/wd/hub"), capabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  driver.get("https://dev.tracko.co.in/");
		  driver.manage().window().maximize();
	 
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}

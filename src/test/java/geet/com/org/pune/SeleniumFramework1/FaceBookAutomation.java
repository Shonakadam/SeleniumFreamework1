package geet.com.org.pune.SeleniumFramework1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;

public class FaceBookAutomation {

	WebDriver driver;
	String Username = "shonali11@gmail.com";
	String password = "shonali22";

	@Test
	public void f() {
		LoginClassFacebook facebook = new LoginClassFacebook(driver);
		facebook.LoginFacabookFunction(Username, password);

	}

	@Parameters("browser")
	@BeforeTest
	public void beforeTest(String bro) {
		System.out.println("browser name is:+bro");
		if (bro.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "Resoures/chromedriver.exe");
			driver = new ChromeDriver();
		} 
		else if (bro.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "Resoures/geckodriver.exe");
			driver = new FirefoxDriver();

		}

		else if (bro.equals("ie")) {
			System.setProperty("webdriver.chrome.driver", "Resoures/IEDriverServer.exe");
			driver = new InternetExplorerDriver();

		}

	
		driver.get("https://www.facebook.com/login");
		driver.manage().window().maximize();
	}

	@AfterTest
	public void afterTest() throws InterruptedException {
           Thread.sleep(5000);
		driver.quit();

	}
}
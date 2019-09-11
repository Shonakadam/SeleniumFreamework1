package geet.com.org.pune.SeleniumFramework1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.FindBy;

public class WordPress {
	WebDriver driver;

	@Parameters("browser")
	@Test
	public void setup(String bro) {
		System.out.println("browser name is" + bro);
		if (bro.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", "Resoures/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (bro.equals("fireox")) {
			System.setProperty("webdriver.chrome.driver", "Resoures/geckodriver.exe");
			driver = new FirefoxDriver();

		} else if (bro.equals("ie")) {
			System.setProperty("webdriver.chrome.driver", "Resoures/IEDriverServer.exe");
			driver = new InternetExplorerDriver();

		}
		driver.get("http://demosite.center/wordpress/wp-login.php?");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Test
	public void Loginwordpress() {
		LoginWordpressClass login = new LoginWordpressClass(driver);
		login.LoginWordPressFunctions();

	}

	@Test
	public void DashBoard() {
		DashboardWordClass dash = new DashboardWordClass(driver);
		dash.dashwordfunction();
	}

	@Test
	public void afterTest() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}

}

package geet.com.org.pune.SeleniumFramework1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginClassFacebook {
	@FindBy(xpath="//input[@id='email']")
	WebElement webUsername;
	
	@FindBy(xpath="//input[@id='pass']")
	WebElement webpassword;
	
	@FindBy(xpath="//button[@id='loginbutton']")
	WebElement webclickbnt;
			
	WebDriver driver;
	public LoginClassFacebook(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void LoginFacabookFunction(String x,String y)
	{
		// WebElement Username=driver.findElement(By.xpath("//input[@id='email']"));
		
		 webUsername.sendKeys("shonali11@gmail.com");
		  
		  //WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
		  webpassword.sendKeys("shonali22");
		  
		 // WebElement clickbnt=driver.findElement(By.xpath("//button[@id='loginbutton']"));
		  webclickbnt.click();

}
	}

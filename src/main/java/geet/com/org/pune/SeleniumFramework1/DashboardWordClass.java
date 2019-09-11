package geet.com.org.pune.SeleniumFramework1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardWordClass {
	WebDriver driver;
	@FindBy (xpath="//div[@class='wp-menu-name'][text()='Posts']")
	WebElement webpostclick;
	
	@FindBy (xpath="//a[text()='Add New'][@href='post-new.php']")
	WebElement webAddnew;
	
	@FindBy (xpath="//input[@name='post_title']")
	WebElement webEnter;
	
	@FindBy (xpath="//input[@name='publish']")
	WebElement webpublish;
	
  public DashboardWordClass(WebDriver driver) {
	  
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
public void dashwordfunction() {
	//WebElement postclick=driver.findElement(By.xpath("//div[@class='wp-menu-name'][text()='Posts']"));
	
	webpostclick.click();
	
	//WebElement Addnew=driver.findElement(By.xpath("//a[text()='Add New'][@href='post-new.php']"));
	//System.out.println("I am happy");
	webAddnew.click();
	
	//WebElement Enter=driver.findElement(By.xpath("//input[@name='post_title']"));
	webEnter.sendKeys("Kumodinipost");
	
	//WebElement publish=driver.findElement(By.xpath("//input[@name='publish']"));
	
	webpublish.click();
	
  }
  
  
  
}

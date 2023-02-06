package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import Base.Page;

public class LoginPage  extends Page
	{

		/*
		 * public WebDriver driver;
		 * 
		 * public LoginPage(WebDriver driver) { this.driver= driver; // TODO
		 * Auto-generated constructor stub }
		 */
	

	public ZohoAppPage loginpage(String usename, String password) throws InterruptedException 
	{
		
		type("email_CSS",usename);
		type("password_CSS",password);
		click("signbtn_CSS");
		/*
		 * driver.findElement(By.xpath("//*[@id=\"emailfield\"]")).sendKeys(usename);
		 * driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
		 * Thread.sleep(3000);
		 * driver.findElement(By.xpath("//*[@id=\"signupbtn\"]")).click();
		 */
		return new ZohoAppPage(driver);
	}	
	
			
		public ZohoAppPage signin(String usename_log, String password_log)
		{
			
			driver.findElement(By.xpath("//*[@id=\"login_id\"]")).sendKeys(usename_log);
			driver.findElement(By.xpath("//*[@id=\"nextbtn\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password_log);
			driver.findElement(By.xpath("//*[@id=\"nextbtn\"]")).click();
			
			return new ZohoAppPage (driver);
			
		}
	
}
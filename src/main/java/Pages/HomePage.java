package Pages;

import org.openqa.selenium.By;


import Base.Page;


public class HomePage extends Page
{
	/*
	 * WebDriver driver;
	 * 
	 * public HomePage(WebDriver driver) { this.driver= driver; }
	 */ 
		public void goToSupport()
		{
		
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/a[2]")).click();
		
		}
		
		public void goToSignUp()
		{
			
			
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/a[5]")).click();
		}
		
		public LoginPage goToSingin()
		{
			
			click("loginlink_CSS");
			//driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/a[4]")).click();
			return new LoginPage();
		}
		
	
	
	
	}

package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.Page;
import CRMPages.CRMHomePage;

public class ZohoAppPage extends Page  {
	
	public WebDriver driver;
	
	
	public ZohoAppPage(WebDriver driver) { this.driver=driver; }
	 
	public void gotoChat(){
		
		driver.findElement(By.xpath("//*[@id=\"apps\"]/div[1]/div/ul/li[1]/a/span[2]/em")).click();
		
	}
	
	public CRMHomePage gotoCRM(){
		driver.findElement(By.xpath("//*[@id=\"zl-myapps\"]/div[1]/div[7]/div/a/span")).click();
	
	return new	CRMHomePage();	}
	
	
	public void gotoSalesIQ(){
		
		driver.findElement(By.cssSelector(".zicon-apps-salesiq.zicon-apps-96")).click();
		
	}

}

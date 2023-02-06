package Base;

import org.openqa.selenium.By;

import Accounts.AccountsPage;
import Accounts.CreateAccountPage;

public class TopMenu {
	
	public void gotoHome() {

	}

	public void gotoFeeds() {

	}

	public void gotoLeads() {}
	
	public void aceescrm()
	{
		
		Page.driver.findElement(By.xpath("/html/body/main/div/div/div[1]/div/div[1]/a")).click();
	}
	

	public void camapigns() {
		
		Page.driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/ul/li[4]/a")).click();
	
	}
	
	public AccountsPage goToaccounts()
	{
		Page.driver.findElement(By.xpath("//*[@id=\"mainMenuTabDiv\"]/crm-menu/div[1]/crm-tab/div[2]/div[4]/a")).click();
		return new AccountsPage();
	}

	public void gotoContacts() {

	}
	
	
	public void signOut(){
		
		
	}

	
}

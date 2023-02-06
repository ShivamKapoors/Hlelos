package Accounts;

import org.openqa.selenium.By;

import Base.Page;

public class AccountsPage  extends Page{
	
	
	public CreateAccountPage gotoCreateAccounts()
	{
		driver.findElement(By.xpath("//*[@id=\"submenu_Accounts\"]/button/lyte-yield")).click();
		return new CreateAccountPage();
	}
	
	
	public void gotoImportAccounts(){
		
		
	}

}
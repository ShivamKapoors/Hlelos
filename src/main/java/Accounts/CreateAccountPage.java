package Accounts;

import org.openqa.selenium.By;

public class CreateAccountPage  extends Base.Page {
	
	
	public void createAccount(String accountName)
	{
	driver.findElement(By.xpath("//*[@id=\"Crm_Accounts_ACCOUNTNAME_LInput\"]")).sendKeys(accountName);	
		
	}

}

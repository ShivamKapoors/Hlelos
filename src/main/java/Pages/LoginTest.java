package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Accounts.AccountsPage;
import Accounts.CreateAccountPage;
import Base.Page;
import CRMPages.CRMHomePage;

public class LoginTest extends Page {
	
//	public static  WebDriver driver;
//	
	public static void main(String[] args) throws InterruptedException 
	
	{
	
		HomePage home=new HomePage();
		LoginPage lp=home.goToSingin();	
		ZohoAppPage zp=lp.signin("sisfang0099@gmail.com", "Movies@1234567890");
		CRMHomePage hm=zp.gotoCRM();
		AccountsPage account =hm.menu.goToaccounts();
		CreateAccountPage cap=account.gotoCreateAccounts();
		cap.createAccount("Raman");
		
		//Page.menu.
	//	Page.menu.aceescrm();
//		Page.menu.camapigns();
			
		
		
		
	}

}

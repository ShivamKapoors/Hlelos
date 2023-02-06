package testcase;

import java.util.Hashtable;


import org.testng.annotations.Test;

import Accounts.AccountsPage;
import Accounts.CreateAccountPage;
import CRMPages.CRMHomePage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.ZohoAppPage;
import utilities.Utilities;

public class Login_Test extends BaseTest {
	@Test(dataProviderClass = Utilities.class, dataProvider = "dp1")
	public void loginTest(Hashtable<String,String> data) {

		HomePage home = new HomePage();
		LoginPage lp = home.goToSingin();
		ZohoAppPage zp = lp.signin(data.get("username"), data.get("password"));
		CRMHomePage hm = zp.gotoCRM();
		AccountsPage account = hm.menu.goToaccounts();
		CreateAccountPage cap = account.gotoCreateAccounts();
		cap.createAccount(data.get("accountname"));

	
	}

}

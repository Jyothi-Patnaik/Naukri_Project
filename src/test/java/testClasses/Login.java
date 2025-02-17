package testClasses;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class Login extends BaseClass {
	
	@Test
	public void Login() {
	HomePage hp = new HomePage(driver);
	hp.loginBtnMain();
    LoginPage lp = new LoginPage(driver);
    lp.enterLoginDetails(p.getProperty("mail"), p.getProperty("pwd"));
    lp.clickLogin();
    lp.viewProfilePage();
}
}

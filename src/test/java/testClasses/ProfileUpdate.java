package testClasses;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.ProfilePage;
import testBase.BaseClass;

public class ProfileUpdate extends BaseClass{
	
	@Test
	public void Profile() {
	
	HomePage hp = new HomePage(driver);
	hp.loginBtnMain();
	LoginPage lp = new LoginPage(driver);
    lp.enterLoginDetails(p.getProperty("mail"), p.getProperty("pwd"));
    lp.clickLogin();
    lp.viewProfilePage();
    ProfilePage pp = new ProfilePage(driver);
    pp.resumeHeadline();
    pp.edit();
    pp.save(p.getProperty("sentence"));
	}
}

package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	
	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	

@FindBy(xpath="//input[@placeholder='Enter your active Email ID / Username']")
WebElement emailId;
@FindBy(xpath="//input[@placeholder='Enter your password']")
WebElement password;
@FindBy(xpath="//button[normalize-space()='Loginn']")
WebElement loginClickBtn;

@FindBy(xpath="//a[normalize-space()='View profile']")
WebElement viewProfile;

public void enterLoginDetails(String mail, String pwd) {
	
	emailId.sendKeys(mail);
	password.sendKeys(pwd);
	
	}
public void clickLogin() {
	
	loginClickBtn.click();
	
	}

public void viewProfilePage() {
	
	viewProfile.click();
	
	}

}

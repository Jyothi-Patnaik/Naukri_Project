package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends BasePage{

	public ProfilePage(WebDriver driver) {
		
		super(driver);
		
	}
	

@FindBy(css="body > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > span:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > ul:nth-child(1) > li:nth-child(3) > span:nth-child(1)")
WebElement resumeHeadlineBtn;
@FindBy(css="div[class='card mt15'] div span[class='edit icon']")
WebElement editBtn;

@FindBy(xpath="//textarea[@id='resumeHeadlineTxt']")
WebElement text;
@FindBy(css="div[class='action s12'] button[type='submit']")
WebElement saveBtn;

public void resumeHeadline() {
	resumeHeadlineBtn.click();
}
public void edit() {
	editBtn.click();
}
public void save(String sentence) {
	text.clear();
	text.sendKeys(sentence);
	saveBtn.click();
}
}

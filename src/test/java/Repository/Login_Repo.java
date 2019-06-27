package Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Login_Repo {
 
	WebDriver driver;
	
	@FindBy(xpath="//ul[@class='h-c-header__cta-list header__nav--ltr']/li/a[contains(text(),'Sign in')]")
	public WebElement signIn;
	
	@FindBy(id="identifierId")
	public WebElement userid;
	
	@FindBy(xpath="//li[@class='h-c-header__cta-li h-c-header__cta-li--primary']/a[contains(text(),'Get Gmail')]")
	public WebElement kun;
	
	@FindBy(xpath="//span[contains(text(),'Next')]")
	public WebElement Next_Email;
	
	@FindBy(xpath="//input[@type='password']")
	public WebElement Next_pwd;
	
	public Login_Repo(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}

		
	
	
	
}

package Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewEmail_Repo {

	WebDriver driver;
	
	@FindBy(xpath="//div[@class='T-I J-J5-Ji T-I-KE L3']")
	public WebElement compose_button;
	
	@FindBy(id=":r9")
	public WebElement reci_Email_bef;
	
	@FindBy(xpath="//textarea[@name='to']")
	public WebElement recipient_email;
	
	@FindBy(xpath="//input[@name='subjectbox']")
	public WebElement recipient_sub;
	
	@FindBy(xpath="//div[@data-tooltip='More options']/div[@class='J-J5-Ji J-JN-M-I-JG']")
	public WebElement label;
	
	@FindBy(xpath="//div[@class='Am Al editable LW-avf']")
	public WebElement body;
	
	@FindBy (xpath="//div[@class='J-Ph Gi J-N']")
	public WebElement  sidepopuplabel;
	
	@FindBy (xpath="//input[@class='bqf']")
	public WebElement lblSearch;
	
	@FindBy (xpath="//div[@title='Work']/div/div")
	public WebElement lblWork;
	
	@FindBy(xpath="//div[contains(text(),'Apply')]")
	public WebElement apply;
	
	@FindBy (xpath="//div[@class='dC']/div[contains(text(),'Send')]")
	public WebElement send;
	
	@FindBy (xpath="//span[@class='bAq']")
	public WebElement success;
	
	public NewEmail_Repo(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
}

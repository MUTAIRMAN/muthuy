package India.Gmail;

import java.awt.Robot;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Repository.Login_Repo;
import Repository.NewEmail_Repo;

public class GmailLogin {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException, IOException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Muthukumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		Properties cred=new Properties();
		FileInputStream fin=new FileInputStream("C:\\Users\\Muthukumar\\eclipse-workspace\\Gmail\\src\\test\\java\\Credentials.properties");
		cred.load(fin);
		String url=cred.getProperty("url");
		
		
		driver.get(url);
		driver.manage().window().maximize();
	
		Login_Repo pf=new Login_Repo(driver);
		NewEmail_Repo test=new NewEmail_Repo(driver);
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		pf.signIn.click();
		
		
	Set<String> win=driver.getWindowHandles();
		Iterator<String> itr=win.iterator();
		while(itr.hasNext())
		{
			String s=itr.next();
			
			driver.switchTo().window(s);
			System.out.println(driver.getTitle());
			if(driver.getTitle().equals("Gmail"))
			{
				pf.userid.click();
				pf.userid.sendKeys(cred.getProperty("id"));
				pf.Next_Email.click();
				Thread.sleep(5000);

				pf.Next_pwd.sendKeys(cred.getProperty("pwd"));
				pf.Next_Email.click();
					
				Thread.sleep(5000);
						
				test.compose_button.click();
				Thread.sleep(5000);
			//	test.reci_Email_bef.click();
				test.recipient_email.sendKeys("pattanm@yahoo.com");
				test.recipient_email.sendKeys(Keys.ENTER);
				Thread.sleep(3000);
				test.body.click();
				Thread.sleep(3000);
				test.recipient_sub.sendKeys("Automated Email");
				
				test.body.sendKeys("hello");
				Thread.sleep(2000);
				test.label.click();
				test.sidepopuplabel.click();
				test.lblSearch.sendKeys("Work");
				Thread.sleep(5000);
				test.lblWork.click();
				test.apply.click();
				test.send.click();
				WebDriverWait driver_wait=new WebDriverWait(driver,2000);
				driver_wait.until(ExpectedConditions.elementToBeClickable(test.success));
				
				
				
				break;
			}
		}
		
		
		driver.quit();
  }
}

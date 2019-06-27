package India.Gmail;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;

	@Test
	public void f() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Muthukumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.toolsqa.com/automation-practice-table/");
		if (driver.findElement(By.className("tsc_table_s13")).isDisplayed()) {
			List<WebElement> rc = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr"));
			List<WebElement> cc = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr/td"));
			for (int i = 1; i <= rc.size(); i++) {
				for (int j = 1; j <= rc.size(); j++) {
					System.out.println(driver.findElement(
							By.xpath("//table[@class='tsc_table_s13']/tbody/tr[" + i + "]/td[" + j + "]")).getText());
				}
			}
		}

		driver.quit();
	}
}

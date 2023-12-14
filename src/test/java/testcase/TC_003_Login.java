package testcase;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_003_Login extends TC_002_LoginPage_Element_print {
	 protected String projectname;
	
	@Test(priority = 3)

	public void Recognizer_login() throws InterruptedException, IOException 
	{
		WebElement username=driver.findElement(By.xpath(prop.getProperty("recognizer_user_field")));
		username.sendKeys(prop.getProperty("username"));
		Reporter.log("enter username");
		WebElement password=driver.findElement(By.xpath(prop.getProperty("recognizer_pswd_field")));
		password.sendKeys(prop.getProperty("password"));
		Reporter.log("enter password ");
		Thread.sleep(2000);
		driver.findElement(By.xpath(prop.getProperty("recognizer_btn"))).click();
		Reporter.log("click signin button");
		Thread.sleep(4000);
	}
	
}

package testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TC_006_createproject extends TC_005_Home_ElementPrint {

	public static String projectname;
	
	@Test(priority = 6)

	public void creat_newproject() throws InterruptedException, IOException 
	{
	
		driver.findElement(By.xpath(prop.getProperty("OA"))).click();
		
		driver.findElement(By.xpath(prop.getProperty("CNP"))).click();
		
		Thread.sleep(2000);
		
	     projectname="Automation Test1";
		
		driver.findElement(By.xpath(prop.getProperty("name"))).sendKeys(projectname);
	
		driver.findElement(By.xpath(prop.getProperty("description"))).sendKeys("Automation Test1");
		
		//driver.findElement(By.xpath(prop.getProperty("stake_holder"))).click();
		
		Thread.sleep(2000);
		
		// Create object of the Select class
		Select se = new Select(driver.findElement(By.xpath("//*[@name='stakeHolderType']")));
					
		// Select the option by value
		se.selectByValue("site");
		
		driver.findElement(By.xpath(prop.getProperty("face"))).click();
		
//		// for scrool down 
//		for (int i = 0; i < 6; i++) {
//			JavascriptExecutor dtes = (JavascriptExecutor) driver;
//			Thread.sleep(2000);
//			dtes.executeScript("window.scrollBy(0,250)", "");
//		}
//		Thread.sleep(2000);
//		
//		WebElement text= driver.findElement(By.xpath(prop.getProperty("text")));
//		
//		System.out.println(text.isEnabled());
//		
//		text.click();
//		
//		Thread.sleep(4000);
//		
//		driver.findElement(By.xpath(prop.getProperty("pancard"))).click();
//		
//		driver.findElement(By.xpath(prop.getProperty("aadhaarcard"))).click();
//		
//		driver.findElement(By.xpath(prop.getProperty("licencecard"))).click();
//		
//		driver.findElement(By.xpath(prop.getProperty("votercard"))).click();
//		
//		driver.findElement(By.xpath(prop.getProperty("passport"))).click();
//		
//		driver.findElement(By.xpath(prop.getProperty("save"))).click();
//		
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath(prop.getProperty("OA"))).click();
//		System.out.println("clicked OA");
//		Thread.sleep(2000);
}
	}

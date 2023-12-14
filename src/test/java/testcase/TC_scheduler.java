package testcase;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.netty.handler.codec.AsciiHeadersEncoder.NewlineType;

public class TC_scheduler extends TC_003_Login {
	
	@Test(priority = 3)

	public void face_comparision() throws InterruptedException, IOException, AWTException {

		// driver.findElement(By.xpath(prop.getProperty("OA"))).click();

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@class=\"icon-keyboard_arrow_right\"]")).click();
		
		Thread.sleep(3000);

		driver.findElement(By.xpath(prop.getProperty("view"))).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath(prop.getProperty("scheduler"))).click();

		Thread.sleep(2000);
		
		driver.findElement(By.xpath(prop.getProperty("add"))).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(prop.getProperty("sc_name"))).sendKeys(prop.getProperty("sc_name1"));
		
		Select se = new Select(driver.findElement(By.xpath("//*[@name='type']")));
		
		// Select the option by value
		se.selectByValue("syncWithTrain");
	
		Actions act = new Actions(driver);
	    WebElement database=driver.findElement(By.xpath(prop.getProperty("select_database")));
	    
	    act.moveToElement(database).click().build().perform();
	    
	    Thread.sleep(2000);
	    
	   act.moveToElement(driver.findElement(By.xpath("//*[text()='Local']"))).click().build().perform();
	
		
		driver.findElement(By.xpath(prop.getProperty("startdate"))).sendKeys("07/10/2023 12:00 PM");

		driver.findElement(By.xpath(prop.getProperty("enddate"))).sendKeys("07/11/2023 12:00 PM");
		
		driver.findElement(By.xpath(prop.getProperty("schedulefrequency"))).click();	
		
		driver.findElement(By.xpath(prop.getProperty("enabled"))).click();
		
		driver.findElement(By.xpath(prop.getProperty("save"))).click();
	}
}

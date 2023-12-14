package testcase;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Only_Training extends Project_click{

	@Test(priority = 7)

	public void Training() throws InterruptedException, IOException, AWTException 
	{
	
//		driver.findElement(By.xpath(prop.getProperty("OA"))).click();
//		
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath(prop.getProperty("view"))).click();
//		
		Thread.sleep(1000);
//		
		driver.findElement(By.xpath(prop.getProperty("dataset"))).click();
		
		 Reporter.log("====================== click on dataset ==============================", true);
//		
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath(prop.getProperty("vertical_menu"))).click();
//	
//		
//		driver.findElement(By.xpath(prop.getProperty("resyndata"))).click();
		
		Thread.sleep(7000);
		
		driver.findElement(By.xpath(prop.getProperty("training"))).click();
		
		Reporter.log("====================== click on start training button ==============================", true);
		
		 Wait<WebDriver> wait = new FluentWait<>(driver)
	                .withTimeout(Duration.ofHours(1)) // Set a timeout value to avoid infinite waiting
	                .pollingEvery(Duration.ofMillis(500)) // Set the interval to check for the condition
	                .ignoring(org.openqa.selenium.NoSuchElementException.class);

	        wait.until(driver -> {
	            WebElement element = driver.findElement(By.xpath("//*[contains(text(), 'Training Completed')]"));
	            return element.isDisplayed();
	        });

	        // Perform further actions after the desired text is present
	        WebElement element = driver.findElement(By.xpath("//*[contains(text(), 'Training Completed')]"));
	        String text = element.getText();
	       Reporter.log("Text found: " + text,true);
	        
	        Thread.sleep(10000);
	        
	        driver.findElement(By.xpath(prop.getProperty("album"))).click();
	        
	        Reporter.log("====================== click on album ==============================", true);
		
	
	}
}

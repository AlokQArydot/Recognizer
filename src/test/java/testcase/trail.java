package testcase;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.math3.ode.SecondaryEquations;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class trail extends TC_003_Login {
	
	
	@Test(priority = 3)

	public void face_comparision() throws InterruptedException, IOException, AWTException {

		// driver.findElement(By.xpath(prop.getProperty("OA"))).click();

		Thread.sleep(2000);

		// Set the XPath of the project click button
        String projectXPath = "//*[text()='test offline project one']/following-sibling::button"; // Replace with your project button's XPath

        // Set the XPath of the next arrow button
        String nextButtonXPath = "//*[@class='icon-keyboard_arrow_right']"; // Replace with your next button's XPath

        // Start an infinite loop until all projects are processed
        while (true) {
            try {
                // Wait for the project button to be clickable
                WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
                WebElement projectButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(projectXPath)));

                // Click on the project button
                projectButton.click();
                System.out.println("Clicked on project");

                // Check if the project is available (add your logic here)
                boolean projectAvailable = true; // Replace with your logic to check if the project is available

                if (projectAvailable) {
                    // Continue with your logic for when the project is available
                    // ...
                } else {
                    // Click on the next button
                    WebElement nextButton = driver.findElement(By.xpath(nextButtonXPath));
                    nextButton.click();
                    System.out.println("Project not available, moving to the next button ");
                }
            } catch (Exception e) {
                System.out.println("Error occurred: " + e.getMessage());
                break; // Exit the loop if an error occurs or all projects are processed
            }
        }
	}}
    
        
        
	
        


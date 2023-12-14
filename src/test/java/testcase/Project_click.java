package testcase;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Project_click extends TC_005_Home_ElementPrint {

	
	@Test(priority = 6)

	public void project_click1() throws InterruptedException, IOException, AWTException {
		
		//[text()='Face and Card']

		
		 try {
	           
	           // String projectXPath = "//*[text()='" + projectname + "']/following-sibling::button"; // if create new project
	            
			 String projectXPath = "//*[text()='Daily_Test_Automation']/following-sibling::button";   
			 
	            // Replace with your next button's XPath on the project list page
	            String nextButtonXPath = "//*[@class='icon-keyboard_arrow_right']";

	            // Search for the project on the first page
	            boolean foundOnFirstPage = searchProjectsOnPage(driver, projectXPath);

	            if (foundOnFirstPage) {
	            	Reporter.log("Project found on the first page!",true);
	            } else {
	                // If the project is not found on the first page, search in the subsequent pages
	                boolean foundInSubsequentPages = searchNextPages(driver, nextButtonXPath, projectXPath);
	                if (foundInSubsequentPages) {
	                	Reporter.log("Project found in subsequent pages!",true);
	                } else {
	                    Reporter.log("Project not found in all pages.",true);
	                }
	            }

	        } catch (Exception e) {
	        	Reporter.log("An error occurred: " + e.getMessage(),true);
	            
	           

	        } finally {
	           
	        }
	    }

	    // Function to search for the project on the current page
	    private static boolean searchProjectsOnPage(WebDriver driver, String projectXPath) {
	        try {
	            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
	            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(projectXPath)));

	            WebElement projectButton = driver.findElement(By.xpath(projectXPath));
	            projectButton.click();
	            return true; // Project found on the current page
	        } catch (Exception e) {
	            return false; // Project not found on the current page
	        }
	    }

	    // Function to search for the project in subsequent pages
	    private static boolean searchNextPages(WebDriver driver, String nextButtonXPath, String projectXPath) {
	        while (true) {
	            try {
	                WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
	                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(nextButtonXPath)));

	                // Click on the next button
	                WebElement nextButton = driver.findElement(By.xpath(nextButtonXPath));
	                nextButton.click();

	                // Search for the project on the current page
	                boolean foundOnCurrentPage = searchProjectsOnPage(driver, projectXPath);
	                if (foundOnCurrentPage) {
	                    return true; // Project found on the current page
	                }
	            } catch (Exception e) {
	                // Next button not found or not clickable, exit the loop
	               Reporter.log("Next button not found or not clickable. Exiting the loop.",true);
	                break;
	            }
	        }

	        return false; // Project not found in all pages
	    }	
	
		
	}	
		



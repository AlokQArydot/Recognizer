package testcase;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_Offlineanalytics_FileUpload extends TC_003_Login{

	
	@Test(priority = 2)

	public void File_upload_photo() throws InterruptedException, IOException, AWTException 
	{
	
		driver.findElement(By.xpath(prop.getProperty("OA"))).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(prop.getProperty("view"))).click();
		
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath(prop.getProperty("uploadpic"))).click();
		
		driver.findElement(By.xpath(prop.getProperty("selectfile"))).click();
		
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath(prop.getProperty("local"))).click();
		
		driver.findElement(By.xpath(prop.getProperty("file"))).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(prop.getProperty("name"))).sendKeys("virat");
		
		driver.findElement(By.xpath(prop.getProperty("uploadfile"))).click();
		 
		try {
	            Thread.sleep(2000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        // Provide the folder path containing the images to upload
	        String folderPath = "/home/alokkumarnayak/Desktop/Recognizer/virat_26";

	     
	        StringSelection stringSelection = new StringSelection(folderPath.toString());
	        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	        
	        Robot robot = new Robot();
	        
	        // Simulate key presses for pasting the image paths
	        robot.keyPress(KeyEvent.VK_CONTROL);
	        robot.keyPress(KeyEvent.VK_V);
	        robot.keyRelease(KeyEvent.VK_V);
	        robot.keyRelease(KeyEvent.VK_CONTROL);

	        // Simulate key press for confirming the selection
	        robot.keyPress(KeyEvent.VK_ENTER);
	        robot.keyRelease(KeyEvent.VK_ENTER);
	      
	        
	        File folder = new File(folderPath);
	        File[] files = folder.listFiles();
	        
	        if (files != null) {
	            // Click on the file upload element to open the file explorer dialog
	           
	            Thread.sleep(2000);  // Wait for the file explorer dialog to open (adjust the wait time as needed)
	            
	            // Use Robot class to simulate keyboard actions
	           
	            
	            // Simulate pressing Ctrl+A to select all files
	            robot.keyPress(KeyEvent.VK_CONTROL);
	            robot.keyPress(KeyEvent.VK_A);
	            robot.keyRelease(KeyEvent.VK_CONTROL);
	            robot.keyRelease(KeyEvent.VK_A);
	            
	            Thread.sleep(1000);  // Wait for the files to be selected (adjust the wait time as needed)
	            
	            // Simulate pressing Enter to confirm the selection and open the files
	            robot.keyPress(KeyEvent.VK_ENTER);
	            robot.keyRelease(KeyEvent.VK_ENTER);
	            
	            // Wait for the file upload process to complete (adjust the wait time as needed)
	            Thread.sleep(3000); 
	            
	            driver.findElement(By.xpath(prop.getProperty("save"))).click();
	            
	            Thread.sleep(50000); 
		        
		      
	        }
		
		
		
	
	}
}

package testcase;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

public class TC_Face_comparision extends TC_003_Login{

	@Test(priority = 3)

	public void face_comparision() throws InterruptedException, IOException, AWTException {

		// driver.findElement(By.xpath(prop.getProperty("OA"))).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath(prop.getProperty("view"))).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath(prop.getProperty("face_cpmp"))).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath(prop.getProperty("uploadimage1"))).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Provide the folder path containing the images to upload
		String imagePath = "/home/alokkumarnayak/Desktop/Recognizer/Card Image/Aadhaar/1.jpeg";

		StringSelection stringSelection = new StringSelection(imagePath.toString());
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

		Thread.sleep(2000);

		driver.findElement(By.xpath(prop.getProperty("uploadimage2"))).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Provide the folder path containing the images to upload
		String imagePath1 = "/home/alokkumarnayak/Desktop/Recognizer/Card Image/Aadhaar/2.jpg";

		StringSelection stringSelection1 = new StringSelection(imagePath1.toString());
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection1, null);

		// Simulate key presses for pasting the image paths
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		// Simulate key press for confirming the selection
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);

		driver.findElement(By.xpath(prop.getProperty("seeresult1"))).click();

		Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(1000)) // Set a timeout value to
																								// avoid infinite
																								// waiting
				.pollingEvery(Duration.ofMillis(500)) // Set the interval to check for the condition
				.ignoring(org.openqa.selenium.NoSuchElementException.class);

		wait.until(driver -> {
			WebElement element = driver.findElement(By.xpath("//*[text()='Facial Comparision Results']"));
			return element.isDisplayed();
		});

		// Perform further actions after the desired text is present
		WebElement element = driver.findElement(By.xpath("//*[text()='Facial Comparision Results']"));
		String text = element.getText();
		System.out.println("Text found: " + text);
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath(prop.getProperty("compairision_history"))).click();

		Thread.sleep(4000);

		driver.findElement(By.xpath(prop.getProperty("delete_c_h"))).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath(prop.getProperty("yes1"))).click();

	}
	
}

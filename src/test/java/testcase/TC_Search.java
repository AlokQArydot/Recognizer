package testcase;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC_Search extends TC_003_Login {

	@Test(priority = 3)

	public void search() throws InterruptedException, IOException, AWTException {

		// driver.findElement(By.xpath(prop.getProperty("OA"))).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath(prop.getProperty("view"))).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath(prop.getProperty("search"))).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath(prop.getProperty("upload1"))).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Provide the folder path containing the images to upload
		String imagePath = "/home/alokkumarnayak/Desktop/Recognizer/Hardhik_26/ngnn.jpg";

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

		Thread.sleep(5000);

		WebElement slider = driver.findElement(By.xpath("//*[@class='rc-slider-handle']"));

		// Determine the slider range (minimum and maximum values)

		int sliderMin = 0;
		int sliderMax = 100;

		// Calculate the desired slider position based on the threshold you want to set
		int desiredThreshold = 300;
		int desiredPosition = (int) ((desiredThreshold - sliderMin) / (double) (sliderMax - sliderMin) * 100);

		// Use Actions class to perform the sliding action with increased precision
		Actions sliderAction = new Actions(driver);
		sliderAction.clickAndHold(slider).moveByOffset(desiredPosition, 0).release().build().perform();

		for (int i = 0; i < 3; i++) {
			JavascriptExecutor dtes = (JavascriptExecutor) driver;
			Thread.sleep(2000);
			dtes.executeScript("window.scrollBy(0,250)", "");
		}

		Thread.sleep(2000);

		driver.findElement(By.xpath(prop.getProperty("seeresult"))).click();

		Thread.sleep(2000);

		for (int i = 0; i < 5; i++) {
			JavascriptExecutor dtes = (JavascriptExecutor) driver;
			Thread.sleep(2000);
			dtes.executeScript("window.scrollBy(0,250)", "");
		}

		driver.findElement(By.xpath(prop.getProperty("searchhistory"))).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath(prop.getProperty("searchdelete"))).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath(prop.getProperty("yes"))).click();

	}

	
}

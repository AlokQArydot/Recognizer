package testcase;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

public class TC_Offlineanalytics_LocalUpload extends TC_006_createproject {

	@Test(priority = 4)

	public void upload_photo() throws InterruptedException, IOException, AWTException {

		// driver.findElement(By.xpath(prop.getProperty("OA"))).click();

		// Thread.sleep(2000);

		// driver.findElement(By.xpath(prop.getProperty("view"))).click();

		// Thread.sleep(3000);

		Thread.sleep(4000);

		driver.findElement(By.xpath(prop.getProperty("selectfile"))).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath(prop.getProperty("local"))).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Provide the folder path containing the images to upload
		String folderPath = "/home/alokkumarnayak/Desktop/Recognizer/Hardhik_26";

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

			Thread.sleep(2000); // Wait for the file explorer dialog to open (adjust the wait time as needed)

			// Use Robot class to simulate keyboard actions

			// Simulate pressing Ctrl+A to select all files
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_A);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_A);

			Thread.sleep(1000); // Wait for the files to be selected (adjust the wait time as needed)

			// Simulate pressing Enter to confirm the selection and open the files
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);

			Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(1000)) // Set a timeout value
																									// to avoid infinite
																									// waiting
					.pollingEvery(Duration.ofMillis(500)) // Set the interval to check for the condition
					.ignoring(org.openqa.selenium.NoSuchElementException.class);

			wait.until(driver -> {
				WebElement element = driver.findElement(By.xpath("//*[@class='phototext-1']"));
				return element.isDisplayed();
			});

			// Perform further actions after the desired text is present
			WebElement element = driver.findElement(By.xpath("//*[@class='phototext-1']"));
			String text = element.getText();
			System.out.println("Text found: " + text);

			Thread.sleep(2000);

			driver.findElement(By.xpath(prop.getProperty("cross"))).click();

			Thread.sleep(4000);

			// Add anathor file photo upload

			driver.findElement(By.xpath(prop.getProperty("uploadpic"))).click();

			Thread.sleep(2000);

			driver.findElement(By.xpath(prop.getProperty("local"))).click();

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			// Provide the folder path containing the images to upload
			String folderPath1 = "/home/alokkumarnayak/Desktop/Recognizer/dhoni";

			StringSelection stringSelection1 = new StringSelection(folderPath1.toString());
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection1, null);

			// Robot robot = new Robot();

			// Simulate key presses for pasting the image paths
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);

			// Simulate key press for confirming the selection
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);

			File folder1 = new File(folderPath);
			File[] files1 = folder1.listFiles();

			if (files1 != null) {
				// Click on the file upload element to open the file explorer dialog

				Thread.sleep(2000); // Wait for the file explorer dialog to open (adjust the wait time as needed)

				// Use Robot class to simulate keyboard actions

				// Simulate pressing Ctrl+A to select all files
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_A);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				robot.keyRelease(KeyEvent.VK_A);

				Thread.sleep(1000); // Wait for the files to be selected (adjust the wait time as needed)

				// Simulate pressing Enter to confirm the selection and open the files
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);

				Wait<WebDriver> wait1 = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(1000)) // Set a timeout
																										// value to
																										// avoid
																										// infinite
																										// waiting
						.pollingEvery(Duration.ofMillis(500)) // Set the interval to check for the condition
						.ignoring(org.openqa.selenium.NoSuchElementException.class);

				wait1.until(driver -> {
					WebElement element1 = driver.findElement(By.xpath("//*[@class='phototext-1']"));
					return element1.isDisplayed();
				});

				// Perform further actions after the desired text is present
				WebElement element1 = driver.findElement(By.xpath("//*[@class='phototext-1']"));
				String text1 = element1.getText();
				System.out.println("Text found: " + text1);

				// Wait for the file upload process to complete (adjust the wait time as needed)
				Thread.sleep(4000);

				driver.findElement(By.xpath(prop.getProperty("training"))).click();

				Wait<WebDriver> wait2 = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(1000)) // Set a timeout  value to avoid infinite waiting
					
						.pollingEvery(Duration.ofMillis(500)) // Set the interval to check for the condition
						.ignoring(org.openqa.selenium.NoSuchElementException.class);

				wait2.until(driver -> {
					WebElement element2 = driver.findElement(By.xpath("//*[contains(text(), 'Training Completed')]"));
					return element2.isDisplayed();
				});

				// Perform further actions after the desired text is present
				WebElement element2 = driver.findElement(By.xpath("//*[contains(text(), 'Training Completed')]"));
				String text2 = element2.getText();
				System.out.println("Text found: " + text2);
			}

		}

	}
}

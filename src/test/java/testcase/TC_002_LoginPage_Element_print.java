package testcase;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_002_LoginPage_Element_print extends TC_001_LoginPage_BrokenLinks {

	@Test(priority = 2)

	public void Loginpage_Elements() throws IOException {

		// Replace 'your_tag_here' with the tag name you want to count
		String targetTag = "div";

		// Find all elements with the target tag
		// The findElements method returns a list of matching elements
		List<WebElement> elements = driver.findElements(By.tagName(targetTag));

		// Get the count of the elements found
		int count = elements.size();
		Reporter.log("====================== Elements Counts ==============================", true);

		Reporter.log("The number of <" + targetTag + "> elements is: " + count, true);

		int actualMessage = elements.size();

		int expectedMessage = 14;

		Assert.assertEquals(actualMessage, expectedMessage);

		for (int i = 0; i < elements.size(); i++) {

			Reporter.log("====================== Elements Names ==============================", true);

			Reporter.log("Elements on page are : " + elements.get(i).getText(), true);

			Reporter.log("====================== Location  ==============================", true);

			Reporter.log("Elements Location : " + elements.get(i).getLocation(), true);

		}

	}
}

package testcase;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_005_Home_ElementPrint extends TC_004_Home_BrokenLinks {
	
	@Test(priority = 5)

	public void HomePageElementsprint() throws IOException, InterruptedException 
	{

		Thread.sleep(3000);
        // Replace 'your_tag_here' with the tag name you want to count
        String targetTag = "div";

       
        // Find all elements with the target tag
        // The findElements method returns a list of matching elements
        List<WebElement> elements = driver.findElements(By.tagName(targetTag));

        // Get the count of the elements found
        int count = elements.size();
        Reporter.log("====================== Elements Counts ==============================", true);
       
        Reporter.log("The number of <" + targetTag + "> elements is: " + count,true);
        
        int actualMessage = count;
        
        String expectedMessage = "114";
   	 
        Assert.assertEquals(String.valueOf(actualMessage), expectedMessage);
        
        for(int i=0; i< elements.size(); i++)
        {
        	
        	 Reporter.log("====================== Elements Names ==============================", true);
        	 
        	 Reporter.log("Elements on page are : " +elements.get(i).getText(),true);
        	 
        	 Reporter.log("====================== Location Names ==============================", true);
        	 
        	 Reporter.log("Elements Location : " +elements.get(i).getLocation(),true);
        	 
        	
 
        	 
        }	
		
	}

}

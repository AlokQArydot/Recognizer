package testcase;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Trail_1 extends TC_003_Login {

	@Test(priority = 2)

	public void upload_photo() throws InterruptedException, IOException, AWTException {

		driver.findElement(By.xpath(prop.getProperty("OA"))).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath(prop.getProperty("view"))).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath(prop.getProperty("database"))).click();

		Thread.sleep(3000);

		WebElement a = driver.findElement(By.xpath(prop.getProperty("createe")));

		
		
       SoftAssert softAssert = new SoftAssert();
        
        // Perform verification steps
        String actualResult = "226.5px";
       
        String expectedResult = a.getCssValue("width");
        
        System.out.println("Actual width ="+ actualResult);
        System.out.println("expected width ="+expectedResult);
        
        softAssert.assertEquals(actualResult, expectedResult, "Verify actual and expected results");
        
        // Assert all the verification steps
        softAssert.assertAll();
		
		//System.out.println(a.getCssValue("width"));

		//System.out.println(a.getCssValue("display"));
		
		  // Perform verification steps
        String actualResult1 = "block";
        String expectedResult1 = a.getCssValue("display");
        
        System.out.println("Actual block ="+ actualResult1);
        System.out.println("expected block ="+expectedResult1);
        
        softAssert.assertEquals(actualResult1, expectedResult1, "Verify actual and expected results");
        

		//System.out.println(a.getCssValue("left"));
		
		  // Perform verification steps
        String actualResult2 = "auto";
        String expectedResult2 = a.getCssValue("left");
        
        System.out.println("Actual left ="+ actualResult2);
        System.out.println("expected left ="+expectedResult2);
        
        softAssert.assertEquals(actualResult2, expectedResult2, "Verify actual and expected results");
        
		
		//System.out.println(a.getCssValue("direction"));
		
		  // Perform verification steps
        String actualResult3 = "ltr";
        String expectedResult3 = a.getCssValue("direction");
        
        System.out.println("Actual direction ="+ actualResult3);
        System.out.println("expected direction ="+expectedResult3);
        
        softAssert.assertEquals(actualResult3, expectedResult3, "Verify actual and expected results");
        
        WebElement b = driver.findElement(By.xpath(prop.getProperty("uploadpic")));
        
      //  String actualResult4 = "ltl";
       // String expectedResult4 = b.getCssValue("position");
        
        Point  buttonPosition = b.getLocation();
        int xCoordinate = buttonPosition.getX();
        int yCoordinate = buttonPosition.getY();
        System.out.println("Login button position (X, Y): " + xCoordinate + ", " + yCoordinate);
        
//        System.out.println("Actual position ="+ actualResult4);
//        System.out.println("expected position ="+expectedResult4);
        
   //     softAssert.assertEquals(actualResult4, expectedResult4, "Verify actual and expected results");
        
        
        
        // Assert all the verification steps
        softAssert.assertAll();

	}
}

package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DesignTest_script extends Baseclass {
	

	@Test(priority = 1)

	public void design() {
 
		driver.get(prop.getProperty("Retesturl"));

    // Validate the design of the login page
    try {
        // Verify the presence and layout of input fields
        WebElement usernameField = driver.findElement(By.xpath("//*[@id='E-Mail']"));
        WebElement passwordField = driver.findElement(By.xpath("//*[@id='Password']"));

        if (usernameField.isDisplayed() && passwordField.isDisplayed()) {
            System.out.println("Username and Password fields are displayed correctly.");
        } else {
            System.out.println("Username and Password fields are not displayed correctly.");
        }

        // Verify the presence and text of the login button
        WebElement loginButton = driver.findElement(By.xpath("//*[@class='btn btn-lg btn-primary btn-block']"));

        if (loginButton.isDisplayed() && loginButton.getText().equals("Sign In")) {
            //System.out.println("Login button is displayed correctly.");

            // Get the position of the login button
            Point  buttonPosition = loginButton.getLocation();
            int xCoordinate = buttonPosition.getX();
            int yCoordinate = buttonPosition.getY();
            System.out.println("Login button position (X, Y): " + xCoordinate + ", " + yCoordinate);
        } else {
            System.out.println("Login button is not displayed correctly.");
        }

        // Add more validation for other design elements as needed

    } catch (Exception e) {
        System.out.println("Error occurred while validating the login page design: " + e.getMessage());
    } finally {
      
    }
}}




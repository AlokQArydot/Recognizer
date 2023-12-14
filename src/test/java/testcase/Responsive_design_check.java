package testcase;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Responsive_design_check {
	// extends Baseclass
	@Test(priority = 3)

	public void Responsive_design() {

		String text = ("alokkumar");

		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			System.out.println("Character at index " + i + ": " + c);
		}
		Reporter.log("============= Reverse ============", true);
		for (int i = text.length() - 1; i >= 0; i--) {
			char c = text.charAt(i);
			System.out.println("Character at index " + i + ": " + c);
		}
		Reporter.log("============= index number of charecter ============", true);
		
		 char targetChar = 'u';

	        // Find the index of the target character
	        int index = text.indexOf(targetChar);

	        // Check if the character was found and print the index
	        if (index != -1) {
	            System.out.println("The index of '" + targetChar + "' in the string is: " + index);
	        } else {
	            System.out.println("Character '" + targetChar + "' not found in the string.");
	        }
	        
	        Reporter.log("============= index  ============", true);
	        
	     // Index number for the character you want to print
	        int index1 = 4; // Change this value to the desired index

	        // Check if the index is within the bounds of the string
	        if (index1 >= 0 && index < text.length()) {
	            char c = text.charAt(index1);
	            System.out.println("Character at index " + index1 + ": " + c);
	        } else {
	            System.out.println("Invalid index: " + index1);
	        }
		
		
	}
}

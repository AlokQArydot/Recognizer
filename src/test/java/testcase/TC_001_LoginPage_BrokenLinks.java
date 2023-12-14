package testcase;



import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_001_LoginPage_BrokenLinks  extends Baseclass{
	
	@Test(priority = 1)

	public void LoginPage_Links() throws IOException 
	{
		
		
		//Find HyperLinks
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		
		
		int resCode=200; //2XX responce code is Valid Link
		int brokenLinkCnt = 0;
		
		Reporter.log("Total links on page:" + linkList.size());
		
		for(int i=0; i<linkList.size(); i++)
		{
			Reporter.log("Links on page are " +linkList.get(i).getAttribute("href"),true);
			Reporter.log("Links on page are " +linkList.get(i).getText(),true);
		}
		
		for(WebElement element:linkList) 
		{
			String url = element.getAttribute("href");
			
			try {
				
			URL urlLink = new URL(url);
			
			HttpURLConnection huc = (HttpURLConnection)urlLink.openConnection();
			huc.setRequestMethod("HEAD");
			huc.connect();
			
			resCode = huc.getResponseCode();
			
			if(resCode >= 400) 
			{
				Reporter.log(url + "broken link.",true);
				brokenLinkCnt ++;
			}
		}
			catch(MalformedURLException e)
			{
				
			}
			catch(Exception e) 
			{
				
			}
			
		}
		Reporter.log("Total broken list:" + brokenLinkCnt,true);
		
		

}
}

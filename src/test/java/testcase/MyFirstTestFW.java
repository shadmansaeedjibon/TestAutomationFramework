package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.ReadXLSdata;

public class MyFirstTestFW extends BaseTest {
	
	
@Test(dataProviderClass=ReadXLSdata.class,dataProvider="bvtdata") 
public static void LoginTest(String username, String password) throws InterruptedException

{
		//WebDriverManager.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println("Clicked Successfully");
		driver.findElement(By.linkText(Loc.getProperty("signin_link"))).click(); //locators --properties
		driver.findElement(By.id(Loc.getProperty("email_field"))).sendKeys(username);
		driver.findElement(By.xpath(Loc.getProperty("next_button"))).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath(Loc.getProperty("pass_field"))).sendKeys(password);
		driver.findElement(By.xpath(Loc.getProperty("login_next_button"))).click();		
	
	}

 /*    @DataProvider(name="testdata")
    public Object [][] tdata()
    
    {
    	return new Object[][]
    	{
    		{"jibonrootnext@gmail.com","Ur@12345678"},	
    		{"jibotnext@gmail.com","Ur@12678"},	
    		{"bonrootnext@gmail.com","Ur@12323445678"},	
    		{"jibonrootnt@gmail.com","Ur@12365645678"}	
    	};
    }*/

}
	

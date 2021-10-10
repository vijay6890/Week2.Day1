package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Demosalesmanager");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();

		WebElement getin = driver.findElement(By.linkText("CRM/SFA"));
		getin.click();

		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Grow");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Vijay");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kumar");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("61");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("04");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("vijayvinod123@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("0468481044");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Test");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("https://info@info.com");

		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Kumar");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Unit 5");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Los Angels");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("6114");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("2215");
	
				
		WebElement Firstdrop = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select drop = new Select (Firstdrop);
		drop.selectByVisibleText("Direct Mail");
		
		WebElement Seconddrop = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select droptwo = new Select (Seconddrop);
		droptwo.selectByIndex(8);
		
		WebElement Thirddrop = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dropthree = new Select (Thirddrop);
		dropthree.selectByValue("OWN_PARTNERSHIP");
		
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("Alabama");
		
		driver.findElement(By.name("submitButton")).click();
		String Firstname = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println("My first name is:" +Firstname);
		
		String title = driver.getTitle();
		System.out.println("My page title is:" +title);
		
		
/*
1. Select the Direct Mail from Source using selectByVisibleText
2. Select the Health Care from Industry using selectByIndex
3. Select the Partnership from Ownership using selectByValue
4. Select Affiliated Sites using sendKeys from Marketing Campaign
 */

		// Thread.sleep(3000);
		// driver.close();
	}
}

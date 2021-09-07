package Week2Assessment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class salesforce {
	
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://login.salesforce.com/");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElementById("username").sendKeys("earth@testleaf.com");
	driver.findElementById("password").sendKeys("Bootcamp$123");
	driver.findElementById("Login").click(); 
	Thread.sleep(50000);	 
	driver.findElementByXPath("//div[@class='slds-icon-waffle']").click();
	driver.findElementByXPath("//button[text() = 'View All']").click();
	Thread.sleep(40000);	 
    driver.findElementByXPath("//p[text() = 'Contracts']").click();
    driver.findElementByXPath("//span[text() = 'Recently Viewed | Contracts' ]/following::lightning-primitive-icon[1]").click();
	driver.findElementByXPath("//span[text() = 'New Contract']").click();
    
    
    
    
	
	
	
	

	}

}

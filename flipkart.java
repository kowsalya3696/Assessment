package Week3Assessment;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class flipkart {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElementByXPath("//button[@class ='_2KpZ6l _2doB4z']").click();
        WebElement Fashion = driver.findElementByXPath("//div[@class='eFQ30H'][4]");
        Actions builder = new Actions(driver);
        builder.moveToElement(Fashion).perform();
        driver.findElementByLinkText("Men's Bottom Wear").click();
        Thread.sleep(5000);
        WebElement source = driver.findElementByXPath("//div[@class='HQL4QS _28DFQy']");
        builder.dragAndDropBy(source, 101, 0).build().perform();
        Thread.sleep(5000);
        WebElement source1 = driver.findElementByXPath("//div[@class='HQL4QS WC_zGJ']");
        builder.dragAndDropBy(source1, -68, 0).build().perform();
        Thread.sleep(5000);
        String parentWindow = driver.getWindowHandle();
     	driver.findElementByXPath("//span[contains(text(), 'Showing')]/parent::div/following::a").click();
     	Set<String> allWindows = driver.getWindowHandles();
     	java.util.Iterator<String> iterator = allWindows.iterator();			
     	while (iterator.hasNext()) {
     	String childWindow = iterator.next();
     	if (!parentWindow.equalsIgnoreCase(childWindow)) {
     	driver.switchTo().window(childWindow);
     	String retrunPolicyText = driver.findElementByXPath("//div[contains(text(),'Return Policy')]").getText();
     	String days = retrunPolicyText.replaceAll("[^0-9]", " ").trim();
     	System.out.println(" Return Policy days :" + days);
     				}
     			}
     		}}
     	
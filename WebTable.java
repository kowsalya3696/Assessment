package Week3Assessment;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    
    List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
    int rowSize = allRows.size(); 
    //System.out.println(rowSize);
    for (int i = 1; i <= rowSize; i++) {
    List<WebElement> allcells = driver.findElementsByXPath("//table[@id='customers']//tr["+i+"]/td");
	int cellcount  = allcells.size();
	//System.out.println(cellcount);
    for(int j = 1; j <=cellcount; j++) {
	String text = driver.findElementByXPath("//table[@id='customers']//tr["+i+"]/td["+j+"]").getText();
	System.out.println(text);
		
    }
    }}
}


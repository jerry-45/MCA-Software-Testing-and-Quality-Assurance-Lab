package usingFirefoxDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class actionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// step I  WebDriver launch
		System.setProperty("webdriver.gecko.driver","E:\\Study Materials\\Academics\\MCA\\MCA SEM III\\# Repos\\MCA-Software-Testing-and-Quality-Assurance-Lab\\Required Tools & Software\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();		
				
		//step II get base URL
		String baseUrl = "http://demo.guru99.com/test/newtours/";
		driver.get(baseUrl);   
		        
		//step III find the element 
		WebElement link_Home = driver.findElement(By.linkText("Home"));
		WebElement td_Home = driver.findElement(By.xpath("//html/body/div" + "/table/tbody/tr/td" + "/table/tbody/tr/td" + "/table/tbody/tr/td" + "/table/tbody/tr"));    
		                 
		Actions builder = new Actions(driver);
		Action mouseOverHome = builder.moveToElement(link_Home).build();
		                 
		String bgColor = td_Home.getCssValue("background-color");
		System.out.println("Before hover: " + bgColor);        
		mouseOverHome.perform();        
		bgColor = td_Home.getCssValue("background-color");
		System.out.println("After hover: " + bgColor);
		
//		driver.close();
	}
}

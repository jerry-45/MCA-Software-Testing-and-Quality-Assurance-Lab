package usingFirefoxDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class findElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\# Repos\\MCA-Software-Testing-and-Quality-Assurance-Lab\\Required Tools & Software\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.calculator.net/mass-calculator.html");
		
		// By ID
		driver.findElement(By.id("cdensity")).clear();
		Thread.sleep(5000);
		driver.findElement(By.id("cdensity")).sendKeys("500");
		Thread.sleep(5000);
		
		// By Name
		driver.findElement(By.name("cvolume")).clear();
		Thread.sleep(5000);
		driver.findElement(By.name("cvolume")).sendKeys("4");
		Thread.sleep(5000);
		
		// By ClassName
		driver.findElement(By.className("inhalf")).clear();
		Thread.sleep(5000);
		driver.findElement(By.className("inhalf")).sendKeys("200");
		Thread.sleep(5000);
		
		// By LinkText
		driver.findElement(By.linkText("Age")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		
		// By Partial Link Test
		driver.findElement(By.partialLinkText("Time")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		
		// By CSS Selector
		driver.findElement(By.cssSelector("table.panel tbody:nth-child(1) tr:nth-child(1) > input:nth-child(2)")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		
		// By XPath
		driver.findElement(By.xpath("//tbody/tr[3]/td[1]/img[1]")).click();
		Thread.sleep(5000);
		
		driver.quit();
	}

}

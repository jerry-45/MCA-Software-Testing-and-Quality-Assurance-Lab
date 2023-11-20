package usingFirefoxDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alerts {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\# Repos\\MCA-Software-Testing-and-Quality-Assurance-Lab\\Required Tools & Software\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.name("cusid")).sendKeys("53920");
		Thread.sleep(2000);
		driver.findElement(By.name("submit")).submit();
		
		driver.switchTo().alert();
		
		driver.switchTo().alert().getText();
		
		driver.quit();
	}

}

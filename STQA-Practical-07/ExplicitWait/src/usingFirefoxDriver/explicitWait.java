package usingFirefoxDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitWait {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","E:\\Study Materials\\Academics\\MCA\\MCA SEM III\\# Repos\\MCA-Software-Testing-and-Quality-Assurance-Lab\\Required Tools & Software\\geckodriver.exe");
		WebDriver wd = new FirefoxDriver(); 
		wd.get("https://opensource-demo.orangehrmlive.com/");
		WebDriverWait wt = new WebDriverWait(wd,10); wd.findElement(By.id("txtUsername")).sendKeys("admin");//locator id
		wd.findElement(By.name("txtPassword")).sendKeys("admin123");//locate r name
		wd.findElement(By.className("button")).click();//locator className
		wd.findElement(By.partialLinkText("Welcome")).click();//locator partiallinkText
		wd.findElement(By.xpath("//*[@id=\"welcome\"]")).click();
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Log out")));
		wd.findElement(By.linkText("Logout")).click();//locator linkText
	}
}

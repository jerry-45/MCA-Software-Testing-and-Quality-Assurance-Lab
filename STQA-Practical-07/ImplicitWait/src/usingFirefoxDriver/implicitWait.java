package usingFirefoxDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class implicitWait {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","E:\\Study Materials\\Academics\\MCA\\MCA SEM III\\# Repos\\MCA-Software-Testing-and-Quality-Assurance-Lab\\Required Tools & Software\\geckodriver.exe");
		WebDriver wd = new FirefoxDriver();
		wd.get("https://opensource-demo.orangehrmlive.com/");

		wd.findElement(By.id("txtUsername")).sendKeys("admin");//locator id wd.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);//implicit wait

		wd.findElement(By.name("txtPassword")).sendKeys("admin123");//locate r name
		wd.findElement(By.className("button")).click();//locator className

		wd.findElement(By.partialLinkText("Welcome")).click();//locator partiallinkText
		wd.findElement(By.xpath("//*[@id=\"welcome\"]")).click(); 
		wd.findElement(By.linkText("Logout")).click();//locator linkText
	}
}

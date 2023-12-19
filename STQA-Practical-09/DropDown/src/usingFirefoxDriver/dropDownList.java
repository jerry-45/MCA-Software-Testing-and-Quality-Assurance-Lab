package usingFirefoxDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDownList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","E:\\Study Materials\\Academics\\MCA\\MCA SEM III\\# Repos\\MCA-Software-Testing-and-Quality-Assurance-Lab\\Required Tools & Software\\geckodriver.exe");
		WebDriver wd = new FirefoxDriver(); 
		wd.get("https://blazedemo.com/");

		Select s = new Select(wd.findElement(By.name("fromPort"))); 
		Select t = new Select(wd.findElement(By.name("toPort")));
		s.selectByVisibleText("Paris");
		t.selectByVisibleText("Rome");
	}
}

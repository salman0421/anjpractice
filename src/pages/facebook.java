package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class facebook {
	public static WebDriver driver;
	public facebook(WebDriver driver)
	{
		this.driver=driver;
	}
@Test
public void launch(String br){
	if(br.equals("chrome")){
		System.setProperty("webdriver.chrome.driver","C:\\marthanjaiah\\chromedriver.exe");
		driver=new ChromeDriver();
	}
}
@Test
public void addemp(){
	
	
}
}

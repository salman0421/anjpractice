package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class commonpage {
	WebElement ee;
	WebElement job;
	WebElement jo;
	public  WebDriver driver;
	Actions a;
public void bropen(){
	System.setProperty("webdriver.chrome.driver","C:\\marthanjaiah\\chromedriver.exe");
	driver=new ChromeDriver();
	
	
}
public  void commonpage(String url){
	driver.get(url);
	
}

public void login(String un,String pwd){
	driver.findElement(By.name("txtUserName")).sendKeys(un);
	driver.findElement(By.name("txtPassword")).sendKeys(pwd);
	driver.findElement(By.name("Submit")).click();
}
public void getPim(){
	a=new Actions(driver);
	 ee=driver.findElement(By.xpath("//span[text()='Admin']"));
	 job=driver.findElement(By.xpath("//span[text()='Job']"));
	 jo=driver.findElement(By.xpath("//span[text()='Job Titles']"));
	 
	 a.moveToElement(ee).moveToElement(job).moveToElement(jo).build().perform();
}
public void pimlength(){
	
	List<WebElement> li= driver.findElements(By.xpath("//span[text()='Admin']"));
		for(WebElement l:li){
		String s=l.getText();
		System.out.println(s);
	}

}}

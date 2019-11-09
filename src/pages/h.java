package pages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class h {
	//String q="qaplanet1";
	Actions aa;
	public static WebDriver driver;
@BeforeSuite
public void class1(){
System.setProperty("webdriver.chrome.driver","C:\\marthanjaiah\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://apps.qaplanet.in/hrm/login.php");
}

public void loginopen(String q1,String q2) throws InterruptedException{

	driver.findElement(By.name("txtUserName")).sendKeys(q1);
	driver.findElement(By.name("Submit")).click();



	Alert a=driver.switchTo().alert();
	a.accept();
	driver.findElement(By.name("txtPassword")).sendKeys(q2);
	driver.findElement(By.name("Submit")).click();
}
	@Test(priority=1)
	public void adm() throws InterruptedException{
		
	
	WebElement we=driver.findElement(By.xpath("//span[text()='Admin']"));
	aa=new Actions(driver);
	WebElement wee=driver.findElement(By.xpath("//span[text()='Job']"));
	WebElement weee=driver.findElement(By.xpath("//span[text()='Job Titles']"));
	Thread.sleep(2000);
	aa.moveToElement(we).moveToElement(wee).moveToElement(wee).build().perform();
	List<WebElement> li=driver.findElements(By.xpath("//ul[@id='nav']/li"));
	for(WebElement l:li){
		System.out.println(l.getText());
	}
	
	
	System.out.println("     ");
	List<WebElement> ad=driver.findElements(By.xpath("//ul[@class='l2']/li"));
	for(WebElement l1:ad){
		
		System.out.println(l1.getText()); 
		
	}
}
	

}

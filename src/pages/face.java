package pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class face extends h{
	h h;
	
	@Test(priority=1)
	public void log() throws InterruptedException{
		h=new h();
	h.loginopen("qaplanet1","lab1");
	adm();
	}
	

	WebElement well; 
	@Test(priority=2)
	public void  facelogin(String tit){
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		 tit="welcome";
		String wel=driver.findElement(By.xpath("//li[text()='Welcome qaplanet1']")).getText();
		if(wel.equals(tit+" qaplanet1")){
			System.out.println("welcomeqaplanet1 displayed");
		}
		else
			System.out.println("it is not displayed"); 
			
	}
	@Test(priority=5)
	public void pim(){
		
		WebElement epp=driver.findElement(By.xpath("//span[contains(text(),'PIM')]"));
		WebElement aep=driver.findElement(By.xpath("//span[contains(text(),'Add Employee')]"));
		aa.moveToElement(epp).moveToElement(aep).build().perform();
		aep.click();
	List<WebElement> ep=driver.findElements(By.xpath("//li[@id='pim']/descendant::ul/li/a/span"));
	for(WebElement e:ep){
		System.out.println(e.getText()); 
		
	}
	
	
	}
	public void thred() throws InterruptedException{
		Thread.sleep(2000);
	}
	/*public void  ademppp(String lname,String fname){
		WebDriverWait wait=new WebDriverWait(driver,30); 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[contains(@name,'txtEmpLastName')]")));
		driver.findElement(By.xpath("//input[contains(@name,'txtEmpLastName')]")).sendKeys(lname);
		driver.findElement(By.xpath("//input[contains(@name,'txtEmpFirstName')]")).sendKeys(fname);
	}
*/
}

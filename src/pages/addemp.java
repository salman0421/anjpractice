package pages;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class addemp extends face{
	
	face f=new face();
@Test(priority=6)
public void Adda() throws InterruptedException, AWTException{
	f.thred();
	//f.ademppp("martha","anjaiah");
	driver.findElement(By.xpath("//input[contains(@name,'txtEmpFirstName')]")).sendKeys("martha");
	driver.findElement(By.xpath("//input[contains(@name,'txtEmpLastName')]")).sendKeys("anjaiah");
	StringSelection ss=new StringSelection("C:\\Users\\Public\\Pictures\\Sample Pictures\\Chrysanthemum.jpg");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
	Robot rt=new Robot();
	rt.keyPress(KeyEvent.VK_CONTROL);
			
}}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.server.handler.GetCurrentUrl;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testcses extends  commonpage{
	
@BeforeMethod
public void broopen(){
	bropen();
commonpage("http://apps.qaplanet.in/hrm/login.php");
	
}

public void loginpage(){
	login("qaplanet1","lab1");
	getPim();pimlength();
}
}

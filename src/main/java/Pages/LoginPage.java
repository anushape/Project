package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
WebDriver driver;

public LoginPage(WebDriver driver) {
	super(driver);
	this.driver=driver;
	
	
}
//Locators
By Username=By.name("uid");
By Password=By.name("password");
By Submit=By.name("btnLogin");

//Methods and Actions
public void Login_Details(String Text1,String Text2) {
	
	SendKeys(Username, Text1);
	SendKeys(Password,Text2);
}
	
	
public void ClickSubmit() {
	Click(Submit);
}
}

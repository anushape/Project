package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage

{
WebDriver driver;
public HomePage(WebDriver driver) {
	super(driver);
	this.driver=driver;
}


By New_Customer=By.linkText("New Customer");
By Edit_Customer=By.linkText("Edit Customer");

 
public void select_NewCustomer() {
Click(New_Customer);
refresh();
Click(New_Customer);
 }

public void select_EditCustomer() throws InterruptedException {
	 Click(Edit_Customer);
	 refresh();
	 Click(Edit_Customer);
	 Thread.sleep(5000);
}
}







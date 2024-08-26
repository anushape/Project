package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewCustomerPage extends BasePage {
	
	WebDriver driver;
	public NewCustomerPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		
	}
By Customer_Name=By.name("name");
By Female=By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[2]");
By DOB= By.name("dob");
By Address=By.name("addr");


public void customerDetails(String Text1,String Text2,String Text3) {
	
	SendKeys(Customer_Name, Text1);
	Click(Female);
	SendKeys(DOB, Text2);
	SendKeys(Address, Text3);
}
}

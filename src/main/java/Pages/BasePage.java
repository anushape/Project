package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {
WebDriver driver;
 

public BasePage(WebDriver driver) {
	this.driver=driver;
}
void Click(By locator) {
	driver.findElement(locator).click();
}
	
void SendKeys(By locator,String Text) {
	driver.findElement(locator).sendKeys(Text);
}	
void refresh() {
driver.navigate().refresh();
}
void AcceptAlert() {
	driver.switchTo().alert().accept();
}
}

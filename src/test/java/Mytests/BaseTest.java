package Mytests;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.NewCustomerPage;

public class BaseTest {
	WebDriver driver;
	LoginPage LP;
	HomePage HP;
	NewCustomerPage NC;
	Properties prop;

	
	@BeforeTest
	void OpenApp() throws IOException{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/v4/");
		LP=new LoginPage(driver);
		HP=new HomePage(driver);
		NC=new NewCustomerPage(driver);
		prop=new Properties();
		FileInputStream file=new FileInputStream("C:\\Users\\18582\\eclipse-workspace\\Project\\src\\test\\resources\\config.properties");
		prop.load(file);
		
		}
	
	@AfterTest

	void CloseApp() {
		driver.close();
	}
}

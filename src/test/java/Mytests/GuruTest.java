package Mytests;

import org.testng.annotations.Test;

public class GuruTest extends BaseTest {

@Test (priority=1)
void Login() {
	LP.Login_Details(prop.getProperty("UserId"), prop.getProperty("PWD"));
	LP.ClickSubmit();
}


@Test (priority=2)
void NewCustomer() {
	HP.select_NewCustomer();
	NC.customerDetails(prop.getProperty("CustomerName"),prop.getProperty("DOB"), prop.getProperty("Address"));
	
	}

@Test (priority=3)
void EditCustomer() throws InterruptedException {
	HP.select_EditCustomer();
}

}

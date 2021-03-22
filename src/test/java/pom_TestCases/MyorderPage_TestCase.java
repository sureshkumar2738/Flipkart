package pom_TestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom_Pages.CartPage;
import pom_Pages.HomePage;
import pom_Pages.LoginPage;
import pom_Pages.MyorderPage;
import pom_Pages.PaymentPage;
import pom_Pages.ShoppingPage;
import pom_TestBase.TestBase;

public class MyorderPage_TestCase extends TestBase{

	public MyorderPage_TestCase() throws IOException {
		super();
		
	}
	
	LoginPage loginpage;
	
	HomePage homepage;
	
	ShoppingPage shoppingpage;
	
	CartPage cartpage;
	
	MyorderPage myorderpage;
	
	PaymentPage paymentpage;

	@BeforeMethod
	public void setup() throws IOException {
		
		inilization();
		
        try {
			loginpage = new LoginPage();
			
			homepage = loginpage.clickloginbtn(prop.getProperty("email"), prop.getProperty("password"));
			
			homepage = new HomePage();
			
			homepage.clickonsearchbox(prop.getProperty("searchbox"));
			
			shoppingpage = homepage.clickonclotheslnk();
			
			shoppingpage = new ShoppingPage();
			
			cartpage = shoppingpage.clickonselectshirtlnk();
			
			cartpage = new CartPage();
			
			cartpage.clickonsizechartlnk();
			
			myorderpage = cartpage.clickoncartlnk();
			
			paymentpage = new PaymentPage();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test(priority = 8)
	public void verifyplaceordertest() throws IOException {
		
		paymentpage = myorderpage.clickonplaceorder();
		
	}
	
	@AfterMethod
	public void teardown() {
		
		driver.quit();
		
	}
	
}

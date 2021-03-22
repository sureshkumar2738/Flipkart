package pom_TestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom_Pages.CartPage;
import pom_Pages.HomePage;
import pom_Pages.LoginPage;
import pom_Pages.MyorderPage;
import pom_Pages.ShoppingPage;
import pom_TestBase.TestBase;

public class CartPage_TestCase extends TestBase{

	LoginPage loginpage;
	
	HomePage homepage;
	
	ShoppingPage shoppingpage;
	
	CartPage cartpage;
	
	MyorderPage myorderpage;
	
	public CartPage_TestCase() throws IOException {
		super();
		
	}
	
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
			
			myorderpage = new MyorderPage();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	@Test(priority = 7)
	public void verifysizecartlnktest() throws IOException {
		
		cartpage.clickonsizechartlnk();
		
		myorderpage = cartpage.clickoncartlnk();
		
	}

	@AfterMethod
	public void teardown() {
		
		driver.quit();
		
	}
	
}

package pom_TestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom_Pages.CartPage;
import pom_Pages.HomePage;
import pom_Pages.LoginPage;
import pom_Pages.ShoppingPage;
import pom_TestBase.TestBase;

public class ShoppingPage_TestCases extends TestBase{

	LoginPage loginpage;
	
	HomePage homepage;
	
	ShoppingPage shoppingpage;
	
	CartPage cartpage;
	
	public ShoppingPage_TestCases() throws IOException {
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
			
			cartpage = new CartPage();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test(priority = 6)
	public void verifyselectshirtlnktest() throws IOException {
		
		cartpage = shoppingpage.clickonselectshirtlnk();
		
	}
	
	@AfterMethod
	public void teardown() {
		
		driver.quit();
		
	}

}

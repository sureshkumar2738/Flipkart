package pom_TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom_Pages.HomePage;
import pom_Pages.LoginPage;
import pom_Pages.ShoppingPage;
import pom_TestBase.TestBase;

public class HomePage_TestCase extends TestBase{

	LoginPage loginpage;
	
	HomePage homepage;
	
	ShoppingPage shoppingpage;
	
	public HomePage_TestCase() throws IOException {
		super();
		
	}
	
	@BeforeMethod
	public void setup() throws IOException {
		
		inilization();
		
		loginpage = new LoginPage();
		
		homepage = loginpage.clickloginbtn(prop.getProperty("email"), prop.getProperty("password"));
		
		homepage = new HomePage();
		
		shoppingpage = new ShoppingPage();
		
	}
	
	@Test(priority = 2)
	public void homepagevalidatepagetitletest() {
		
		String actualpagetitle = homepage.validatepagetitle();
		
		Assert.assertEquals(actualpagetitle, "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
		
	}
	
	@Test(priority = 3)
	public void homepagevalidatelogo() {
		
		boolean flag = homepage.validatelogo();
		
		Assert.assertTrue(flag, "logo is missing");
		
	}

	@Test(priority = 4)
	public void verifysearchboxtest() throws IOException, InterruptedException {
		
		try {
			homepage.clickonsearchbox(prop.getProperty("searchbox"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test(priority = 5)
	public void verifyclotheslnk() throws IOException {
		
		try {
			shoppingpage = homepage.clickonclotheslnk();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@AfterMethod
	public void teardown() {
		
		driver.quit();
		
	}
	
}

package pom_TestCases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom_Pages.HomePage;
import pom_Pages.LoginPage;
import pom_TestBase.TestBase;

public class LoginPage_TestCase extends TestBase{

	LoginPage loginpage;
	
	HomePage homepage;
	
	public LoginPage_TestCase() throws IOException {
		super();
	
	}

	@BeforeMethod
	public void setup() throws IOException {
		
		inilization();
		
		loginpage = new LoginPage();
		
		homepage = new HomePage();
		
	}
	
	@Test(priority = 1)
	public void dologin() throws IOException {
		
	homepage = loginpage.clickloginbtn(prop.getProperty("email"), prop.getProperty("password"));
	
	}
	
	@AfterMethod
	public void teardown() {
		
		driver.quit();
		
	}
	
}

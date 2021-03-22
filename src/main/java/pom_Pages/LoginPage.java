package pom_Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pom_TestBase.TestBase;

public class LoginPage extends TestBase{
		
		@FindBy(xpath = "//input[@class='_2IX_2- VJZDxU']")
		WebElement  email;
		
		@FindBy(xpath = "//input[@type='password']")
		WebElement  password;
		
		@FindBy(xpath = "//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
		WebElement  loginbtn;
		
		public LoginPage() throws IOException {
			
			PageFactory.initElements(driver, this);
			
	    }
		
		public HomePage clickloginbtn(String em,String pwd) throws IOException {
			
			email.click();
			email.sendKeys(em);
			
			password.click();
			password.sendKeys(pwd);
			
			loginbtn.click();
			
			return new HomePage();
			
		}

}

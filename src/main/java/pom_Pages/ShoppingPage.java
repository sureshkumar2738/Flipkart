package pom_Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pom_TestBase.TestBase;

public class ShoppingPage extends TestBase{
	
	@FindBy(xpath = "//a[@title='Solid Men Round Neck Beige T-Shirt']")
	WebElement selectshirtlnk;
	
	public ShoppingPage() throws IOException {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public CartPage clickonselectshirtlnk() throws IOException {
		
	    selectshirtlnk.click();
		
		return new CartPage();
		
	}

}

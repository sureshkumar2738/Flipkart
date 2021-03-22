package pom_Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pom_TestBase.TestBase;

public class CartPage extends TestBase{

	@FindBy(xpath = "//a[normalize-space()='XL']")
	WebElement sizechartlnk;
	
	@FindBy(xpath = "//button[normalize-space()='ADD TO CART']")
	WebElement cartlnk;
	
	public CartPage() throws IOException {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickonsizechartlnk() {
		
		sizechartlnk.click();
		
	}
	
	public MyorderPage clickoncartlnk() throws IOException {
		
		cartlnk.click();
		
		return new MyorderPage();
		
	}

}

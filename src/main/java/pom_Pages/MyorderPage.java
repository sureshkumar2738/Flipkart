package pom_Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pom_TestBase.TestBase;

public class MyorderPage extends TestBase{
		
		@FindBy(xpath = "//span[normalize-space()='Place Order']")
		WebElement placeorder;
		
		public MyorderPage() throws IOException {
	
			PageFactory.initElements(driver, this);
			
		}
		
		public PaymentPage clickonplaceorder() throws IOException {
			
			placeorder.click();
			
			return new PaymentPage();
			
		}

}

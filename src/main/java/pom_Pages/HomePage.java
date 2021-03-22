package pom_Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pom_TestBase.TestBase;

public class HomePage extends TestBase{

	@FindBy(xpath = "//img[@title='Flipkart']")
	WebElement logo;
	
	@FindBy(xpath = "//input[@placeholder='Search for products, brands and more']")
	WebElement searchbox;
	
	@FindBy(xpath = "//div[@class='_37M3Pb']")
	WebElement clotheslnk;
	
	public HomePage() throws IOException {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public String validatepagetitle() {
		
		return driver.getTitle();
		
	}
	
	public boolean validatelogo() {
		
		return logo.isDisplayed();
		
	}
	
	public void clickonsearchbox(String srchbox) throws IOException {
		
		searchbox.click();
		searchbox.sendKeys(srchbox);
		
	}
	
	public ShoppingPage clickonclotheslnk() throws IOException {
		
		clotheslnk.click();
		
		return new ShoppingPage();
		
	}
    
}


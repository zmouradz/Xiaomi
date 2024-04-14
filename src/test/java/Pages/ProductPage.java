package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class ProductPage {
	@FindBy(name="add-to-cart")
	WebElement addToCard;
	
	@FindBy(xpath="/html/body/div[3]/div[1]")
	WebElement btnPanier;
	
	@FindBy(xpath="/html/body/div[3]/div[3]/div[3]/div[2]/div[2]/a[1]")
	WebElement BtnVoirPanier;
	
	public  ProductPage() {
		PageFactory.initElements(Config.driver, this);
		
	}
	
	public void clickOnAddToCard() throws Exception {
		Thread.sleep(3000);
		
		addToCard.click();
	}
	
	public void clickOnPanier() throws Exception {
		Thread.sleep(3000);
		
		btnPanier.click();
	}
	
	public void clickOnVoirPanier() throws Exception {
		Thread.sleep(3000);
		
		BtnVoirPanier.click();
	}
	

}

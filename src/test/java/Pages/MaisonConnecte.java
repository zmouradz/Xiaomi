package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class MaisonConnecte {
	@FindBy(xpath="/html/body/div[1]/div[5]/div/div/div[1]/div/header/h1")
	WebElement vpage;
	
	public MaisonConnecte() {
		PageFactory.initElements(Config.driver, this);
	}
	
	public String verifMessage() {
		String actualMessage = vpage.getText();
		return actualMessage;
		
	}

}

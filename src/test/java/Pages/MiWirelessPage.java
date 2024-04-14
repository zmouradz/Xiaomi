package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class MiWirelessPage {
	@FindBy(xpath="/html/body/div[1]/div[4]/div/div/div/div/div[3]/div[1]/div/div[1]/div/div[1]/h1")
WebElement vpage;
	
	public MiWirelessPage() {
		PageFactory.initElements(Config.driver, this);
	}
	
	public String verifMessage() {
		String actualMessage = vpage.getText();
		return actualMessage;
		
	}

}

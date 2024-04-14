package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class ListeProductPage {
	@FindBy(xpath="/html/body/div[1]/div[3]/section[2]/div/div/div/div/form/div/div[1]/div[1]/div[2]/span[1]/span/a")
	WebElement vpage;
		
		public ListeProductPage() {
			PageFactory.initElements(Config.driver, this);
		}
		
		public String verifMessage() {
			String actualMessage = vpage.getText();
			return actualMessage;
			
		}


}

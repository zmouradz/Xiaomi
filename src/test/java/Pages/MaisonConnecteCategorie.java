package Pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class MaisonConnecteCategorie {
	@FindBy(xpath="/html/body/div[1]/div[5]/div/div/div[1]/div/div[2]/div[4]/form/div/p/span")
	WebElement TriBtn;
	
	@FindBy(xpath="/html/body/div[1]/div[5]/div/div/div[1]/div/div[2]/div[4]/form/div/div/ul/li/label")
	List<WebElement> menuTris;
	
	@FindBy(xpath="/html/body/div[1]/div[5]/div/div/div[1]/div/div[3]/div/div[4]/div")
	WebElement productBtn;
	
		
	
	public MaisonConnecteCategorie() {
		PageFactory.initElements(Config.driver, this);
	}
	
	public void clickOnTriBtn(String menuTriName) throws Exception {
		System.out.println(menuTriName);
		
		TriBtn.click();		
		Thread.sleep(10000);
		try {
		for(WebElement menuTri: menuTris) {
			Config.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			if (menuTri.getText().contains(menuTriName)) {
				Config.actions = new Actions(Config.driver);
				Config.actions.moveToElement(menuTri).perform();
					}			
				}
					
	}catch (Exception e) {
		// TODO: handle exception
	}
	}
	public void clickOnTriSubMenu(String SubMenuTriName) {
		try {
			
		
		for(WebElement submenu: menuTris) {
			System.out.println(submenu.getText());
			if(submenu.getText().contains(SubMenuTriName)) {
				
				submenu.click();
			}
		}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	
		
		
	
	
	public void clickOnProduct() {
	
	Config.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	productBtn.click();
		
	}
}
	

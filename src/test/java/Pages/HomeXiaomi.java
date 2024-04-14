package Pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class HomeXiaomi {
	@FindBy(xpath="/html/body/div[1]/header/div[1]/div/section/div/div[2]/div/div/div/div/nav/ul/li/a")
	List<WebElement> menus;
	
	@FindBy(xpath="/html/body/div[1]/header/div[1]/div/section/div/div[2]/div/div/div/div/nav/ul/li[3]/div/div/div/div/section/div/div/div")
	List<WebElement> submenus;
	
	public HomeXiaomi() {
		PageFactory.initElements(Config.driver, this);
	}
	
	public void mouseHoverOnMenuByName(String MenuName) {
	
		
		for (WebElement menu: menus) {
			System.out.println(menu.getText());
			Config.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			if (menu.getText().contains(MenuName)) {
				Config.actions = new Actions(Config.driver);
				Config.actions.moveToElement(menu).perform();
					}			
				}
			}
		
	
		
	public void clickOnSubMenu(String SubMenuName) {
		try {
			
		
		for(WebElement submenu: submenus) {
			System.out.println(submenu.getText());
			if(submenu.getText().contains(SubMenuName)) {
				
				submenu.click();
			}
		}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
	
		


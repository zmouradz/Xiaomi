package TestSuites;

import java.time.Duration;

import org.junit.Assert;

import Helper.Config;
import Pages.HomeXiaomi;
import Pages.MaisonConnecte;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeXiaomiStepDef {
	@Given("Utilisateur accede a la page dacceuil")
	public void utilisateur_accede_a_la_page_dacceuil() throws Exception {
	   Config.confChrome();
	   Config.maximaseWindow();
	   Config.driver.get("https://mistore.com.tn/");
	}

	
	@When("Utilisateur survole la souris sur le menu {string} de la page dacceuil")
	public void utilisateur_survole_la_souris_sur_le_menu_de_la_page_dacceuil(String menutile) {
		HomeXiaomi home = new HomeXiaomi();
	    home.mouseHoverOnMenuByName(menutile);
	}
	@When("Utilisateur clique sur le submenu {string}")
	public void utilisateur_clique_sur_le_submenu(String submenutitle) {
		HomeXiaomi home = new HomeXiaomi();
		Config.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    home.clickOnSubMenu(submenutitle);
	    
	}

	
	@Then("Utilisateur est dirigé vers la page de submenu {string}")
	public void utilisateur_est_dirigé_vers_la_page_de_submenu(String expectedMeaage) {
		MaisonConnecte page = new MaisonConnecte();
		String actualMessage = page.verifMessage();
		Assert.assertEquals(expectedMeaage, actualMessage);
		
	    
	}


}

package TestSuites;

import java.time.Duration;

import org.junit.Assert;

import Helper.Config;
import Pages.MaisonConnecteCategorie;
import Pages.MiWirelessPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MaisonConnecteStepDef {
	@Given("Utilisateur accede a la page du maison connectée")
	public void utilisateur_accede_a_la_page_du_maison_connectée() throws Exception {
		Config.confChrome();
		   Config.maximaseWindow();
		   Config.driver.get("https://mistore.com.tn/product-category/maison-connectee/");
	}
	
	@When("Utilisateur effectue un tri en cliquant sur {string} and clique sur  {string}")
	public void utilisateur_effectue_un_tri_en_cliquant_sur_and_clique_sur(String TriTitle, String MenuTriTitle) throws Exception {
		MaisonConnecteCategorie home = new MaisonConnecteCategorie();
		Config.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		home.clickOnTriBtn(TriTitle);
		Config.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		home.clickOnTriSubMenu(MenuTriTitle);
	    
	}
	    
	
	@When("Utilisateur clique sur le produit {string}")
	public void utilisateur_clique_sur_le_produit(String ProductTitle) {
		MaisonConnecteCategorie home = new MaisonConnecteCategorie();
		Config.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		home.clickOnProduct();
	}
		

	@Then("Utilisateur est dirigé vers la page de produit {string}")
	public void utilisateur_est_dirigé_vers_la_page_de_produit(String expectedMeaage) {
		MiWirelessPage page = new MiWirelessPage();
			String actualMessage = page.verifMessage();
			Assert.assertEquals(expectedMeaage, actualMessage);
	    
	}

}

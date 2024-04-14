package TestSuites;

import java.time.Duration;

import Helper.Config;
import Pages.ProductPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AjoutProduitStepDef {
	@Given("la page du produit est affichée")
	public void la_page_du_produit_est_affichée() throws Exception {
		Config.confChrome();
		   Config.maximaseWindow();
		   Config.driver.get("https://mistore.com.tn/product/mi-temperature-and-humidity-monitor-pro/");
	}

	@When("Utilisateur clique sur Ajouter au panier {string}")
	public void utilisateur_clique_sur_ajouter_au_panier(String addToCard) throws Exception {
		ProductPage home = new ProductPage();
		Config.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		home.clickOnAddToCard();
	    
	}

	@When("Utilisateur clique sur panier and clique sur voir panier {string}")
	public void utilisateur_clique_sur_panier_and_clique_sur_voir_panier(String voirPanier) throws Exception {
		ProductPage home = new ProductPage();
		Config.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		home.clickOnPanier();
	    
	}

	@Then("Utilisateur Vérifie le produit ajouter a la liste {string}")
	public void utilisateur_vérifie_le_produit_ajouter_a_la_liste(String productList) throws Exception {
		ProductPage home = new ProductPage();
		Config.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		home.clickOnVoirPanier();
	    
	    
	}

}

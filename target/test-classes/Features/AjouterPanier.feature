#Author Mourad
Feature: Ajouter au panier

  Scenario: vérification Ajoutau panier
    Given la page du produit est affichée
    When Utilisateur clique sur Ajouter au panier "add-to-cart"
    And Utilisateur clique sur panier and clique sur voir panier "Voir panier"
    Then Utilisateur Vérifie le produit ajouter a la liste "Mi Temperature and Humidity Monitor Pro"


#Author Mourad
Feature: Maison connectée

Scenario: Acceder a Maison connectée et cliquer sur produit

    Given Utilisateur accede a la page du maison connectée
    When Utilisateur effectue un tri en cliquant sur " Tri par défaut " and clique sur  "Tri par popularité" 
    And Utilisateur clique sur le produit "Mi Wireless Outdoor Security Camera 1080p Set"
    Then Utilisateur est dirigé vers la page de produit "Mi Wireless Outdoor Security Camera 1080p Set"


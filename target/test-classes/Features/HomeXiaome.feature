#Author Mourad
Feature: page dacceuil XIAOMI

  Scenario: Verification des menus de la page dacceuil
    Given Utilisateur accede a la page dacceuil
    When Utilisateur survole la souris sur le menu "Smart Home" de la page dacceuil
    And Utilisateur clique sur le submenu "Maison connectée"
    Then Utilisateur est dirigé vers la page de submenu "Maison Connectée"

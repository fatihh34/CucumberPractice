
@gp1
Feature: ilk feature file
  Background: ortak adimlar
    Given kullanici amazona gider

  Scenario: TC01_amazon_iphone_arama

    When kullanici iphone için arama yapar
    Then sayfa basliginin iphone icerdigini test eder
    #And  sayfayi kapatir

  Scenario: TC02_amazon_selenium_arama

    When kullanici selenium için arama yapar
    Then sayfa basliginin selenium icerdigini test eder
    #And  sayfayi kapatir

  Scenario: TC03_amazon_java_arama

    When kullanici java için arama yapar
    Then sayfa basliginin java icerdigini test eder
    And  sayfayi kapatir
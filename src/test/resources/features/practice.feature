#http://tutorialsninja.com/demo/index.php?route=common/home
Feature: tutorialsninja Search
  Scenario: TC01 kullanici tutorialsninja search'de telefon aratir
    Given kullanici "ninjaUrl" gider
    When kullanici phone sayfasina gider
  #  And kullanici 2 saniye bekler
    Then telefonlarin marka adini alir
   # And kullanici 2 saniye bekler
    Then tum ogeleri sepete ekle
    Then sepete tikla
    Then sepetteki isimleri al
    Then sepetteki ve sayfadaki listeleri karsilastir
    And sayfayi kapatir
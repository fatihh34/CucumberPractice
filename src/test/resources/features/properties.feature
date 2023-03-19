#Amazon sayfasında sql,samsung ve nokia aratip
  #sayfa basliklarini her arama icin test et
  #Aranacak kelimeleri config.propertiesten al@neww

  Feature: Amazonda kelime arama
    Scenario: T01 Amazonda sql samsung ve nokia aramasi
      Given kullanici "amazonUrl" gider
      Then kullanici sql samsung ve nokia aramasi yapar ve basliklari test eder
      And sayfayi kapatir

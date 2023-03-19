Feature: kullanici amazon sayfasinda arama yapar
  Scenario Outline: amazon sayfasinda arama yapar
    Given kullanici "amazon" gider
    Then kullanici "<arananKelime>" için arama yapar
    And sayfa basliginin "<istenenKelime>" icerdigini test eder
    And sayfayi kapatir
    Examples:
      | arananKelime | istenenKelime |
      | java         | java |
      | selenium     | selenium |
      | iphone       | iphone |


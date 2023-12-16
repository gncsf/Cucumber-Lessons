@sOutline
Feature: Amazonda istenilen kelimeleri arama

  Scenario Outline: Amazonda aranilacak kelimeler
    Given kullanici amazon sayfasina gider
    * kullanici "<value>" icin arama yapar
    * kullanici title da "<value>" gormelidir
    * sayfayi kapatir

    Examples:
    | value |
    | mac |
    | windows |
    | linux |

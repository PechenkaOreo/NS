@CertificatePage

Feature: Test "https://certificate.ithillel.ua/" page

  Scenario Outline: Test
    When I open the "https://certificate.ithillel.ua/" page
    And Set the code "<cer>"
    Then Check results
    Examples:
      |cer|
      |1236|
      |198721621|
      |123test|
      |+8979841198498549324|


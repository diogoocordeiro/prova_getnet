Feature: GetNetTest
  Como um usuario
  Quero fazer a busca por superget
  Para acessar a pagina Como acesso a minha conta SuperGet?

  Scenario: Deve pesquisar sobre superget
    Given que acesso o site https://site.getnet.com.br/
    When clico no botao buscar
    And Digito superget e clico no botao procurar
    Then o sistema apresenta o resultado da busca para superget
    And clico na opcao Como acesso a minha conta SuperGet?
    And valido o titulo da modal Como acess a minha conta SuperGet?

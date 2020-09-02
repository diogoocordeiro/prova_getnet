package br.com.getnet.pages;

import org.openqa.selenium.WebDriver;

import br.com.getnet.utils.DSL;

public class SearchPage {
	
	private DSL dsl;
	
	public SearchPage(WebDriver driver) {
		dsl = new DSL(driver);
	}
		
		public void clicarOpComoAcessoMinhaContaSuperGet() {
			dsl.clickByXpath("//a[@class = \"c-search-page__link\" and @href=\"https://site.getnet.com.br/bem-vindo/compra-mobile-jornada/extra-cartao-superget/ \"]");
		}
		
		
		public String validarMensagemComoAcessoMinhaContaSuperGet() {
			return dsl.getTextByXpath("(//div[text()='Como acesso a minha conta SuperGet?'])[2]");
		}
		

}

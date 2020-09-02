package br.com.getnet.pages;

import org.openqa.selenium.WebDriver;

import br.com.getnet.utils.DSL;

public class SearchPage {
	
	private DSL dsl;
	
	public SearchPage(WebDriver driver) {
		dsl = new DSL(driver);
	}
		
		public void clicarOpComoAcessoMinhaContaSuperGet() {
			dsl.clickByXpath("//*[@class = 'c-search-page__link' and @href='https://site.getnet.com.br/duvida/como-acesso-a-minha-conta-superget-2/ ']");
		}
		
		public void aguardarModalComoAcessoMinhaContaSuperGet() {
			dsl.waitPresenceByXpath("//*[@data-modal='11765']");
		}
		
		public void validarTelaResultadoDaBusca() {
			dsl.waitPresenceByXpath("//*[text()='Resultados da busca para: ']");
			dsl.getTextByXpath("//*[text()='Resultados da busca para: ']");
		}
		
		
		public String validarMensagemComoAcessoMinhaContaSuperGet() {
			return dsl.getTextByXpath("(//*[text()='Como acesso a minha conta SuperGet?'])[2]");
		}
		

}

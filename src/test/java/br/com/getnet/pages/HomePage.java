package br.com.getnet.pages;


import org.openqa.selenium.WebDriver;

import br.com.getnet.utils.DSL;

public class HomePage {
	
	private DSL dsl;
	
	public HomePage(WebDriver driver) {
		dsl = new DSL(driver);
	}
	
	public void aguardarTelaHome(){
		dsl.waitElementById("menu-main");
	}
	
	public void clicarBotaoBuscar() {
		dsl.clickById("search-trigger");
	}
	
	public void clicarBotaoProcurar(){
		dsl.clickByXpath("//button[text()='Procurar']");
	}
	
	public void escrever(String id, String texto) {
		dsl.sendKeysById(id, texto);
	}
	



}

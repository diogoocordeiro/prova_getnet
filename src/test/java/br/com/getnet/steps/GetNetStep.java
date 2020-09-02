package br.com.getnet.steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.getnet.pages.HomePage;
import br.com.getnet.pages.SearchPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GetNetStep {
	
	private WebDriver driver;
	private HomePage homePage;
	private SearchPage searchPage;
	static String url = "https://site.getnet.com.br/";
	static String userPath = System.getProperty("user.dir");
	
	@Given("que acesso o site https://site.getnet.com.br/")
	public void que_acesso_o_site_https_site_getnet_com_br() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", userPath + "\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		homePage = new HomePage(driver);
		searchPage = new SearchPage(driver);
		homePage.aguardarTelaHome();
		Thread.sleep(2000);
	}

	@When("clico no botao buscar")
	public void clico_no_botao_buscar() {
		homePage.clicarBotaoBuscar();
	}
	@When("Digito superget e clico no botao procurar")
	public void digito_superget_e_clico_no_botao_procurar() {
		homePage.escrever("global-search-input", "superget");
		homePage.clicarBotaoProcurar();
	}
	@Then("o sistema apresenta o resultado da busca para superget")
	public void o_sistema_apresenta_o_resultado_da_busca_para_superget() {
	    searchPage.validarTelaResultadoDaBusca();
	}
	@Then("clico na opcao Como acesso a minha conta SuperGet?")
	public void clico_na_opcao_como_acesso_a_minha_conta_super_get() {
		searchPage.clicarOpComoAcessoMinhaContaSuperGet();
	}
	@Then("valido o titulo da modal Como acess a minha conta SuperGet?")
	public void valido_o_titulo_da_modal_como_acess_a_minha_conta_super_get() {
		searchPage.aguardarModalComoAcessoMinhaContaSuperGet();
		assertEquals("Como acesso a minha conta SuperGet?", searchPage.validarMensagemComoAcessoMinhaContaSuperGet());
		driver.quit();
	}
	
}

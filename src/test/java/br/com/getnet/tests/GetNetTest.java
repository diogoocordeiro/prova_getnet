package br.com.getnet.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.getnet.pages.HomePage;
import br.com.getnet.pages.SearchPage;

public class GetNetTest {
	
	protected WebDriver driver;
	private HomePage homePage;
	private SearchPage searchPage;
	static String url = "https://site.getnet.com.br/";
	static String userPath = System.getProperty("user.dir");
	
	@Before
	public void inicializar() {
	System.setProperty("webdriver.chrome.driver", userPath + "\\resources\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	homePage = new HomePage(driver);
	searchPage = new SearchPage(driver);
	
	}
	
	  @After 
	  public void encerrar() {
		  driver.quit();
		  driver = null;
	}
	
	@Test
	public void DesafioAutomacao() throws InterruptedException {
		homePage.aguardarTelaHome();
		Thread.sleep(15000);
		homePage.clicarBotaoBuscar();
		homePage.escrever("global-search-input", "superget");
		homePage.clicarBotaoProcurar();
		searchPage.clicarOpComoAcessoMinhaContaSuperGet();
		assertEquals("Como acesso a minha conta SuperGet?", searchPage.validarMensagemComoAcessoMinhaContaSuperGet());
		
	}
}

package br.com.getnet.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DSL {
	
	protected WebDriver driver;
	protected WebElement element;
	protected WebDriverWait wait;
	
	public DSL(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 05);
	}
	
	// Wait By
	
	public void waitElementById(String id) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
	}
	
	public void waitPresenceByXpath(String xpath) {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
	}

	
	// Click By
	
	public void clickById(String id) {
		wait.until(ExpectedConditions.elementToBeClickable(By.id(id))).click();
		
	}
	
	public void clickByXpath(String xpath) {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath))).click();
		
	}
	
	// Send Keys By
	
	public void sendKeysById(String id, String texto) {
		driver.findElement(By.id(id)).sendKeys(texto);
	}
	
	// Get Text By
	
	public String getTextByXpath(String xpath) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	return	driver.findElement(By.xpath(xpath)).getText();
		
	}
	

}

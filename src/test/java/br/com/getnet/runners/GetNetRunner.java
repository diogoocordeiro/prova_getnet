package br.com.getnet.runners;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

public class GetNetRunner {
	
	@RunWith(Cucumber.class)
	@CucumberOptions(features = "resources/GetNetTest.feature")
	public class Runner{
		
	}

}

package br.com.getnet.runners;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/GetNetTest.feature" ,
plugin = {"pretty", "html:target/cucumber-reports"},
monochrome = true,
publish = true)
public class GetNetRunner {
	


}

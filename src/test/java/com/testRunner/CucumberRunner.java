package com.testRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


	@CucumberOptions(
			plugin = { "json:target/cucumber.json" }, // report = main in json format {}
			features = { "./src/main/resources/Online_Banking_Login.feature" }, // feature file location/path
			glue = { "com.generic" }, // step def package name
			tags = "@Smoke" // test type= @Smoke
			)
	public class CucumberRunner extends AbstractTestNGCucumberTests{

		@BeforeTest
		public void setup() {
			
		}
		@Test
		public void test1() {
			
		}
		@AfterTest
		public void tearDown() {
			
		}
		

}

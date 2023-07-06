package com.generic;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
	WebDriver driver;
	@Given("Open browser and  go to application")
	public void open_browser_and_go_to_application() {
     driver =new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("file:///C:/Users/rojin/Downloads/dev_online%20Banking%20monthly_yearly%20statement.html");
	}

	@When("put valid user name")
	public void put_valid_user_name() {
	    driver.findElement(By.xpath("//*[@id='username']")).sendKeys("Batch34");
	    
	}

	@When("put valid password value")
	public void put_valid_password_value() {
	    driver.findElement(By.xpath("//*[@id='password']")).sendKeys("student123@");
	    
	}

	@When("click login button")
	public void click_login_button() {
	   driver.findElement(By.xpath("//*[@type='submit']")).click(); 
	    
	}

	@Then("logout should there")
	public void logout_should_there() {
	    //TestNG ,Junit=Assertion>>=hard and soft Assertion
	    SoftAssert sf = new  SoftAssert();
	    sf.assertTrue(driver.findElement(By.xpath("//*[@id='logoutButton']")).isDisplayed());
	   sf.assertAll();
	}

	@When("put invalid user name")
	public void put_invalid_user_name() {
	    
	    driver.findElement(By.xpath("//*[@id='username']")).sendKeys("SDSDFF");
	}

	@When("put invalid password value")
	public void put_invalid_password_value() {
	    driver.findElement(By.xpath("//*[@id='password']")).sendKeys("234567");
	    
	}

	@Then("alert msg showed Invalid username or password")
	public void alert_msg_showed_invalid_username_or_password() {
	    //Alert Interface
		Alert alert= driver.switchTo().alert();
		 String alertMsg=alert.getText();
	    SoftAssert sf= new SoftAssert();
	    sf.assertEquals(alertMsg,"Invalid username or password");
	}

	@When("put null user")
	public void put_null_user() {
	    driver.findElement(By.xpath("//*[@id='username']")).sendKeys("");
	    
	}

	@When("put null password")
	public void put_null_password() {
	    
	    driver.findElement(By.xpath("//*[@id='password']")).sendKeys("");
	}

	@When("click login")
	public void click_login() {
	    driver.findElement(By.xpath("//*[@type='submit']")).click();
	    
	}

	@Then("alert msg showed invalid username & password")
	public void alert_msg_showed_invalid_username_password() {
	    
	    
	}

	@When("check login")
	public void check_login() {
		  driver.findElement(By.xpath("//*[@type='submit']")).click();
	}

}

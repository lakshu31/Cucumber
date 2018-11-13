package org.test.MavenSample;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPage {
 WebDriver driver;
@Given("^The user is in guru login page$")
public void the_user_is_in_guru_login_page() {
    // Write code here that turns the phrase above into concrete actions
   
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Lakshmi\\Lakshmi31\\MavenSample\\drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/V4/");
	}

@When("^The user enters valid username and password$")
public void the_user_enters_valid_username_and_password() {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.name("uid")).sendKeys("mngr161823");
    driver.findElement(By.name("password")).sendKeys("y1234");
}

@When("^The user clicks the submit button$")
public void the_user_clicks_the_submit_button() {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.name("btnlogin")).click();
    
}

@Then("^the user should be in manager home page$")
public void the_user_should_be_in_manager_home_page() {
    // Write code here that turns the phrase above into concrete actions
    Assert.assertTrue(driver.getCurrentUrl().contains("ManagerHomePage"));
}


}

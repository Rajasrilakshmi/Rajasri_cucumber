package com.stepdefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;


public class AddCustomerSteps {
	static WebDriver driver;
	@Given("user should be in the telecom home page")
	public void user_should_be_in_the_telecom_home_page() {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\Srilakshmi\\Cucumber1\\drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://demo.guru99.com/telecom/");
	}

	@Given("user click on add customer button")
	public void user_click_on_add_customer_button() {
	   driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	}

	@When("user enters all the fields with valid data")
	public void user_enters_all_the_fields_with_valid_data() {
	    driver.findElement(By.xpath("//label[@for='done']")).click();
	    driver.findElement(By.id("fname")).sendKeys("Rajasri");
	    driver.findElement(By.id("lname")).sendKeys("lakshmi");
	    driver.findElement(By.id("email")).sendKeys("rajasri@gmail.com");
	    driver.findElement(By.name("addr")).sendKeys("Chennai");
	    driver.findElement(By.id("telephoneno")).sendKeys("8734568734");
	}
	@When("user enters all the fields with valid data.")
	public void user_enters_all_the_fields_with_valid_data(DataTable custData) {
List<String> datas = custData.asList(String.class);
driver.findElement(By.xpath("//label[@for='done']")).click();
driver.findElement(By.id("fname")).sendKeys(datas.get(0));
driver.findElement(By.id("lname")).sendKeys(datas.get(1));
driver.findElement(By.id("email")).sendKeys(datas.get(2));
driver.findElement(By.name("addr")).sendKeys(datas.get(3));
driver.findElement(By.id("telephoneno")).sendKeys(datas.get(4));
	}

	@When("user clicks on submit button")
	public void user_clicks_on_submit_button() {
	 driver.findElement(By.xpath("//input[@value='Submit']")).click();
	}

	@Then("user should be displayed customer id is generated")
	public void user_should_be_displayed_customer_id_is_generated() {
	 Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
	}


}

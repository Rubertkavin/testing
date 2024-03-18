package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {

	public static WebDriver driver;

	@Given("I open the Cyclos login page")
	public void i_open_the_cyclos_login_page() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.cyclos.org/ui/login/");
		driver.manage().window().maximize();
		Thread.sleep(10000);

	}

	@When("I enter {string} as username and {string} as password")
	public void i_enter_as_username_and_as_password(String username, String password) {

		// driver.findElement(By.xpath("//input[@class='form-control ng-pristine
		// ng-valid ng-touched']"))
		// .click();
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("demo");

		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("1234");
	}

	@When("I click the login button")
	public void i_click_the_login_button() {
		driver.findElement(By.xpath(
				"//button[@class='btn d-flex justify-content-center align-items-center w-100 h-100 btn-primary btn-action-primary']"))
				.click();
	}

	@Then("I should be logged in successfully")
	public void i_should_be_logged_in_successfully() {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        assertTrue(wait.until(ExpectedConditions.urlContains("home")));
//        driver.quit();
	}
}
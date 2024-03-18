package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PaymentToUser {
	public static WebDriver driver;
	

	@Given("I open Cyclos login page")
	public void i_open_cyclos_login_page() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.cyclos.org/ui/login/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("demo");

		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("1234");
		driver.findElement(By.xpath(
				"//button[@class='btn d-flex justify-content-center align-items-center w-100 h-100 btn-primary btn-action-primary']"))
				.click();
	}

	@When("I click on Pay User")
	public void i_click_on_pay_user() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[contains(text(),'Pay user')]")).click();
	}

	@When("I click on Contact list from To User Field")
	public void i_click_on_contact_list_from_to_user_field() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@type ='button' and @class='btn btn-icon ml-2']")).click();
	}

	@When("I select the BraBen from the contact list")
	public void i_select_the_bra_ben_from_the_contact_list() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[contains(text(), 'BraBen')]")).click();
	}

	@Then("I enter payment Amout {string}")
	public void i_enter_payment_amout(String string) throws InterruptedException {
		Thread.sleep(15000);
		driver.findElement(By.xpath("//input[@id ='id_3' and @type='tel']")).sendKeys("100");

	}

	@Then("I click on Next Button")
	public void i_click_on_next_button() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(
				By.xpath("//*[@class='btn d-flex justify-content-center align-items-center w-100 h-100 btn-primary']"))
				.click();
	}

	@Then("I click on Confirm button from the payment confirmation page")
	public void i_click_on_confirm_button_from_the_payment_confirmation_page() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath(
				"//button[@class='btn d-flex justify-content-center align-items-center w-100 h-100 btn-primary']"))
				.click();

	}

}

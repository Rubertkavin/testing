package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BuyVoucher {
	public static WebDriver driver;

	@Given("I open cyclos login page")
	public void i_open_cyclos_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.cyclos.org/ui/login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("demo");

		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("1234");
		driver.findElement(By.xpath(
				"//button[@class='btn d-flex justify-content-center align-items-center w-100 h-100 btn-primary btn-action-primary']"))
				.click();
	}

	@When("I click on {string}")
	public void i_click_on(String MyVoucher) {
		driver.findElement(By.xpath("//div[contains(text(),'My vouchers')]")).click();

	}

	@Then("I Click on {string} from the market place page")
	public void i_click_on_from_the_market_place_page(String BuyVoucher) {
		driver.findElement(By.xpath("//div[contains(text(),'Buy vouchers')]")).click();

	}

	@Then("I select {string}")
	public void i_select(String cinemavoucher) {
		driver.findElement(By.xpath("//a[contains(text(),'Cinema voucher')]")).click();

	}

	@Then("I enter number of vouchers as {string}")
	public void i_enter_number_of_vouchers_as(String two) {
		// delete the default value from the text field
		driver.findElement(By.xpath("//input[@type='number']")).clear();
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("2");

	}

	@Then("I enter Amout per voucher as {string}")
	public void i_enter_amout_per_voucher_as(String one) {
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("1");

	}

	@Then("I select Usage as {string}")
	public void i_select_usage_as(String Thisvoucherisagift) {
		WebDriverWait wait= new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(), ' This voucher is a gift')]"))).click();
	}

	@When("I click on {string} button")
	public void i_click_on_button(String Next) {
		driver.findElement(By.xpath(
				"//button[@class='btn d-flex justify-content-center align-items-center w-100 h-100 btn-primary']"))
				.click();

	}

	@Then("I clik on {string}")
	public void i_clik_on(String confirm) {
		driver.findElement(By.xpath("//span[contains(text(),'Confirm')]")).click();
				
	}

}

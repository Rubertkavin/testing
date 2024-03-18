package com.stepdefinition;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PlaceAdvertisement {
	public static WebDriver driver;

	@Given("I open the Cyclos dashboard page")
	public void i_open_the_cyclos_home_page() throws InterruptedException {
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

	@When("I click on Place AD")
	public void i_click_on_place_ad() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Place ad')]")))
				.click();

	}

	@Then("I upload the Image")
	public void i_upload_the_image() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Upload a new image')]")));

		for (String windowHandle : driver.getWindowHandles()) {
			String mainWindowHandle = driver.getWindowHandle();
			if (!windowHandle.equals(mainWindowHandle)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}

		WebElement fileInput = driver.findElement(By.xpath("//input[@type='file']"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		fileInput.sendKeys("C:\\Users\\10151\\Downloads\\Watermelon.jpg");

	}

	@Then("I enter the Title")
	public void i_enter_the_title() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text']"))).sendKeys("Mr");

	}

	@Then("I select Backing from the category dropdown field")
	public void i_select_backing_from_the_category_dropdown_field() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//button[@id='id_4']")).click();
		driver.findElement(By.xpath("//a[@id='id_4_7762070814178011711']")).click();

	}

	@Then("I enter the Price amount")
	public void i_enter_the_price_amount() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("100");

	}

	@Then("I enter publication period date")
	public void i_enter_publication_period_date() {
		WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='id_8']"))).sendKeys("1052021");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id='id_9']")).sendKeys("2122023");

	}

	@When("I select set promotional period checkbox")

	public void i_select_set_promotional_period_checkbox() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement locator = driver.findElement(By.xpath("//*[@id=\"id_10\"]"));
		js.executeScript("arguments[0].scrollIntoView();", locator);
		WebDriverWait wait3 = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='id_9']"))).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//input[@id='id_9']")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//input[@id='id_9']")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//input[@id='id_9']")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//input[@id='id_10']")).sendKeys(Keys.ENTER);

	}

	@Then("I enter promotional period date")
	public void i_enter_promotional_period_date() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id='id_12']")).sendKeys("01022023");
		driver.findElement(By.xpath("//input[@id='id_13']")).sendKeys("01202023");
	}

	@Then("I enter promotional price")
	public void i_enter_promotional_price() {

		driver.findElement(By.xpath("//input[@id='id_11']")).sendKeys("100");

	}

	@Then("I enter the description")
	public void i_enter_the_description() {
		driver.findElement(By.xpath("//div[@id='id_3_editor']")).sendKeys("Test");
	}

	@Then("I select Home from the address map dropdown field")
	public void i_select_home_from_the_address_map_dropdown_field() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement home = driver.findElement(By.xpath("//button[@id='id_6']"));
		js.executeScript("arguments[0].scrollIntoView();", home);
		driver.findElement(By.xpath("//button[@id='id_6']")).click();
		driver.findElement(By.xpath("//*[contains(text(),'home')]")).click();

	}

	@Then("I click on save button")
	public void i_click_on_save_button() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement save = driver.findElement(By.xpath("//button[@class='btn d-flex justify-content-center align-items-center w-100 h-100 btn-primary']"));
		js.executeScript("arguments[0].scrollIntoView();", save);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//button[@class='btn d-flex justify-content-center align-items-center w-100 h-100 btn-primary']")))
				.click();
	}

}

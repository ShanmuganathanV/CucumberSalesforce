package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefLogin {
	WebDriver driver;
	@Given("the user is on the salesforce login page")
	public void the_user_is_on_the_salesforce_login_page() {
		driver= new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("the user enter valid credentails for username {string}")
	public void the_user_enter_valid_credentails_for_username(String username) {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
	}

	@When("the user enter password as {string}")
	public void the_user_enter_password_as(String pwd) {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
	}

	@Then("the user should on click on the login button")
	public void the_user_should_on_click_on_the_login_button() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		Thread.sleep(3000);
	}

	@Then("user should click on the toggle menu")
	public void user_should_click_on_the_toggle_menu() {
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	}

	@Then("user should click on view all option")
	public void user_should_click_on_view_all_option() throws InterruptedException {
		driver.findElement(By.xpath("//button[@aria-label='View All Applications']")).click();
		Thread.sleep(3000);
	}

	@Then("userclick on Sales option")
	public void userclick_on_sales_option() throws InterruptedException {
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(5000);
	}

	@Then("userclick on opportunities")
	public void userclick_on_opportunities() {
		WebElement clickableElement1 = driver.findElement(By.xpath("//a/span[text()='Opportunities']"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", clickableElement1);
	}

	@Then("user should clicking New option")
	public void user_should_clicking_new_option() throws InterruptedException {
		driver.findElement(By.xpath("//a/div[text()='New']")).click();
		Thread.sleep(2000);
	}

	@Then("user clicks on opportunity name {string}")
	public void user_clicks_on_opportunity_name(String OpportunityName) throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(OpportunityName);
		Thread.sleep(3000);
	}

	@Then("user enters the amount as {string}")
	public void user_enters_the_amount_as(String Amount) throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='Amount']")).sendKeys(Amount);
		Thread.sleep(3000);
	}

	@Then("user should close the date as today")
	public void user_should_close_the_date_as_today() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		driver.findElement(By.xpath("//button[text()='Today']")).click();
		Thread.sleep(3000);
	}

	@Then("user should click on Stage optionselect need analysis")
	public void user_should_click_on_stage_optionselect_need_analysis() throws InterruptedException {
		driver.findElement(By.xpath("//button[@aria-label='Stage']")).click();
		driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
		Thread.sleep(3000);
	}

	@Then("user should click on the save button")
	public void user_should_click_on_the_save_button() throws InterruptedException {
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		Thread.sleep(8000);
	    
	}

	@Then("user should verify the name")
	public void user_should_verify_the_name() {
		String db = driver.findElement(By.xpath("//*[@slot='primaryField']")).getText();
		if (db.contains("Shanmuganathan")) {
			System.out.println("The Account is created");
		} else {
			System.out.println("The Account is not created");
		}
		driver.close();
	    
	}

	

}

package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpenGoogleDefinitions {

	WebDriver driver;
	@Given("User opens google.co.in")
	public void user_opens_google_co_in() {
	    // Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
		driver.get("https://google.co.in");
		driver.manage().window().maximize();

	}

	@When("User enters {string} in search field")
	public void user_enters_in_search_field(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.name("q")).sendKeys(string);
	}

	@When("enters the return key")
	public void enters_the_return_key() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("User should navigate to the ANZ webiste page")
	public void user_should_navigate_to_the_anz_webiste_page() {
	    // Write code here that turns the phrase above into concrete actions
	   boolean status = driver.findElement(By.partialLinkText("ANZ")).isDisplayed();
	   if(status) {
		   System.out.println("ANZ page is Open successfully");
	   }
	}
	
}

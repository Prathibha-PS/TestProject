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
		System.setProperty("webdriver.chrome.driver", "C:\\Prathi_p\\Selenium DRIVERS\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://google.co.in");
		driver.manage().window().maximize();

	}

	@When("User enters {string} in search field")
	public void user_enters_in_search_field(String string) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.name("q")).sendKeys(string);
	    Thread.sleep(5000);
	}

	@When("enters the return key")
	public void enters_the_return_key() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("User should navigate to the ANZ webiste page")
	public void user_should_navigate_to_the_anz_webiste_page() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	   boolean status = driver.findElement(By.partialLinkText("ANZ")).isDisplayed();
	   if(status) {
		   System.out.println("ANZ page is Open successfully");
		   Thread.sleep(5000);
		   driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[1]/div/a/h3")).click();
		   driver.findElement(By.xpath("//*[@id=\"main-container\"]/div[1]/div/div/div[2]/div/div/div[2]/div/div/p[1]/a")).click();
		   driver.findElement(By.xpath("//*[@id=\"content-anzcomau-en-personal-bank-accounts-navigation-anz_hero_par-start\"]/div[2]/div[2]/div/div[2]/div/div/div/div[1]/div/p[2]")).getText();
	   }
	}
	
}

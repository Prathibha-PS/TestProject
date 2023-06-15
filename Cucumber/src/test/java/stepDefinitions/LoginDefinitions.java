package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDefinitions {
	WebDriver driver;
	
	@Given("User is on Login page")
	public void user_is_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Prathi_p\\Selenium DRIVERS\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
	    System.out.println("Browser launched successfully");
	    driver.get("http://vlty2077sl.redecorp.br:20100/AmdocsOSS/Portal/login.html");
	    System.out.println("Amdocs Portal Login page has opened");

	}
	@When("User enters valid Username and Password")
	public void user_enters_valid_username_and_password() {
	    
		driver.findElement(By.xpath("//input[@id='view40']")).sendKeys("AFFSuper");
		driver.findElement(By.xpath("//input[@id='view42']")).sendKeys("AFFSuper123");
		
	}
	@When("Clicks on Login Button")
	public void clicks_on_login_button() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//span[normalize-space()='Entrar']")).click();
		System.out.println("Login successful");
		Thread.sleep(9000);
		
	}
	@Then("User should navigate to Home Page")
	public void user_should_navigate_to_home_page() throws Exception {
		boolean status = driver.findElement(By.xpath("//div[@id='1']")).isDisplayed(); //*[@id='ossui-mainframe-header-application']
		if(status) {
			   System.out.println("Navigated to Home Page");
			   
		driver.findElement(By.xpath("//div[@id='2']")).click(); //clicks Orders tab
		Thread.sleep(90000);
		System.out.println("Sleep time is over");
		
		WebElement frameElement = driver.findElement(By.id("2frame"));
		driver.switchTo().frame(frameElement);
		System.out.println("Switch frame is successful");
		
		driver.findElement(By.xpath("//*[@id='grid']/div/div/div/div/div/div/div/div[contains(text(),'Número da ordem')]")).click();  
		driver.findElement(By.xpath("//*[@id='grid']/div/div/div/div/div/div/div/div/div/input")).sendKeys("1135801125");
		Thread.sleep(20000);
		System.out.println("Order Number is entered in textfield");
		
		driver.findElement(By.xpath("//*[@id='grid']/div/div/div/div/div/table/tbody/tr/td/div/div[contains(text(),'Product Order Management')]")).click();
		Thread.sleep(60000);
        System.out.println("Work Order Flow is open");
		
	    driver.findElement(By.xpath("//button[@class='pndFullViewButton']")).click(); ///html/body/div[1]/div/div/div[2]/div[3]/div[2]/div/div/div[6]/div/button
		Thread.sleep(70000);
        System.out.println("Maximize Done");
        System.out.println("Order Flow is In Progress....");


	}
	}

}

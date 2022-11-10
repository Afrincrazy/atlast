package stepdefiniton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class last {
	WebDriver driver;
	@Given("^user is in the prudential profile creation page page$")
	public void user_is_in_the_prudential_profile_creation_page_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://www.prudential.com/financial-wellness/register");    
	}
	
	@When("^user enters firstname as \"([^\"]*)\"$")
	public void user_enters_firstname_as(String arg1) throws Throwable {
		driver.findElement(By.id ("firstName")).sendKeys ("anbu");
	}
	
	@When("^user enters lastname as \"([^\"]*)\"$")
	public void user_enters_lastname_as(String arg1) throws Throwable {
		driver.findElement(By.id ("lastName")).sendKeys ("nesan");
	}
	
	@Then("^the user enters email address as \"([^\"]*)\"$")
	public void the_user_enters_email_address_as(String arg1) throws Throwable {
		driver.findElement(By.id ("userEmail")).sendKeys ("anbunesan1996@gmail.com");
	}
	
	@Then("^the user enters confirm email address as \"([^\"]*)\"$")
	public void the_user_enters_confirm_email_address_as(String arg1) throws Throwable {
		driver.findElement(By.id ("emailCheck")).sendKeys ("anbunesan1996@gmail.com");
	}
	
	@When("^user enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String arg1) throws Throwable {
		driver.findElement(By.id ("passwordRegistration")).sendKeys ("N2482005");
 
	}
	
	@When("^the user enters confirm password as \"([^\"]*)\"$")
	public void the_user_enters_confirm_password_as(String arg1) throws Throwable {
		driver.findElement(By.id ("passwordCheck")).sendKeys ("N2482005");
	}
	
	@Then("^user should be navigated to page displaying thank you for creating profile$")
	public void user_should_be_navigated_to_page_displaying_thank_you_for_creating_profile() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"appMain\"]/ng-component/div/registration/div/div/div/form/button")).click();
	}
	
}

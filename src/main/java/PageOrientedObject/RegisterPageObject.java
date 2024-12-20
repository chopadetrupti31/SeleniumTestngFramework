package PageOrientedObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPageObject {

	public WebDriver driver;

	private By Firstname = By.xpath("//input[@name='firstname']");

	private By email = By.xpath("//input[@name='email']");

	private By Lastname = By.xpath("//input[@name='lastname']");

	private By Telephone = By.xpath("//input[@id='input-telephone']");

	private By Password = By.xpath("//input[@id='input-password']");

	private By ConfirmPassword = By.xpath("//input[@id='input-confirm']");

	private By Checkbox = By.xpath("//input[@type='checkbox']");
	
	private By Continue = By.xpath("//input[@type='submit']");
	
	private By ExpecctedResult =By.xpath("//h1[text()='Your Account Has Been Created!']");
	
	private By FirstnameExpecctedResult=By.xpath("//div[text()='First Name must be between 1 and 32 characters!']");
	
	private By LasttnameExpecctedResult=By.xpath("//div[text()='Last Name must be between 1 and 32 characters!']");
	
	private By EmailExpecctedResult=By.xpath("//div[text()='E-Mail Address does not appear to be valid!']");
	
	private By TelephoneExpecctedResult=By.xpath("//div[text()='Telephone must be between 3 and 32 characters!']");
	
	private By PasswordExpecctedResut=By.xpath("//div[text()='Password must be between 4 and 20 characters!']");
	
	
	
	
	
	
	public RegisterPageObject(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;

	}

	public WebElement Firstname() {

		return driver.findElement(Firstname);
	}

	public WebElement enterEmail() {
		return driver.findElement(email);

	}

	public WebElement Lastname() {

		return driver.findElement(Lastname);
	}

	public WebElement Telephone() {

		return driver.findElement(Telephone);
	}

	public WebElement Password() {

		return driver.findElement(Password);
	}

	public WebElement ConfirmPassword() {

		return driver.findElement(ConfirmPassword);
	}

	public WebElement Checkbox() {

		return driver.findElement(Checkbox);
	}

	public WebElement Continue() {

		return driver.findElement(Continue);
	}
	
	public WebElement  ExpecctedRResult() {
	
		return driver.findElement( ExpecctedResult);
	}


	public WebElement FirstnameExpecctedRResult() {
		
		return driver.findElement( FirstnameExpecctedResult);
	}

	public WebElement  LasttnameExpecctedRResult() {
		
		return driver.findElement( LasttnameExpecctedResult);
	}
	
	public WebElement  EmailExpecctedRResult() {
	
		return driver.findElement( EmailExpecctedResult);
	}
	
	public WebElement  TelephoneExpecctedRResult() {
	
		return driver.findElement( TelephoneExpecctedResult);
	}
	
	public WebElement  PasswordExpecctedResult() {
	
		return driver.findElement( PasswordExpecctedResut);
	}
}

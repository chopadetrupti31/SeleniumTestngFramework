package PageOrientedObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {
	public WebDriver driver;

	private By EmailAdress = By.xpath("//input[@name='email']");
	private By Password = By.xpath("//input[@name='password']");
	private By Login = By.xpath("//input[@value='Login']");
	private By LoggedInSuccessfully = By.xpath("//a[text()='Account']");

	public LoginPageObject(WebDriver driver) {
		// TODO Auto-generated constructor stub
	this.driver=driver;
	}

	
	

	public WebElement EnterEmailAdress() {
		return driver.findElement(EmailAdress);
	}

	public WebElement EnterPassWord() {
		return driver.findElement(Password);

	}

	public WebElement ClickOnLogin() {
		return driver.findElement(Login);
	}

	public WebElement loginSuccess() {
		return driver.findElement(LoggedInSuccessfully);
	}
}

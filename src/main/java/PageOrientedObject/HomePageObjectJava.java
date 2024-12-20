package PageOrientedObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class HomePageObjectJava {

	public WebDriver driver;
	private By MyAccount = By.xpath("//a[@title='My Account']");

	private By Register = By.xpath("//a[text()='Register']");

	private By Login = By.xpath("//a[text()='Login']");

//Create Constructor
	public HomePageObjectJava(WebDriver driver) {
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}

	public WebElement ClickMyAccount() {

		return driver.findElement(MyAccount);
	}

	public WebElement ClickRegister() {

		return driver.findElement(Register);
	}

	public WebElement ClickOnLogin() {

		return driver.findElement(Login);

	}

}
package Resources;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;


public class CommonMethod {
	
	
	public static void HandleAssertion(String ActualResult,String ExpectedResult) {
		
		SoftAssert Sa= new SoftAssert();
		Sa.assertEquals(ActualResult, ExpectedResult);
		
		Sa.assertAll();
		
		
	}

	
	public static void HandleExpliciteWait(WebDriver driver,int time, WebElement locator) {
	
	WebDriverWait Wait = new WebDriverWait(driver,Duration.ofSeconds(time));
	
	Wait.until(ExpectedConditions.visibilityOf(locator));
}
}

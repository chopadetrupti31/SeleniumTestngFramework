package TestCases;

import org.testng.annotations.Test;

import PageOrientedObject.HomePageObjectJava;
import PageOrientedObject.LoginPageObject;
import Resources.BaseClassJava;
import Resources.Constant;

public class LoginPageTestCase extends BaseClassJava
 {
	@Test
	public void VerifyLoginWithValidData() {
		
		HomePageObjectJava hpo= new HomePageObjectJava(driver);
		hpo.ClickMyAccount().click();
		hpo.ClickOnLogin().click();
		
		LoginPageObject Rpo = new LoginPageObject (driver);
		
		Rpo.EnterEmailAdress().sendKeys(emailAdress);
		Rpo.EnterPassWord().sendKeys(Constant.Password);
		Rpo.ClickOnLogin().click();
		
		
		
		
	
	
	
	
	}

}

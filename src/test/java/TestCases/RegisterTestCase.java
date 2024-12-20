package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageOrientedObject.HomePageObjectJava;
import PageOrientedObject.RegisterPageObject;
import Resources.BaseClassJava;
import Resources.CommonMethod;
import Resources.Constant;

public class RegisterTestCase extends BaseClassJava {

	@Test
	public void VerifyRegistrationwithValidDtat() throws IOException {

		HomePageObjectJava hpo = new HomePageObjectJava(driver);

		hpo.ClickMyAccount().click();

		hpo.ClickRegister().click();

		RegisterPageObject rpo = new RegisterPageObject(driver);
CommonMethod.HandleExpliciteWait(driver, 10, rpo.Firstname());
		rpo.Firstname().sendKeys(Constant.firstname);
		rpo.Lastname().sendKeys(Constant.Lastname);
		rpo.enterEmail().sendKeys(emailAdress);
		rpo.Telephone().sendKeys(Constant.Telephone);
		rpo.Password().sendKeys(Constant.Password);
		rpo.ConfirmPassword().sendKeys(Constant.ConfirmPassword);
		rpo.Checkbox().click();
		rpo.Continue().click();
		rpo.ExpecctedRResult();

		String ActualResult = "Your Account Has Been Created!";
		String ExpectedResult = rpo.ExpecctedRResult().getText();
	CommonMethod.HandleAssertion(ActualResult, ExpectedResult);
		
	}
@Test
public void VerifyRegistrationwithBlankData() {
	HomePageObjectJava hpo = new HomePageObjectJava(driver);

	hpo.ClickMyAccount().click();

	hpo.ClickRegister().click();

	RegisterPageObject rpo = new RegisterPageObject(driver);
	
	rpo.Continue().click();
	
	String FirstnameActualResult =Constant.FirstnameActualResult;
	String FirstnameExpecctedResult=rpo.FirstnameExpecctedRResult().getText();
	CommonMethod.HandleAssertion(FirstnameActualResult, FirstnameExpecctedResult);
	
	String LastnameActualResult =Constant.LastnameActualResult;
	String lastnameExpecctedResult=rpo.LasttnameExpecctedRResult().getText();
	CommonMethod.HandleAssertion(LastnameActualResult, lastnameExpecctedResult);
	
	
	String EmailActualResult =Constant.EmailActualResult;
	String EmailExpecctedResult=rpo.EmailExpecctedRResult().getText();
	CommonMethod.HandleAssertion(EmailActualResult, EmailExpecctedResult);
	
	
	
	String TelephoneActualResult =Constant.TelephoneActualResult;
	String TelephoneExpecctedResult=rpo.TelephoneExpecctedRResult().getText();
	CommonMethod.HandleAssertion(TelephoneActualResult, TelephoneExpecctedResult);
	
	
	String  PasswordActualResult =Constant.PasswordActualResult;
	String PasswordExpecctedResut=rpo.PasswordExpecctedResult().getText();
	CommonMethod.HandleAssertion(PasswordActualResult, PasswordExpecctedResut);

	
	
	
	

}

}
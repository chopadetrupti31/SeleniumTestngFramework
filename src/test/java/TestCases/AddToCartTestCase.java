package TestCases;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AddToCartTestCase {

	@Test
	public void VerifyCartAmmount() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iPhone");

		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();

		String iPhoneCost = driver.findElement(By.xpath("//h4//a[text()='iPhone']/following::p[@class='price']"))
				.getText();

		System.out.println(iPhoneCost);

		String[] iPhoneArray = iPhoneCost.split(" ");

		System.out.println(Arrays.toString(iPhoneArray));
		String iPhonePrice = iPhoneArray[0];
		// System.out.println(iPhonePrice);
		String FinaliPhonePrice = iPhonePrice.replaceAll("[^\\d.]", "");
		// System.out.println(FinaliPhonePrice);

		double iPhonePriceDouble = Double.parseDouble(FinaliPhonePrice);
		System.out.println(iPhonePriceDouble);

		driver.findElement(By.xpath("//h4//a[text()='iPhone']/following::i[1]")).click();

		driver.findElement(By.xpath("//input[@type='text']")).clear();

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Samsung");
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();

		String SamsungCost = driver
				.findElement(By.xpath("//h4//a[text()='Samsung Galaxy Tab 10.1']/following::p[@class='price']"))
				.getText();

		System.out.println(SamsungCost);

		String[] SamsungArray = SamsungCost.split(" ");

		System.out.println(Arrays.toString(SamsungArray));
		String SamsungPrice = SamsungArray[0];
		// System.out.println(SamsungPrice);
		String FinaliSamsungPrice = SamsungPrice.replaceAll("[^\\d.]", "");
		// System.out.println(FinaliSamsungPrice);

		double SamsungPriceDouble = Double.parseDouble(FinaliSamsungPrice);
		System.out.println(SamsungPriceDouble);

		driver.findElement(By.xpath("//h4//a[text()='Samsung Galaxy Tab 10.1']/following::i[1]")).click();

		double AdditionCartPrice = (iPhonePriceDouble + SamsungPriceDouble);
		System.out.println(AdditionCartPrice);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@data-toggle='dropdown'])[2]")).click();

		String CartAmount = driver.findElement(By.xpath("(//td[@class='text-right'])[12]")).getText();
		System.out.println(CartAmount);

		String FinalCartAmount = CartAmount.replaceAll("[^\\d.]", "");
		double CartAmountdouble = Double.parseDouble(FinalCartAmount);

		System.out.println(CartAmountdouble);

		Double AdditonOfproductPrice = AdditionCartPrice;
		Double FinalCartPrice = CartAmountdouble;

		if (AdditonOfproductPrice.equals(FinalCartPrice)) {
			System.out.println("The Cart values are equal.");
		} else {
			System.out.println("The cart values are not equal.");
		}
	}

}

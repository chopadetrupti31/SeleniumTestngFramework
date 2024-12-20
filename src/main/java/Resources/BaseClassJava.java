package Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClassJava {

	public static WebDriver driver;
	public Properties pop;

	public static String emailAdress = GenerateRandomEmailid();

	public void initiliseDriver() throws IOException {

		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");

		pop = new Properties();
		pop.load(fis);

		String Browsername = pop.getProperty("Browser");

		if (Browsername.equalsIgnoreCase("Chrome")) {

			driver = new ChromeDriver();

		} else if (Browsername.equalsIgnoreCase("Firefox")) {

			driver = new FirefoxDriver();

		}

		else if (Browsername.equalsIgnoreCase("Edge")) {

			driver = new EdgeDriver();
		}

		else {
			System.out.println("Please choose correct Driver");

		}
	}

	public static String GenerateRandomEmailid() {
		return "test" + System.currentTimeMillis() + "@gmail.com";

	}

	@BeforeMethod
	public void Browserlaunch() throws IOException {
		initiliseDriver();
		String URL = pop.getProperty("url");
		driver.get(URL);

	}

	@AfterMethod

	public void BrowserClose() throws IOException {
		// driver.quit();

	}


	@BeforeSuite
	 public void setupReport() {
	  
	       ExtentReportManager.setup();
	 }
	
	 
	 
	 @AfterSuite
	 public void endReporttest() {
		 ExtentReportManager.endReport();
	 }
	
	  
		// To take the screenshot and store in one folder-
		public static String screenShot(WebDriver driver, String filename) {
			String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
			// 20241218083700

			File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			String destination = System.getProperty("user.dir") + "\\Screenshots\\" + filename + "_" + date + ".png";
			try { // VerifyRresgiertaionWithValiData_20241218083700.png
				FileUtils.copyFile(source, new File(destination));
			} catch (Exception e) {
				e.getMessage();
			}
			return destination;
		} 

	
}
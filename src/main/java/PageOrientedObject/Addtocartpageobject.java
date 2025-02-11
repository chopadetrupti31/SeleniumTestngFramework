package PageOrientedObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Addtocartpageobject {
	public WebDriver driver;
	
	
	private By ClickonSearch=By.xpath("\"//input[@type='text']\"");
	
	
	
	public Addtocartpageobject(WebDriver driver) {
		// TODO Auto-generated constructor stub
	this.driver=driver;
	}



	public WebElement ClickonSearch(){
		return driver.findElement(ClickonSearch);
		
		
	}

}

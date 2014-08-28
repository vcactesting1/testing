package Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Methods {
	
	public static WebDriver driver;

	public static void InputByID(String ID, String context){
		WebElement txt = driver.findElement(By.id(ID));
		txt.sendKeys(context);
	}
	
	public static void ClickByID(String ID){
		WebElement contorl = driver.findElement(By.id(ID));
		contorl.click();
	}
	
	public static void ClickByXpath(String Xpath){
		WebElement contorl = driver.findElement(By.xpath(Xpath));
		contorl.click();
	}
	
	public static WebElement WaitByXpath(final String Xpath){
		WebElement contorl = (new WebDriverWait (driver,10)).until(new ExpectedCondition<WebElement>() {
			@Override
			public WebElement apply(WebDriver d){
				return d.findElement(By.xpath(Xpath));
			}
		});
		return contorl;
	}
}

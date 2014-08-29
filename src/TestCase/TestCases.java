package TestCase;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import com.thoughtworks.selenium.Selenium;

import Method.Methods;

public class TestCases {

	@Parameters({"VCACUrl","UserName","Password"})
	@BeforeSuite
	public void OpenBrowser(String VCACUrl, String UserName, String Password){
		Methods.driver = new FirefoxDriver();
		Methods.driver.get(VCACUrl);
		Methods.driver.manage().window().maximize();
		System.out.println("Input username");
		Methods.InputByID("username", UserName);
		System.out.println("Input username");
		Methods.InputByID("password", Password);
		System.out.println("Click Login button");
		Methods.ClickByID("submit");
	}

	@Test
	public void Case3008() {
		
	}
	

	@Test
	public void Case3010() {
		
	}

	@Test
	public void Case32() {
		
	}

	
	public void Case3014() {

		
	}

	public void Case3() {
	
	}

	@Test
	public void Case3015() {
	
	}


	@Test
	public void Case3017() {
	
	}
	

	
	@Test
	public void Case3016() {
	
	}
	
	@Test
	public void Case3019() {
	
	}
	
	@Test
	public void Case3020() {
	
	}

	@Test
	public void Case3021() {
	
	}
	
	@Test
	public void Case3022() {
	
	}
	
	@Test
	public void Case3024() {
	
	}
	
	@Test
	public void Case3025() {
	
	}
	
	@AfterSuite
	public void CloseBrowser(){
//		Methods.driver.quit();
	}
}

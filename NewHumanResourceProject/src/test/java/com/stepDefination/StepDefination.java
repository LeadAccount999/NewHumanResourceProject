package com.stepDefination;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {
WebDriver driver;


@Given("Open the firefox browser")
public void open_the_firefox_browser() {
	
	driver = new FirefoxDriver();
} 

/*
@Before
public void setup() {
	
	driver = new FirefoxDriver();
}

@After
public void close() {
	
	driver.close();
}

@BeforeStep
public void beforeStep() {
	
	System.out.println("Run before each step in the scenario");
}

@AfterStep
public void afterStep() {
	
	System.out.println("Run After each step in the scenario");

} */

@Given("Navigate the app url")
public void navigate_the_app_url() {
	
	driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
}

@When("enter the username into username textbox field")
public void enter_the_username_into_username_textbox_field(DataTable dataTable) {
	
	List<Map<String, String>> data = dataTable.asMaps();
	
	String username = data.get(0).get("username"); //selenium
	
	System.out.println("UserName : "+username);
	
	driver.findElement(By.name("txtUserName")).sendKeys(username);
    
}

@When("enter the password into password textbox field")
public void enter_the_password_into_password_textbox_field(DataTable dataTable) {
	
	List<Map<String, String>> data = dataTable.asMaps();
	
	String password = data.get(0).get("password"); //selenium
	
	System.out.println("Password : "+password);
	
	driver.findElement(By.name("txtPassword")).sendKeys(password);
	
}

@When("click on login")
public void click_on_login() {
   
	driver.findElement(By.name("Submit")).click();
}

@Then("verify the welcome page")
public void verify_the_welcome_page() {
  
	//Identify and get welcome Selenium text
	String text = driver.findElement(By.xpath("/html/body/div[3]/ul/li[1]")).getText(); 
			
	System.out.println(text); // Welcome Selenium
			
	// ---------Verification Code-----
		if(text.equals("Welcome Selenium"))
		{
			System.out.println("Welcome page verified successfully");
				
		}else {
				
			System.out.println("Welcome page not verified successfully");
		}
      
  }


@When("Close the app url")
public void close_the_app_url() {
    
	driver.close();
} 

}


/* --------*************----------------
 * @When("enter the username")
public void enter_the_username() {
    
	driver.findElement(By.name("txtUserName")).sendKeys("selenium");

}
@When("enter the password")
public void enter_the_password() {
    
	driver.findElement(By.name("txtPassword")).sendKeys("selenium");

}
 -------------*****************----------------------------
 
 @When("enter the username {string} into username textbox field")
 public void enter_the_username_into_username_textbox_field(String string) {
    
	driver.findElement(By.name("txtUserName")).sendKeys(string);

}

@When("enter the password {string} into password textbox field")
public void enter_the_password_into_password_textbox_field(String string) {
    
	driver.findElement(By.name("txtPassword")).sendKeys(string);

}

---------------------------***********************------------------
@When("enter the username into username textbox field")
public void enter_the_username_into_username_textbox_field(DataTable dataTable) {
	
     List<List<String>> data = dataTable.asLists();
     
     String username = data.get(0).get(0);
     
     System.out.println("username : "+username);
     
     driver.findElement(By.name("txtUserName")).sendKeys(username);;
}

@When("enter the password into password textbox field")
public void enter_the_password_into_password_textbox_field(DataTable dataTable) {
   
	List<List<String>> data = dataTable.asLists();
    
    String password = data.get(0).get(0);
    
    System.out.println("password : "+password);
    
    driver.findElement(By.name("txtPassword")).sendKeys(password);;
}


 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */

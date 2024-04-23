package pageClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class FacebookLogin extends TestBase {
 //public  static WebDriver driver;

		
		//Page Factory - OR:
	
		@FindBy(id="email")
		WebElement username;
		
		@FindBy(id="pass")
		WebElement password;
		
		@FindBy(xpath="//button[@type='submit']")
		WebElement loginButton;
		
		//Initializing the Page Objects:
		
		public FacebookLogin(){
			PageFactory.initElements(driver, this);
		}
		
		
		//Actions:
		public WebElement usernNameEntry() {
			return username;
		}
		
		public WebElement passwordEntry() {
			return password;
		}
		
		public WebElement LoginButtonClick() {
			return loginButton;
		}

		
	}


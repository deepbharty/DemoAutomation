package SeleniumDemoTest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		
	//get the Parent Window first
		
		String parentWindow=driver.getWindowHandle();
		
		System.out.println("Parent Window is :- " +parentWindow);
		
//We will have to click on all the child windows first
		
		driver.findElement(By.id("tabButton")).click(); //1st click
		driver.findElement(By.id("windowButton")).click(); //Second click
		driver.findElement(By.id("messageWindowButton")).click(); //third click
	
				
//WindowHandles data get stored in Set <String> data struture.	
		
		Set<String> allWindow=driver.getWindowHandles();
		
		System.out.println("Child Window is :- " +allWindow);
		
//Since we have iterate throughout the Set data struture, we will; have to use its cursor for it. Which is iterator.
		
		Iterator<String> it=allWindow.iterator();
		
		while(it.hasNext()) {
			
			String childWindow=it.next();
			if(!parentWindow.equalsIgnoreCase(childWindow)) {
				
				driver.switchTo().window(childWindow);
				
				Thread.sleep(2000);
				
				
			//Getting text from newly opened tab, that means first child window.	
				// WebElement text = driver.findElement(By.id("sampleHeading"));
	               // System.out.println("Heading of child window is " + text.getText());
	                
	                
	        //Getting text from secondly cliked window.  
				
				driver.quit();
				
			}
			
			
		}
		
		
		
		
	}

}

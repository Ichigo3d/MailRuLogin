package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	@FindBy(xpath="//i[@id='PH_user-email']")
    WebElement userName;
	
	@FindBy(xpath="//span[contains(text(),'Написать письмо')]")
    WebElement writeLet;
	
	
	
	public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this); //initialization of  all WebElements
    }
	
	
	 public void clickBtn(String button){

	    	try {
	    		switch (button) {
               case "writeLet":
            	 writeLet.click();
	    		}
             } catch (IllegalArgumentException ex) {
             	System.out.println("Button is not existed");
             }
	 }
	            
	


	public String getUserName() {
		return   userName.getText();
	}
	
	      
	    
}

package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	@FindBy(name="clb831530")
    WebElement logopg;
	
	@FindBy(name="login")
    WebElement emlinput;
	
	@FindBy(name="password")
    WebElement pswd;
	
	@FindBy(xpath="//input[@value='Войти']")
    WebElement btnSbmit;
	
	public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this); //initialization of  all WebElements
    }
	
	
	public String getLoginTitle(){

	     return    logopg.getText();

	    }
	public void clickBtn(String button){

      	 btnSbmit.click();
         			
		}
 public void setUserName(String userName) {
		 
		 emlinput.sendKeys(userName);
	 }
	 
	 public void setUserPassword(String userPassword) {
		 
		 pswd.sendKeys(userPassword);
	 }
}

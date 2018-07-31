package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LetterPage {
	WebDriver driver;
	@FindBy(xpath="//textarea[contains(@data-original-name,'To')]")
    WebElement TxtAreaTo;
	
	@FindBy(name ="Subject")
    WebElement TxtTopic;
	
	@FindBy(xpath ="/html[1]/body[1]")
    WebElement Br;
	
	@FindBy(tagName ="iframe")
    WebElement Frme;
	
	
	@FindBy(xpath ="//span[text()='Отправить']")
    WebElement BtnSnd;
	
	public LetterPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this); //initialization of  all WebElements
    }
	
	public void clickBtnLet(String button){
		try {
    		switch (button) {
            case "BtnSnd":
            	BtnSnd.click();
            			break;	
       		}
    		}catch(IllegalArgumentException ex) {
            	System.out.println("Button is not existed");
            }
		
 }
         
	
	public void setDest(String recipient) {
		 
		TxtAreaTo.sendKeys(recipient);
	 }	
	
	public void setTopic(String topic) {
		 
		TxtTopic.sendKeys(topic);
	 }
	
	public void setBodyLet(String letter) {
		 
		Br.sendKeys(letter);
	 }

	
	
	
}

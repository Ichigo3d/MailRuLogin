package com.TestLogin;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.NoSuchElementException;

import PageFactory.HomePage;
import PageFactory.LetterPage;
import PageFactory.LoginPage;

import support.BaseTest;
import support.TestContext;

public class LoginMail extends BaseTest {
	
	LoginPage objLogin;
	HomePage objHomePage;
	LetterPage objLetter;
	@Test
	public void test() throws InterruptedException {
		try {
			objLogin = new LoginPage(TestContext.getDriver()); // link to the PageObjects
			Thread.sleep(500);
			assertEquals("Mail.Ru: почта, поиск в интернете, новости, игры", TestContext.getDriver().getTitle());//get title from page
						
			objLogin.setUserName("youremail");
			objLogin.setUserPassword("yourpassword");
			String btn = "btnSbmit";
			objLogin.clickBtn(btn);
			Thread.sleep(1000);	
			
			objHomePage = new HomePage(TestContext.getDriver());
			String exp = "youremail";
			String res = objHomePage.getUserName();
			assertEquals(exp, res);
			System.out.println("Actual result is " + res + " Expected result is " + exp);
			
			String btn1 = "writeLet";
			objHomePage.clickBtn(btn1);
			
			
			objLetter = new LetterPage(TestContext.getDriver());
			Thread.sleep(500);
			assertEquals("Новое письмо - Почта Mail.Ru", TestContext.getDriver().getTitle());
			
			objLetter.setDest("emaildestination");
			
			objLetter.setTopic("Test sending of letter");
						
			
			Thread.sleep(500);
			TestContext.getDriver().switchTo().frame(0);
			
			objLetter.setBodyLet("Test sending of letter. Don't answer!");
			
			TestContext.getDriver().switchTo().parentFrame();
			
			String btnLet2 = "BtnSnd";
			objLetter.clickBtnLet(btnLet2);
			
			 }catch(NoSuchElementException e) {
	             fail("I can't find element's value");
	     }
	}

}

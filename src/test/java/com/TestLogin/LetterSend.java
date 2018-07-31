package com.TestLogin;

import static org.junit.Assert.*;


import org.junit.Test;

import PageFactory.HomePage;
import support.BaseTest;
import support.TestContext;

public class LetterSend extends BaseTest{
HomePage objHomePage;
	@Test
	public void test() {
		assertEquals("testtask1234@mail.ru", TestContext.getDriver().getTitle());
	
	}

}

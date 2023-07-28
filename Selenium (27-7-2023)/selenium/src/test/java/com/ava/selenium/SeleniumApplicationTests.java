package com.ava.selenium;

import com.ava.selenium.page.HomePage;
import com.ava.selenium.page.LoginPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SeleniumApplicationTests {
	@Autowired
	private LoginPage loginPage;

	@Autowired
	private HomePage homePage;

	@Autowired
	private WebDriver webDriver;



	@Test
	public void testLoginAndLogout() throws InterruptedException {
		webDriver.get("http://localhost:4200");
		loginPage.login("username", "password");
		Thread.sleep(10000);

		homePage.logout();


	}



}

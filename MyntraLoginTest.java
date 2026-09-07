package com.core;

public class MyntraLoginTest {
	public static void main(String[] args) {

        MyntraLoginPage loginPage = new MyntraLoginPage();

        loginPage.enterUsername();
        loginPage.enterPassword();
        loginPage.clickLoginButton();
    }

}

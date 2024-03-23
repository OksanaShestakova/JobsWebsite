package org.example;

import Pages.AboutUsPage;
import Pages.HomePage;
import Utils.UseCaseBase;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePageTest extends UseCaseBase {
    private static HomePage mainPage;

    @BeforeAll
    public static void classSetup() {
        mainPage = new HomePage();
    }

    @BeforeEach
    public void beforeTest() {
        mainPage.navigateToMainPage();
    }

    @Test
    public void isHomePageLoadTest(){
        String URL= webDriver.getCurrentUrl();
        String expectedAboutUsURL= "http://167.99.178.249:3000/";
        assertEquals(URL,expectedAboutUsURL);
    }
    @Test
    public void logoVisibleTest() {

        Boolean successLogo = mainPage.isLogoVisible();
        assertTrue(successLogo);
    }
    @Test
    public void imgVisibleTest(){
        boolean successImg=mainPage.isMainIMGVisible();
        assertTrue(successImg);
    }
}
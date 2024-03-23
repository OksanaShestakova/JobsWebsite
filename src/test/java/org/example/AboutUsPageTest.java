package org.example;

import Pages.AboutUsPage;
import Pages.HomePage;
import Utils.UseCaseBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AboutUsPageTest extends UseCaseBase{

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
        public void logoVisibleOnAboutUsPageTest() {
            AboutUsPage aboutUsPage= mainPage.openAboutUsPage();
            Boolean successLogoAboutUS =  aboutUsPage.isLogoOnAboutUsPageVisible();
            assertTrue(successLogoAboutUS);
        }

        @Test
    public void isAboutUsPageLoadTest(){
            AboutUsPage aboutUsPage= mainPage.openAboutUsPage();
            String URL= webDriver.getCurrentUrl();
            String expectedAboutUsURL= "http://167.99.178.249:3000/about";
            assertEquals(URL,expectedAboutUsURL);
        }

    }

package org.example;

import Pages.HomePage;
import Pages.JobsPage;
import Utils.UseCaseBase;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static Pages.JobsPage.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JobsPageTest extends UseCaseBase {
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
    public void jobsPageIsOpenedTest() {
        JobsPage jobsPage = mainPage.openJobsPage();
        String jobsCurrentURL = webDriver.getCurrentUrl();
        String jobsURL = "http://167.99.178.249:3000/job-page";
        assertEquals(jobsURL, jobsCurrentURL);
    }

    @Test
    public void locationTorontoTest() throws InterruptedException {
        JobsPage jobsPage = mainPage.openJobsPage();
        jobsPage.testToronto();
        Thread.sleep(2000);

        List<WebElement> searchResults = webDriver.findElements(By.className("jobs"));
        for (WebElement result : searchResults) {
            String resultLocation = result.findElement(By.className("location")).getText();
            assertTrue(resultLocation.contains("Toronto"), "Result doesn't contain 'Toronto': " + resultLocation);
        }
    }

    @Test
    public void locationTelAvivTest() throws InterruptedException {
        JobsPage jobsPage = mainPage.openJobsPage();
        jobsPage.testTelAviv();
        Thread.sleep(2000);

        List<WebElement> searchResults = webDriver.findElements(By.className("jobs"));
        for (WebElement result : searchResults) {
            String resultLocation = result.findElement(By.className("entry-content")).getText();
            System.out.println(resultLocation);
            assertTrue(resultLocation.contains("Tel Aviv"), "Result doesn't contain 'Tel Aviv': " + resultLocation);
        }
    }

    @Test
    public void locationChicagoTest() throws InterruptedException {
        JobsPage jobsPage = mainPage.openJobsPage();
        jobsPage.testChicago();
        Thread.sleep(2000);
        List<WebElement> searchResults = webDriver.findElements(By.className("jobs"));
        for (WebElement result : searchResults) {
            String resultLocation = result.findElement(By.className("entry-content")).getText();
            assertTrue(resultLocation.contains("Chicago"), "Result doesn't contain 'Chicago': " + resultLocation);

        }
    }

    @Test
    public void locationNewYorkTest() throws InterruptedException {
        JobsPage jobsPage = mainPage.openJobsPage();
        jobsPage.testNewYork();
        Thread.sleep(2000);
        List<WebElement> searchResults = webDriver.findElements(By.className("jobs"));
        for (WebElement result : searchResults) {
            String resultLocation = result.findElement(By.className("entry-content")).getText();
            assertTrue(resultLocation.contains("New York"), "Result doesn't contain 'New York': " + resultLocation);
        }
    }

    @Test
    public void jobsPositionQA() throws InterruptedException {
        JobsPage jobsPage = mainPage.openJobsPage();
        jobsPage.testQa();
        Thread.sleep(2000);
        List<WebElement> searchJobsResults = webDriver.findElements(By.className("jobs"));
        for (WebElement result : searchJobsResults) {
            String resultJobs = result.findElement(By.className("entry-content")).getText();
            assertTrue(resultJobs.contains("QA"), "Result doesn't contain 'Qa' " + resultJobs);
        }
    }

    @Test
    public void jobsPositionDeveloper() throws InterruptedException {
        JobsPage jobsPage = mainPage.openJobsPage();
        jobsPage.testDeveloper();
        Thread.sleep(2000);
        List<WebElement> searchJobsResults = webDriver.findElements(By.className("jobs"));
        for (WebElement result : searchJobsResults) {
            String resultJobs = result.findElement(By.className("entry-content")).getText();
            assertTrue(resultJobs.contains("Developer"), "Result doesn't contain 'Developer' " + resultJobs);
        }
    }

    @Test
    public void jobsPositionPM() throws InterruptedException {
        JobsPage jobsPage = mainPage.openJobsPage();
        jobsPage.testProjectManager();
        Thread.sleep(2000);
        List<WebElement> searchJobsResults = webDriver.findElements(By.className("jobs"));
        for (WebElement result : searchJobsResults) {
            String resultJobs = result.findElement(By.className("entry-content")).getText();
            assertTrue(resultJobs.contains("Project Manager"), "Result doesn't contain 'Project Manager' " + resultJobs);
        }
    }

    @Test
    public void companyAppleTest() throws InterruptedException {
        JobsPage jobsPage = mainPage.openJobsPage();
        jobsPage.testApple();
        Thread.sleep(2000);
        List<WebElement> searchResults = webDriver.findElements(By.className("jobs"));
        for (WebElement result : searchResults) {
            String resultLocation = result.findElement(By.className("entry-content")).getText();
            assertTrue(resultLocation.contains("Apple"), "Result doesn't contain 'Apple': " + resultLocation);
        }
    }

    @Test
    public void companyFacebookTest() throws InterruptedException {
        JobsPage jobsPage = mainPage.openJobsPage();
        jobsPage.testFacebook();
        Thread.sleep(2000);
        List<WebElement> searchJobsResults = webDriver.findElements(By.className("jobs"));
        for (WebElement result : searchJobsResults) {
            String resultJobs = result.findElement(By.className("entry-content")).getText();
            assertTrue(resultJobs.contains("Facebook"), "Result doesn't contain 'Facebook' " + resultJobs);
        }
    }

    @Test
    public void companyGoogleTest() throws InterruptedException {
        JobsPage jobsPage = mainPage.openJobsPage();
        jobsPage.testGoogle();
        Thread.sleep(2000);
        List<WebElement> searchJobsResults = webDriver.findElements(By.className("jobs"));
        for (WebElement result : searchJobsResults) {
            String resultJobs = result.findElement(By.className("entry-content")).getText();
            assertTrue(resultJobs.contains("Google"), "Result doesn't contain 'Google' " + resultJobs);
        }

    }

    @Test
    public void companyMixTest() throws InterruptedException {
        JobsPage jobsPage = mainPage.openJobsPage();
        jobsPage.testMix();
        Thread.sleep(2000);
        List<WebElement> searchJobsResults = webDriver.findElements(By.className("jobs"));
        for (WebElement result : searchJobsResults) {
            String resultJobs = result.findElement(By.className("entry-content")).getText();
            assertTrue(resultJobs.contains("Google") && resultJobs.contains("USA") && resultJobs.contains("Project Manager"), "Result doesn't contain " + resultJobs);
        }
    }

    @Test
    public void noResultsTest() throws InterruptedException {
        JobsPage jobsPage = mainPage.openJobsPage();
        jobsPage.testNoResults();
        Thread.sleep(2000);
        List<WebElement> searchResults = webDriver.findElements(By.className("jobs"));
        for (WebElement result : searchResults) {
            String resultNotFound = result.findElement(By.className("error-indicator")).getText();
            assertTrue(resultNotFound.contains("No results found"), "No error message");
        }

    }

    @Test
    public void resetTest() throws InterruptedException {
        JobsPage jobsPage = mainPage.openJobsPage();
        jobsPage.testMix();
        Thread.sleep(2000);
        jobsPage.clickResetButton();
        WebElement inputPosition = webDriver.findElement(By.xpath(POSITIONFIELD));
        WebElement inputLocation = webDriver.findElement(By.xpath(LOCATIONFIELD));
        WebElement inputCompany = webDriver.findElement(By.xpath(COMPANYFIELD));
        String textFromPosition = inputPosition.getText();
        String textFromLocation = inputLocation.getText();
        String textFromCompany = inputCompany.getText();
        assertTrue(textFromPosition.isEmpty() && textFromLocation.isEmpty() && textFromCompany.isEmpty());
    }
}
















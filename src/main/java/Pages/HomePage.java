package Pages;
import Const.Const;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static Const.Const.MAIN_URL;

public class HomePage extends BasePage {
    public void navigateToMainPage() {
        webDriver.get(MAIN_URL);
    }

    private static final String LOGO_IMG = "//img[@src='/img/site_bg.jpg']";

    private static final String MAIN_IMGGIRLS = "//img[@src='/img/why-us.jpg']";
    private static final String ABOUT_US= "//*[@name='About Us']";
private static final String JOBS_PAGE="//*[@name='Find Job']";
    public boolean isLoginPageLoaded() {
        return elementExists(MAIN_URL);
    }



    public boolean isLogoVisible() {

        Boolean isVisible = elementExists(LOGO_IMG);
        return isVisible;}


    public boolean isMainIMGVisible() { return elementExists(MAIN_IMGGIRLS);}

    public AboutUsPage openAboutUsPage(){
        clickElementByXpath(ABOUT_US);
        return new AboutUsPage();
    }

    public JobsPage openJobsPage(){
        clickElementByXpath(JOBS_PAGE);
        return new JobsPage();

    }
}

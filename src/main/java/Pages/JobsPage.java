package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class JobsPage extends BasePage {
    public static final String LOCATIONFIELD="//*[@name='location']" ;
    private static final String SEARCHBUTTON= "//*[@class='search-butom']";
    private static final String ICONGEO ="//*[namespace-uri()='http://www.w3.org/2000/svg']";/* "//*[@xmlns='http://www.w3.org/2000/svg']";*/
public static final String POSITIONFIELD="//*[@name='position']";
    public static final String COMPANYFIELD="//*[@name='company']";
    private static final String RESETBUTTON="//html/body/div/div/div[2]/div/section[2]/div/div/div[2]/div/div/form/button[2]" ;

    public void  clickSearchButton(){clickElementByXpath(SEARCHBUTTON);}
    public void  clickResetButton(){clickElementByXpath(RESETBUTTON);}
    public void  testToronto() {sendTextToElementByXpath(LOCATIONFIELD,"Toronto");
    clickSearchButton();}
    public void  testTelAviv() {sendTextToElementByXpath(LOCATIONFIELD,"Tel Aviv");
        clickSearchButton();}
    public  void testChicago(){sendTextToElementByXpath(LOCATIONFIELD,"Chicago");
        clickSearchButton();}
    public  void testNewYork(){sendTextToElementByXpath(LOCATIONFIELD,"New York");
        clickSearchButton();}
public void testQa(){sendTextToElementByXpath(POSITIONFIELD, "QA");
    clickSearchButton();}
    public void testDeveloper(){sendTextToElementByXpath(POSITIONFIELD, "Developer");
        clickSearchButton();}
    public void testProjectManager(){sendTextToElementByXpath(POSITIONFIELD, "Project Manager");
        clickSearchButton();}
    public void testApple(){sendTextToElementByXpath(COMPANYFIELD, "Apple");
        clickSearchButton();}
    public void testFacebook(){sendTextToElementByXpath(COMPANYFIELD, "Facebook");
        clickSearchButton();}
    public void testGoogle(){sendTextToElementByXpath(COMPANYFIELD, "Google");
        clickSearchButton();}
    public void testNoResults(){sendTextToElementByXpath(COMPANYFIELD, "Googoooooo");
        clickSearchButton();}
    public void testMix(){
        sendTextToElementByXpath(POSITIONFIELD, "Project Manager");
        sendTextToElementByXpath(COMPANYFIELD, "Google");
        sendTextToElementByXpath(LOCATIONFIELD,"USA");
        clickSearchButton();}
    }

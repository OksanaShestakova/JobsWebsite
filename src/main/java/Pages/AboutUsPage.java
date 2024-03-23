package Pages;

import static Const.Const.MAIN_URL;

public class AboutUsPage extends BasePage{

    private static final String LOGO_ONABOUTUSPAGE_IMG = "//img[@src='/img/about.jpg']";
    public boolean isLogoOnAboutUsPageVisible(){
        return elementExists((LOGO_ONABOUTUSPAGE_IMG));
    }

}

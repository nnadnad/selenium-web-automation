package stepMethod.Web;

import net.serenitybdd.core.pages.PageObject;
import pages.Web.HomePage;

public class HomePageMethod extends PageObject {
    HomePage homePage = new HomePage();

    public void clickSignInBtn() {
        homePage.signInBtn.click();
        waitABit(5000);
    }
}

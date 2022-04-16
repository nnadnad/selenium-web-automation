package pages.Web;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.amazon.com/")
public class HomePage extends PageObject {

    @FindBy(xpath = "//span[@id='nav-link-accountList-nav-line-1']")
    public WebElementFacade homeToSignIn;

    @FindBy(xpath = "//a[@id='nav-logo-sprites']")
    public WebElementFacade amazonLogoTitle;

    public void clickSignInBtn() {
        homeToSignIn.click();
        waitABit(5000);
    }

    public String getAmazonLogoTitle() {
        return amazonLogoTitle.getText();
    }



}

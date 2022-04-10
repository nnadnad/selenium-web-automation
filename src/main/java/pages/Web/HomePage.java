package pages.Web;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.amazon.com/")
public class HomePage extends PageObject {

    @FindBy(xpath = "//span[@id='nav-link-accountList-nav-line-1']")
    public WebElementFacade homeToSignIn;

}

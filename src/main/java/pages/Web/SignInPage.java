package pages.Web;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&")
public class SignInPage extends PageObject {

    @FindBy(xpath = "//input[@id='ap_email']")
    public WebElementFacade signInField;

    @FindBy(xpath = "//input[@id='continue']")
    public WebElementFacade signInContinueBtn;

    @FindBy(xpath = "//a[@id='createAccountSubmit']")
    public WebElementFacade signUpBtn;

    @FindBy(xpath = "//span[@class='a-expander-prompt']")
    public WebElementFacade needHelLink;
}

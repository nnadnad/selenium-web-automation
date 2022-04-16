package pages.Web;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;

import java.util.concurrent.TimeUnit;

import static java.time.temporal.ChronoUnit.SECONDS;

@DefaultUrl("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&")
public class SignInPage extends PageObject {
    EnvironmentVariables properties = SystemEnvironmentVariables.createEnvironmentVariables();

    @FindBy(xpath = "//input[@id='ap_email']")
    public WebElementFacade usernameField;

    @FindBy(xpath = "//input[@id='continue']")
    public WebElementFacade signInContinueBtn;

    @FindBy(xpath = "//a[@id='createAccountSubmit']")
    public WebElementFacade signUpBtn;

    @FindBy(xpath = "//span[@class='a-expander-prompt']")
    public WebElementFacade needHelLink;
    
    @FindBy(xpath = "//input[@id='ap_password']")
    public WebElementFacade passwordField;

    @FindBy(xpath = "//input[@id='signInSubmit']")
    public WebElementFacade signInBtn;

    @FindBy(xpath = "//a[@id='auth-fpp-link-bottom']")
    public WebElementFacade forgotPasswordLink;

    public void sendEmailField() {
        usernameField.sendKeys(properties.getProperty("username"));
        waitABit(2000);
    }

    public void clickContinueBtn() {
        signInContinueBtn.click();
        waitABit(2000);
    }

    public void clickSignUpBtn() {
        signUpBtn.click();
        waitABit(2000);
    }

    public void clickNeedHelpLink() {
        needHelLink.click();
        waitABit(2000);
    }

    public void sendPasswordField() {
        passwordField.sendKeys(properties.getProperty("password"));
        waitABit(2000);
    }

    public void clickSignInBtn() {
        signInBtn.click();
        waitABit(2000);
//        withTimeoutOf(2, SECONDS);
    }

    public void clickForgotPasswordLink() {
        forgotPasswordLink.click();
        waitABit(2000);
    }
}

package stepMethod.Web;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;
import pages.Web.SignInPage;

public class SignInPageMethod extends PageObject {
    SignInPage signInPage = new SignInPage();
    EnvironmentVariables properties = SystemEnvironmentVariables.createEnvironmentVariables();

    public void sendEmail() {
        signInPage.signInField.sendKeys(properties.getProperty("username"));
        waitABit(2000);
    }

    public void clickContinueBtn() {
        signInPage.signInContinueBtn.click();
        waitABit(2000);
    }

    public void clickSignUpBtn() {
        signInPage.signUpBtn.click();
        waitABit(2000);
    }

    public void clickNeedHelpLink() {
        signInPage.needHelLink.click();
        waitABit(2000);
    }
}

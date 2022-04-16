package stepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Web.HomePage;
import pages.Web.SignInPage;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class SignInSteps {
    HomePage homePage = new HomePage();
    SignInPage signInPage = new SignInPage();

    @When("^I open amazon homepage")
    public void iOpenAmazonHomepage() {
        homePage.open();
    }

    @Then("I click sign in button to redirect to sign in page")
    public void iClickSignInButtonToRedirectToSignInPage() {
        homePage.clickSignInBtn();
    }

    @Then("I enter valid email for sign in")
    public void iEnterValidEmailForSignIn() {
        signInPage.sendEmailField();
    }

    @Then("I click continue button")
    public void iClickContinueButton() {
        signInPage.clickContinueBtn();
    }

    @Then("I enter valid password for sign in")
    public void iEnterValidPasswordForSignIn() {
        signInPage.sendPasswordField();
    }

    @Then("I click sign in button")
    public void iClickSignInButton() {
        signInPage.clickSignInBtn();
    }
}

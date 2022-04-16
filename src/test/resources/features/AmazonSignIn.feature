@Web @SignIn
  Feature: Sign In Amazon Page

    @Positive
    Scenario: As a user i want to sign in to amazon using valid credentials
      When I open amazon homepage
      Then I click sign in button to redirect to sign in page
      Then I enter valid email for sign in
      Then I click continue button
      Then I enter valid password for sign in
      Then I click sign in button
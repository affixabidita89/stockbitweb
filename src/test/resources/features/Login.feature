  Feature: Validate login feature
    I want to login with valid credential


    Scenario Outline: User can login without any errors
      Given I am on <websiteURL> the Home Page of Stockbit.com
      And I click Login menu
      Then I redirected to <URL>
      And I enter valid <username> and <password>
      And I click Login button
      Then I redirected to <URLStream> stream
      Examples:
        | websiteURL                    | URL                          | username            | password       | URLStream                           |
        | "https://stockbit.com/ | "https://stockbit.com/#/login" | "username" | "password" | "https://stockbit.com/#/stream" |
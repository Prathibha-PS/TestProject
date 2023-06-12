Feature: This feature is to Open google.co.in and search ANZ page

  Scenario: Open google and search ANZ
    Given User opens google.co.in
    When User enters "www.anz.com" in search field
    And enters the return key
    Then User should navigate to the ANZ webiste page
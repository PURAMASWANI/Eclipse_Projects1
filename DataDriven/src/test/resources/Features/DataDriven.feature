Feature: Login using Data Table (List)

Scenario: Login with multiple credentials using List
  Given Launch the browser
  When I open the login page
  And I enter the following credentials
    | standard_user    | secret_sauce |
    | locked_out_user  | secret_sauce |
  Then I close the browser
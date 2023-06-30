@Login
Feature: Login functionality

Background:
 Given If user is on home page
 
@Smoke
Scenario Outline: Verify user is able to login with valid credentials
When  Click on login link
And   Enter user name as "<Uname>" and password as "<Password>"
Then  Verify logout link
Examples:
    | Uname | Password |
    | demo  | 1234     |
    | demo5 | 1235     |

@Sanity @Regression
Scenario: Verify user is able to generate QR code and URL
When  Click on login link
And   Enter user name as "demo" and password as "1234"
And   Click on Banking link
And   Click on Receive QR-code
And   Enter amount as "200"
And   Click on Generate QR code
Then  Verify QR code and URL

@DB
Scenario: Verify data base values
When  Click on login link
And   Enter user name as "demo" and password as "1234"
And   Click on Banking link
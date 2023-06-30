@QRCode
Feature: QRCode functionality
@Regression
Scenario: Verify user is able to generate QR code and URL
Given If user is on home page
When  Click on login link
And   Enter user name as "demo" and password as "1234"
And   Click on Banking link
And   Click on Receive QR-code
And   Enter amount as "200"
And   Click on Generate QR code
Then  Verify QR code and URL
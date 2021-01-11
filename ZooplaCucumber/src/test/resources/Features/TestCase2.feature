Feature: Zoopla Application to check prices for a place

@Functional
Scenario Outline: checking house prices
Given Login to Zoopla application is launched for "<testName>"
When click on house prices
And Enter place name "<Place>" in search box 
Then place with price is displayed.
Examples:
|testName|Place|
|test2|London Road, Addington, West Malling ME19|
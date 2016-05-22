Feature: New Doctor Visit
As A Patient 
I want to record doctor visit
So that data should be available as and when needed

Scenario: Success message after adding new record
Given patient has enetered all correct data
When click on Submit
Then System display "record saved"

@ready
Scenario: Duplicate message after adding new record
Given patient has enetered all correct data
And paient is trying to add same record again
When click on Submit
Then System display "Duplicate found"

@wip
Scenario: Duplicate message after adding new record with data
Given patient has enetered name as "Naveen", doctor name as "ABC", date as "12/31/2016" and time is "12.30pm"
And paient is trying to add same record again name as "Naveen", doctor name as "ABC", date as "1/1/2016" and time is "12.30pm"
When click on "Submit"
Then System display "Duplicate found"

@regression
Scenario: Reset data
Given patient has enetered all correct data
When click on "Reset"
Then System display "Do you want to reset?"

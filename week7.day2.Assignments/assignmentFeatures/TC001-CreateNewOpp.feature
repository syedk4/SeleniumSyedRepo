Feature: Create New Opportunity



@functional @smoke  @sanity
Scenario Outline: Create New
Given Enter the username as <username> and password as <password>
When Click on Login button
Then Homepage should be displayed 
Given Click on toggle menu button from the left corner 
Given Click View All link
Given Click Sales link
Then Click Opportunities
Then Click New
And Enter Opportunity name as 'Syed' 
And Choose close date as Today
And Select 'Needs Analysis' as Need Analysis and Save
Then Verify opportunity Name


Examples:
|username|password|
|'hari.radhakrishnan@qeagle.com'|'Leaf@123'|
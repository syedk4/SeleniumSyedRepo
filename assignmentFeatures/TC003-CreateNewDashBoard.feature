Feature: Create New DashBoard


@functional @regression @smoke @sanity
Scenario Outline: Create New DB
Given Enter the username as <username> and password as <password>
When Click on Login button
Then Homepage should be displayed 
Given Click on toggle menu button from the left corner 
Given Click View All link
Given Click on Dashboard
Then Verify the dashboard title
When New Dashboard is clicked 
Then Enter the Name and click on the Create
When Click on Save
Then Verify the Dashboard name
Examples:
|username|password|
|'hari.radhakrishnan@qeagle.com'|'Leaf@123'|
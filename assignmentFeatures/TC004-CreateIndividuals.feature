Feature: Create Individual
	 
	 
	 #  Test Steps: 
	 #  1. Login to https://login.salesforce.com 
	 #  2.Click on the toggle menu button from the left corner 
	 #  3. Click View All and click Individuals from App Launcher
	 #  4. Click on New Individual 
	 #  5. Enter the Last Name as 'Kumar'
	 #  6.Click save and verify Individuals Name" 
	 
@functional @regression @smoke @sanity
Scenario Outline: Create New Individual 
Given Enter the username as <username> and password as <password>
When Click on Login button
Then Homepage should be displayed 
Given Click on toggle menu button from the left corner 
Given Click View All link
Then Click on New Individual 
Then Enter the Last Name as 'Kumar'
When Click save
Then Verify Individuals Name

Examples:
|username|password|
|'hari.radhakrishnan@qeagle.com'|'Leaf@123'|
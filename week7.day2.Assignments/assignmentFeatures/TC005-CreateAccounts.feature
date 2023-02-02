Feature: Create Account

	 #  1. Login to https://login.salesforce.com 
	 #  2.Click on toggle menu button from the left corner
	 #  3. Click view All and click Sales from App Launcher
	 #  4. Click on Accounts tab 
	 #  5. Click on New button 
	 #  6.Enter 'your name' as account name 
	 #  7. Select Ownership as Public
	 #  8. Click save and verify Account name "
	 
	 
@functional @regression @smoke @sanity
Scenario Outline: Create New DB
Given Enter the username as <username> and password as <password>
When Click on Login button
Then Homepage should be displayed 
Given Click on toggle menu button from the left corner 
Given Click View All link
Given Click on Accounts
Then Enter 'SYED' as account name 
Then Select Ownership as Public
When Click Save to create account
Then Verify Account Name

Examples:
|username|password|
|'hari.radhakrishnan@qeagle.com'|'Leaf@123'|
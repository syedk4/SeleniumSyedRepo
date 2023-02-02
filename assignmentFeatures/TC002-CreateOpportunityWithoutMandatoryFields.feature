Feature: Create New Opportunity Without Mandatory Fields
		
		
		# 1. Login to https://login.salesforce.com 
		 # 2. Click on toggle menu button from the left corner 
		 # 3. Click view All and click Sales from App Launcher
		 # 4. Click on Opportunity tab 
		 # 5. Click on New button 
		 # 6. Choose Close date as Tomorrow Date
		 # 7. Click on save 
		 # 8. Verify the Alert message (Completethis field) displayed for Name and Stage"

		 
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
And Choose close date as Tomorrow Date
And Click on save
And Verify the alert message



Examples:
|username|password|
|'hari.radhakrishnan@qeagle.com'|'Leaf@123'|
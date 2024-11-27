To export a GitHub project to Eclipse, follow these simple steps:

Prerequisites:
Ensure Git is installed on your machine.
Have Eclipse IDE installed with the Git integration (EGit).

Step-by-Step Guide:

Option 1: Using Eclipse (EGit Plugin)
1. Open Eclipse:
Launch Eclipse IDE.
2. Open Git Perspective:
Go to Window > Perspective > Open Perspective > Other....
Select Git and click Open.
3. Clone the GitHub Repository:
1. In the Git perspective, click Clone a Git Repository.
2. In the dialog box, enter the Repository URL:
Go to the GitHub project page.
Click Code > HTTPS or SSH, and copy the URL.
3. Paste the URL in the URI field. The rest (host, repository path) will fill automatically.
4. Enter your GitHub credentials if required.
5. Click Next, select the branch(es) to clone, and click Finish.
4. Import Project into Eclipse.
1. Once cloned, right-click the project in the Git Repositories view and choose Import Projects.
2. Select Import existing Eclipse projects if the project has .project files, or choose Import as a general project.
3. Click Finish to complete the import.


Option 2: Manual Method (Without EGit)
1. Clone the Repository Manually:
Open a terminal/command prompt and run:
git clone https://github.com/username/repository.git
This will download the repository to your local machine.
2. Open Eclipse:
Launch Eclipse IDE.
3. Import the Project:
1. Go to File > Import.
2. Select Existing Projects into Workspace under General.
3. Click Next.
4. Browse to the cloned repository folder and select it.
5. Click Finish.

After importing the file to eclipse Workplace
1.check all the codes from all packages in src/main/java.
2.Then to perform automation
3.Go to src/test/java
4.In that open the package com.qa.fitpeo.testcases
5.run the classes from that package 

To run the classes from com.qa.fitpeo.testcases package
1.Right click on the desired class
2.select RunAs>>TestNG test
And the execution starts

code Explaination
BaseClass.java This base class helps with common setup and teardown tasks for your tests, including: This base class helps with common setup and teardown tasks for your tests, including:

Reading configuration properties from a file. Initializing the WebDriver based on the browser specified in the config file. Maximizing the browser window. Setting implicit wait time. Navigating to the base URL. Closing the browser after test execution. Prerequisites:

Java installed. Selenium WebDriver libraries downloaded and configured in your project. AutomationFitpeo/ src/ main/ java/ com/ qa/ fitpeo/ base/ BaseClass.java config/ config.properties (Optional) BaseClass.java This class provides the following functionalities:

Properties: props: A static Properties object used to store configuration values from the config file. driver: A static WebDriver object used to interact with the browser. Constructor: Reads configuration properties from config.properties file located in the config folder. initialization() method: Sets up the WebDriver based on the browser name specified in the config file. Maximizes the browser window. Sets implicit wait time. Navigates to the base URL specified in the config file. @AfterClass teardown() method: Closes the browser after test execution. Configuration File (Optional) The config.properties file (located in the config folder) can be used to store configuration values such as base URL and browser name. This allows for easy configuration changes without modifying the code itself.

Example config.properties: browser=firefox url=https://fitpeo.com/

Usage Extend the BaseClass in your test classes. Override the initialization() method if you need to customize the setup process. Use the driver object in your test methods to interact with the browser.

NavigatePage and Navigate Classes functionalities:
1. NavigatePage Class: Handles webpage navigation using Selenium.
2. Navigate Test Class: Sets up tests to navigate to different pages using NavigatePage.
3. Test Flow:
Setup: Initializes WebDriver and NavigatePage.
Test 1: Navigates to the "home" page.
Test 2: Navigates to the "revenue" page.

ScrollPage and ScrollTest class Functionalities:
1.scrollPage Class: Handles scrolling functionality until the slider is visible.
2. scrollTest Class: Runs tests to navigate to a page and perform scrolling.

SliderPage and SliderTest class Functionalities:
1. sliderPage Class: Handles slider adjustments and sets value to 820.
2. sliderTest Class: Runs test cases for navigation, scrolling, and adjusting the slider.

UpdateTextfieldPage and UpdateTextFieldTest class Functionalities:
1. updateTextFieldPage Class: Handles updating the text field to 520.
2. updateTextFieldTest Class: Runs tests to navigate, scroll, update the text field, and take a screenshot to validate the slider Position.

selectCptCodes and cptCodesSelectTest class Functionalities:
1.selectCptCodes Class: Handles checkbox selection and scrolling.
2. cptCodeSelectTest Class: Runs tests to navigate to a page and perform the checkbox selections and validates Total Recurring Reimbursement.

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

code Explaintation

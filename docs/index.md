<link rel="shortcut icon" type="image/png" href="{{ site.url }}/employee-management-system/favicon.png">

# Welcome

Welcome to the employee management system! This documentation is divided into many different parts. We recommended you get started with installation. This program is made in java with the JFrame GUI package. Feel free to view the code at github.com/heliotrope3n/employee-management-system. It's open source!


1. [Installation](#installation)
    1. [Developers](#subinstallation)
2. [Homepage](#homepage)
3. [Adding](#adding)
4. [Searching](#searching)
5. [Removing](#removing)
6. [Editing](#editing)
7. [Viewing](#viewing)
8. [Saving](#saving)
    1. [The Archive Format](#subsaving)
9. [Opening](#opening)
10. [Updating](#updating)
11. [Customizing](#customizing)
12. [Mulitple Windows](#multiple-windows)
13. [Exiting](#exiting)



# Installation <a name="installation"></a>

### Developers: <a name="subinstallation"></a>

1. Install Java.
2. Install and IDE (Eclipse or Netbeans)
3. Open the project called 'employee-management-system')
4. In the file directory of the IDE, navigate to  and open:
	employee-management-system >> src >> <default package> >> MainFrame.java
5. Press the 'run' button.

# The Homepage <a name="homepage"></a>

The homepage displays the name of the program. It also has a text area below with information that you, the user, can add about your company. Underneath, there are statistics that are automatically generated from all the employee information available. 

![Screenshot](https://heliotrope3n.github.io/employee-management-system/home.png)

# Adding <a name="adding"></a>

To add an employee to the system, click on the 'Add' tab on the left hand side of the page. Many input fields will appear, and information is entered into these fields. You must specify whether this employee is full time or part time, and the available fields will update accordingly. 

![Screenshot](https://heliotrope3n.github.io/employee-management-system/add.png)

All fields are required. An error message will appear if you leave a field blank or input an invalid entry:

![Screenshot](https://heliotrope3n.github.io/employee-management-system/adderror.png)

Once you click submit, a confirmation dialogue will open:

![Screenshot](https://heliotrope3n.github.io/employee-management-system/addconfirm.png)

Note: the employee number cannot be edited after creation.


# Searching <a name="searching"></a>

To search for an employee in the system, click on the 'Search' tab on the left hand side of the page. There will be a text input field for the employee number, and a search bar underneath. After entering the employee number you wish to search for, click search. The text area underneath will update with the employee's information. If the employee does not exist, it will let you know that. Searching by employee names is not available yet.

# Removing <a name="removing"></a>

Removing an employee is the second step in searching for the employee to remove, and so this feature is under the 'search' tab. After an employee's information is retrieved, pressing the 'Delete' button will pop up a confirmation dialog, and clicking yes will remove the employee. Clicking no will cancel the operation.

# Editing <a name="editing"></a>

Editing the employee is the second step in searching for the employee to edit, and so this feature is under the 'search' tab. After and employee's information is retrieved, pressing the 'edit' button will pop up an editing dialog. This dialog looks nearly identical to the add employee page, and the fields that are available for editing can be modified. The type of employee and employee number cannot be changed, so if this information is to be changed, treat the employee as a new employee and add it to the system.

# Viewing <a name="viewing"></a>

Viewing all employees can be done by clicking the 'view all' tab on the left hand side of the page. There will be a chart that is empty. To see the employees currently in the system, click the 'refresh' button at the bottom of the page. This action will update the table to reflect the current employees in the system. Make sure you click the 'refresh' button every time you access this page to ensure you have the latest information.

![Screenshot](https://heliotrope3n.github.io/employee-management-system/viewall.png)

# Saving <a name="saving"></a>

To save the entire system to a specific location, press 'Save As'. A file chooser dialog will pop up, and ask for a location and a name. The program will then save the file at your specified location and name. To save the file again, choose the same file name and location to save. The 'save' function does not currently work. Make sure to save before you exit the program, or you risk the loss of all your data. To ensure data security and stability, please DO NOT edit the file by opening it in another program. There is a risk of changing the file format, and this could cause data loss.

![Screenshot](https://heliotrope3n.github.io/employee-management-system/saveas.png)

### Developers: <a name="subsaving"></a>

When a database is saved as, the hashtable data is stored in a text file with the suffix -[DO NOT EDIT].txt
The information is in the following format:

	employeeType/employeeNumber/firstName/lastName/sex/workLocation/deductionRate/yearlySalary/hourlyWage/hourPerWeek/weeksPerYear

Each attribute is separated with a / delimeter and each employee is stored on a new line.
Note: the format of the information stored is generic for all employee types. any information that is not associated with a specific employee type will be saved as null (i.e. for a line that stores a full time employee, the attributes for hourlyWage, hoursPerWeek, and weeksPerYear will be saved as null).


![Screenshot](https://heliotrope3n.github.io/employee-management-system/archive.png)

# Opening <a name="opening"></a>

Click on File > Open. This will pop up a confirmation dialog warning of the deletion of the current information is the new system is opened. Make sure to save the current data before opening a new system. A file chooser will pop up once you acknowledge the warning, and choose the file with the name that you saved last time. It will have a [DO NOT EDIT] appended to it. This action will open your file and load it into the system. Then, you are ready to do everything else like before: add, save, modify, etc.

![Screenshot](https://heliotrope3n.github.io/employee-management-system/open.png)

The home tab will be updates to display the file path of your archive file:

![Screenshot](https://heliotrope3n.github.io/employee-management-system/openedhome.png)

# Updating <a name="updating"></a>

To update the program to its latest version, click on Help > Check for Updates. This action will automatically search online for available updates, and start updating if one is found. If no updates are found, you will be informed of that. The updates button will only check once every instance. To check for updates again, please restart the program.


![Screenshot](https://heliotrope3n.github.io/employee-management-system/update.png)

# Customizing <a name="customizing"></a>

The program has a unique and special feature that will allow you to customize the program. Adding your own customizations means adding your favourite colours, company colours, or adding colours that are easy on the eye. Currently, only the background colour customizer is available, and others will be added in future updates.

![Screenshot](https://heliotrope3n.github.io/employee-management-system/preferences.png)

# Multiple Windows <a name="multiple-windows"></a>

To open another instance of the program, press File > New. This is a completely new instance, and is unaffected by the original instance. Use it to work on two different files concurrently.

# Exiting <a name="exiting"></a>

To exit the program, you have a few options. The first is to press the X in the top right corner. Another is to click File > Exit. This will safely exit the program.


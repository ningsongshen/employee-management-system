<link rel="shortcut icon" type="image/x-icon" href="{{ site.url }}/employee-management-system/favicon.ico">

# Welcome

Welcome to the employee management system! This documentation is divided into many different parts. We recommended you get started with installation. This program is made in java with the JFrame GUI package. Feel free to view the code at github.com/heliotrope3n/employee-management-system. It's open source!


1. [Installation](#installation)
    1. [Developers](#subinstallation)
    2. [Users](#sub2installation)
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
2. Install an IDE (Eclipse or Netbeans)
3. Open the project called 'employee-management-system'.
4. In the file directory of the IDE, navigate to  and open:
	employee-management-system >> src >> <default package> >> MainFrame.java
5. Press the 'run' button.

### Users: <a name="sub2installation"></a>

Coming soon

# The Homepage <a name="homepage"></a>

The homepage displays the name of the program. It also has a text area below with information that you, the user, can add about your company. Underneath, there are statistics that are automatically generated from all the employee information available. 

These areas of the homepage may be blank or have zero values if employees have not been added or a previous file has not been loaded yet. Try adding an employee or a file to see the results.

![Screenshot](https://heliotrope3n.github.io/employee-management-system/home.png)

# Adding <a name="adding"></a>

To add an employee to the system, click on the 'Add' tab on the left hand side of the page. Many input fields will appear, and information is entered into these fields. You must specify whether this employee is full time or part time, and the available fields will update accordingly. 

Employee Number - this is the reference number for the employee and cannot be changed

First Name - this is the first (and possibly middle) name of the employee

Last name - this is the last name/family name of the employee

Sex - this is the sex of the employee. Use the drop down to select one. There is an option for non-disclosure.

Location - this is the main work location/office that the employee works at. This can be changed if needed.

Deduct Rate - this is the total deductions for the salary in decimals. (to get percentage, multiply by 100%)

After this, you will need to decide whether or not this employee if full time or part time. Don't worry, this is not a permanent decision and can be changed later. Fill in the required fields for the type of employee that this person will be.

![Screenshot](https://heliotrope3n.github.io/employee-management-system/add.png)

Most fields are required. An error message will appear if you leave a field blank or input an invalid entry:

![Screenshot](https://heliotrope3n.github.io/employee-management-system/adderror.png)

Once you click submit, a confirmation dialog will open:

![Screenshot](https://heliotrope3n.github.io/employee-management-system/addconfirm.png)

Please review the information and ensure that it is accurate. Then, click ok and the employee will be added to the system.

Note: the employee number cannot be edited after creation.


# Searching <a name="searching"></a>

To search for an employee in the system, click on the 'Search' tab on the left hand side of the page. There will be a text input field for the employee number, and a search bar underneath. After entering the employee number you wish to search for, click search. The text area underneath will update with the employee's information. If the employee does not exist, it will let you know that. Searching by employee names is not available yet.

The search page also has the functions to remove and edit the employee, see below.

# Removing <a name="removing"></a>

Removing an employee is the second step in searching for the employee to remove, and so this feature is under the 'search' tab. After an employee's information is retrieved, pressing the 'Delete' button will pop up a confirmation dialog, and clicking yes will remove the employee. Clicking no will cancel the operation.

# Editing <a name="editing"></a>

Editing the employee is the second step in searching for the employee to edit, and so this feature is under the 'search' tab. After and employee's information is retrieved, pressing the 'edit' button will pop up an editing dialog. This dialog looks nearly identical to the add employee page, and the fields that are available for editing can be modified. The type of employee and employee number cannot be changed, so if this information is to be changed, treat the employee as a new employee and add it to the system.

# Viewing <a name="viewing"></a>

Viewing all employees can be done by clicking the 'view all' tab on the left hand side of the page. There will be a chart that is empty. To see the employees currently in the system, click the 'refresh' button at the bottom of the page. This action will update the table to reflect the current employees in the system. Make sure you click the 'refresh' button every time you access this page to ensure you have the latest information.

If when you click refresh there is nothing displayed, the likely issue is that there are no employees in the system or a file has not been loaded. Try adding some employees or loading in a previously used file. 

If when you click refresh there is no change, you probably made no changes to any employees. Try making a change.

![Screenshot](https://heliotrope3n.github.io/employee-management-system/viewall.png)

# Saving <a name="saving"></a>

To save the entire system to a specific location, press 'Save As'. A file chooser dialog will pop up, and ask for a location and a name. The program will then save the file at your specified location and name. To save the file again, choose the same file name and location to save. The 'save' function will be implemented in the near future. Make sure to save before you exit the program, or you risk the loss of all your data. To ensure data security and stability, please DO NOT edit the file by opening it in another program. There is a risk of changing the file format, and this could cause severe data loss.

![Screenshot](https://heliotrope3n.github.io/employee-management-system/saveas.png)

Make sure you continuously save your file as you work, to ensure that there is no data loss. The developers are not responsible for any damages caused by using this program.

### Developers: <a name="subsaving"></a>

When a database is saved as, the hashtable data is stored in a text file with the suffix -[DO NOT EDIT].txt
The information is in the following format:

	employeeType/employeeNumber/firstName/lastName/sex/workLocation/deductionRate/yearlySalary/hourlyWage/hourPerWeek/weeksPerYear

Each attribute is separated with a / delimeter and each employee is stored on a new line.
Note: the format of the information stored is generic for all employee types. any information that is not associated with a specific employee type will be saved as null (i.e. for a line that stores a full time employee, the attributes for hourlyWage, hoursPerWeek, and weeksPerYear will be saved as null).

Opening this file can help with debugging, and finding out what went wrong. You can also manually change the data in the file, but be careful to not modify the structure.

![Screenshot](https://heliotrope3n.github.io/employee-management-system/archive.png)

# Opening <a name="opening"></a>

Click on File > Open. This will pop up a confirmation dialog warning of the deletion of the current information is the new system is opened. Make sure to save the current data before opening a new system. A file chooser will pop up once you acknowledge the warning, and choose the file with the name that you saved last time. It will have a [DO NOT EDIT] appended to it. This action will open your file and load it into the system. Then, you are ready to do everything else like before: add, save, modify, etc.

Please make sure the file is of the correct type, and is compatible with the employee management system. This means that it must have been created with the system, and should have the [DO NOT EDIT] appended to the end of it.

![Screenshot](https://heliotrope3n.github.io/employee-management-system/open.png)

The home tab will be updates to display the file path of your archive file:

![Screenshot](https://heliotrope3n.github.io/employee-management-system/openedhome.png)

# Updating <a name="updating"></a>

To update the program to its latest version, click on Help > Check for Updates. This action will automatically update the system if one is found. If no updates are found, you will be informed of that. The updates button will only check once every instance. To check for updates again, please restart the program.

![Screenshot](https://heliotrope3n.github.io/employee-management-system/update.png)

# Customizing <a name="customizing"></a>

The program has a unique and special feature that will allow you to customize the program. Adding your own customizations means adding your favourite colours, company colours, or adding colours that are easy on the eye. Currently, only the background colour customizer is available, and others will be added in future updates.

![Screenshot](https://heliotrope3n.github.io/employee-management-system/preferences.png)

Currently, dark colours may hide text and that will hinder the operation of the program. In future updates, there will be an option for light colour text. For now, choose a lighter coloured background.

# Multiple Windows <a name="multiple-windows"></a>

To open another instance of the program, press File > New. This is a completely new instance, and is unaffected by the original instance. Use it to work on multiple files concurrently. In fact, there are virtually unlimited instances that can be opened. To test it, try holding down Ctrl+N for 10 seconds.

# Exiting <a name="exiting"></a>

To exit a window, click the X button on the top right. If you have multiple windows open and wish to exit all of them, go to File > Exit All Windows or press ctrl + shift + E. Please ensure that all your work is saved before you close, as it will not confirm your exit. This is to ensure a speedy and efficient exit.


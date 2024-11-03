---
  layout: default.md
  title: "User Guide"
  pageNav: 3
---

# NovaCare User Guide

NovaCare is a **desktop app for managing patients, optimized for use via a Line Interface** (CLI) while still having the benefits of a Graphical User Interface (GUI). 
If you can type fast, NovaCare can get your patient management tasks done faster than traditional GUI apps.
--------------------------------------------------------------------------------------------------------------------

## Table of Contents
- [How to use NovaCare](#how-to-use-novacare)
  - [Glossary](#glossary)
- [Quick start](#quick-start)
  - [Installation](#step-1-ensure-you-have-java-17-or-above-installed-in-your-computer-you-can-download-java-from-here)
  - Overview of features, target audience with friendly tone, have glossary to make sure they understand stuffs.
  - [How to run NovaCare](#step-3-run-the-application)
  - [Overview of GUI](#overview-of-gui)
  - [Get started with NovaCare](#get-started-with-novacare)
- [Features](#features)
- [FAQ](#faq)
- [Known issues](#known-issues)
- [Command summary](#command-summary)
  - [Person-related commands](#person-related-commands)
  - [Task-related commands](#task-related-commands)
  - [Other commands](#other-commands)
--------------------------------------------------------------------------------------------------------------------

## How to use NovaCare

This user guide is tailored for new and existing users of NovaCare. 


If you are new to NovaCare, we recommend you to start with the [Quick Start](#quick-start) section. 

If you are an existing user looking for a specific feature, you can jump to the [Features](#features) section or [Command Summary](#Command Summary) section.

### Glossary
As you read through the user guide, you may come across some terms that are unfamiliar to you. Here is a glossary of terms that you may encounter:

| Term    | Definition                                                                                                                                      |
|---------|-------------------------------------------------------------------------------------------------------------------------------------------------|
| **JAR** | A Java ARchive (JAR) is a package file that compresses many Java files into a single executable file used for Java applications.                |
| **CLI** | A Command Line Interface (CLI) is a text-based interface used to interact with software using text commands.                                    |
| **Parameter** | A parameter is the text that is passed to a software to perform a specific action.                                                              |
| **GUI** | A Graphical User Interface (GUI) is a visual interface that allows users to interact with software using graphical icons and indicators.        |
| **Command** | A command is an input action given to the software to perform a specific action.                                                                |
| **Index** | An index is a unique number assigned to each item in a GUI list to identify and reference the item.                                             |
| **Tag** | A tag is a label that is assigned to a patient to take note of their medical conditions.                                                        |
| **Priority Level** | A priority level is a value assigned to a patient to indicate the urgency of their medical condition. 1 meaning critical 3 meaning non critical |
| **[word]** | Words in square brackets are optional parameters that can be included in the command.                                                           |

### 
> [!NOTE]  
> Additional information that help you understand more about Commands.

> [!TIP]
> Provide tips to help users understand the command usage better.

> [!WARNING]
> Warns you about potential errors that you may face when using the NovaCare.
--------------------------------------------------------------------------------------------------------------------


## Quick start

This section provides a quick overview of how to set up and run NovaCare on your computer.

### Step 1. Ensure you have Java `17` or above installed in your Computer. You can download Java from [here](https://www.oracle.com/java/technologies/downloads/#java17).

For **Windows** users, you can type **Command Prompt** in the search bar. 
Type `java -version` to check if you have Java installed.
Upon successful installation, you should see something like this:
![Windows Java](images/windows-java.png)

For **Mac/Linux** users, you can type **Terminal** in the search bar.
Type `java -version` to check if you have Java installed.
Upon successful installation, you should see something like this:
![Mac Java](images/mac-java.png) 

### Step 2. Download NovaCare from [here](https://github.com/AY2425S1-CS2103T-F15-1/tp/releases).
1. Download the `NovaCareApp.jar` file from the link provided by scrolling down to Assets as shown below.
   ![Assets](images/assets.png)
2. Click on the `NovaCareApp.jar` file to download it.
3. Upon downloading save the app to your preferred location. (e.g. `Desktop`)

### Step 3. Run the application
1. Open `Command Prompt` for Windows users or `Terminal` for Mac/Linux users.
2. Navigate to the preferred location where you saved the `NovaCareApp.jar` file. <br>
> e.g. `cd Desktop`
3. Run the application by typing <br>
> `java -jar NovaCareApp.jar`.

Upon successful execution, you should see the GUI of NovaCare covered in the next section.

## Overview of GUI

The GUI is broken down into different **sections** as shown in the image below:
![GUI Overview](images/GUIOverview.png)
1. Command Box: This is where you can type your commands to interact with the application.
2. Result Display Box: Displays the result of commands.
3. Patient List: Displays all the patients in the application.
4. Task List: Displays all the task for all patients.
5. Menu Bar: Contains the `File` and `Help` menu. (to exit or view the help menu)

## Get started with NovaCare
Here will be a basic guide on how to use the application.
1. **Launch help guide**:
   * Type the command in the command box and press Enter to view help window:
      > `help` 

2. **Clear all entries**:
   * Type the command in the command box and press Enter to clear all entries:
      > `clear`

3. **Add a patient**:
   * Type the command in the command box and press Enter to add a person:
      > `add n/Johnson p/98765432 e/johnson123@gmail.com a/123, Clementi Rd, 1234665 t/diabetes`

4. **Edit patient information**:
   * Type the command in the command box and press Enter to edit a patients's information:
      > `edit 1 p/91234567`

5. **Delete a patient**:
   * Type the command in the command box and press Enter to delete a patient:
      > `delete 1`

6. Add a task
    * Type the command in the command box and press Enter to add a task to the patient:
        > `addtask 1 d/Eat paracetamol 1000mg`

1. Refer to the [Features](#features) below for details of each command.

--------------------------------------------------------------------------------------------------------------------

## Features

<box type="info" seamless>

**Notes about the command format:**<br>

* Words in `UPPER_CASE` are the parameters to be supplied by the user.<br>
  e.g. in `add n/NAME`, `NAME` is a parameter which can be used as `add n/John Doe`.

* Items in square brackets are optional.<br>
  e.g `n/NAME [t/TAG]` can be used as `n/John Doe t/friend` or as `n/John Doe`.

* Items with `…`​ after them can be used multiple times including zero times.<br>
  e.g. `[t/TAG]…​` can be used as ` ` (i.e. 0 times), `t/friend`, `t/friend t/family` etc.

* Parameters can be in any order.<br>
  e.g. if the command specifies `n/NAME p/PHONE_NUMBER`, `p/PHONE_NUMBER n/NAME` is also acceptable.

* Extraneous parameters for commands that do not take in parameters (such as `help`, `list`, `exit` and `clear`) will be ignored.<br>
  e.g. if the command specifies `help 123`, it will be interpreted as `help`.

* If you are using a PDF version of this document, be careful when copying and pasting commands that span multiple lines as space characters surrounding line-breaks may be omitted when copied over to the application.
</box>

### Viewing help : `help`

Shows a message explaning how to access the help page.

![help message](images/helpMessage.png)

Format: `help`


### Adding a person: `add`

Adds a person to the address book.

Format: `add n/NAME p/PHONE_NUMBER e/EMAIL a/ADDRESS [t/TAG]…​`

<box type="tip" seamless>

**Tip:** A person can have any number of tags (including 0)
</box>

Examples:
* `add n/John Doe p/98765432 e/johnd@example.com a/John street, block 123, #01-01`
* `add n/Betsy Crowe t/friend e/betsycrowe@example.com a/Newgate Prison p/1234567 t/criminal`

### Listing all persons : `list`

Shows a list of all persons in the address book.

Format: `list`

### Editing a person : `edit`

Edits an existing person in the address book.

Format: `edit INDEX [n/NAME] [p/PHONE] [e/EMAIL] [a/ADDRESS] [t/TAG]…​`

* Edits the person at the specified `INDEX`. The index refers to the index number shown in the displayed person list. The index **must be a positive integer** 1, 2, 3, …​
* At least one of the optional fields must be provided.
* Existing values will be updated to the input values.
* When editing tags, the existing tags of the person will be removed i.e adding of tags is not cumulative.
* You can remove all the person’s tags by typing `t/` without
    specifying any tags after it.

Examples:
*  `edit 1 p/91234567 e/johndoe@example.com` Edits the phone number and email address of the 1st person to be `91234567` and `johndoe@example.com` respectively.
*  `edit 2 n/Betsy Crower t/` Edits the name of the 2nd person to be `Betsy Crower` and clears all existing tags.

### Locating persons by name: `find`

Finds persons whose names contain any of the given keywords.

Format: `find KEYWORD [MORE_KEYWORDS]`

* The search is case-insensitive. e.g `hans` will match `Hans`
* The order of the keywords does not matter. e.g. `Hans Bo` will match `Bo Hans`
* Only the name is searched.
* Only full words will be matched e.g. `Han` will not match `Hans`
* Persons matching at least one keyword will be returned (i.e. `OR` search).
  e.g. `Hans Bo` will return `Hans Gruber`, `Bo Yang`

Examples:
* `find John` returns `john` and `John Doe`
* `find alex david` returns `Alex Yeoh`, `David Li`<br>
  ![result for 'find alex david'](images/findAlexDavidResult.png)

### Deleting a person : `delete`

Deletes the specified person and tasks associated to that person from the address book.

Format: `delete INDEX`

* Deletes the person and task associated to that person at the specified `INDEX`.
* The index refers to the index number shown in the displayed person list.
* The index **must be a positive integer** 1, 2, 3, …​

Examples:
* `list` followed by `delete 2` deletes the 2nd person in the address book.
* `find john doe` followed by `delete 1` deletes the 1st person in the results of the `find` command.

### Adding a task : `addtask`

Adds a task to a person in the address book.

Format: `addtask INDEX d/DESCRIPTION`

* Adds a task at the specified `INDEX`.
* The index refers to the index number shown in the displayed person list.
* The index **must be a positive integer** 1, 2, 3, …​

Examples:
* `list` followed by `addtask 2 d/Eat paracetamol 1000mg` adds a task to the 2nd person in the address book.
* `find John doe` followed by `addtask 1 d/Clear diapers` deletes the 1st person in the results of the `find` command.
![Person List](images/PersonListExample.png)
![Task List](images/TaskListExample.png)

### Deleting a task : `deletetask`

Deletes a task to a person in the address book.

Format: `deletetask INDEX`

* Deletes a task at the specified `INDEX`.
* The index refers to the index number shown in the displayed person list.
* The index **must be a positive integer** 1, 2, 3, …​

Examples:
* `deletetask 1` deletes the 1st task in the task list.

### Adding emergency contact : `emergency`

Adds an emergency contact and details to a person in the address book.

Format: `emergency INDEX n/EMERGENCY_CONTACT_NAME p/EMERGENCY_CONTACT_NUMBER`

* Adds an emergency contact and details at the specified `INDEX`.
* The index refers to the index number shown in the displayed person list.
* The index **must be a positive integer** 1, 2, 3, …​

Examples:
* `emergency 1 n/tom tan p/91237171` adds an emergency contact `tom tan` with contact number `91237171` to 1st index in person list.

### Deleting emergency contact : `delemergency`

Delets an emergency contact and its details from a person in the address book.

Format: `delemergency INDEX

* Deletes an emergency contact and its details at the specified `INDEX`.
* The index refers to the index number shown in the displayed person list.
* The index **must be a positive integer** 1, 2, 3, …​

Examples:
* `delemergency 1` deletes the emergency contact of the 1st indexed person in the patient list.

### Adding priority level : `priority`

Adds an priority level to a person in the address book.

Format: `priority /id INDEX /level PRIORITY_LEVEL`

* Adds a priority level at the specified `INDEX`.
* The index refers to the index number shown in the displayed person list.
* The index **must be a positive integer** 1, 2, 3, …​
* The priority level **must be a positive integer** and only from **1, 2, 3**

Examples:
* `priority /id 1 /level 2` adds priority level `2` to 1st index in person list.

### Deleting priority level : `deletelevel`

Delete a priority level to a person in the address book, resetting it to the default value **3**.

Format: `deletelevel INDEX`

* Delete the current priority level at the specified `INDEX`.
* The index refers to the index number shown in the displayed person list.
* The index **must be a positive integer** 1, 2, 3, …​

Examples:
* `deletelevel 1` deletes priority level of the 1st indexed person in the patient list.

### Mark Task : `marktask`

Marks a task at a specific index.

Format: `marktask INDEX`

* Marks a task at the specified `INDEX`.
* The index refers to the index number shown in the displayed Task list.
* The index **must be a positive integer** 1, 2, 3, …​

Examples:
* `marktask 1` marks a task of the 1st index in task list.

### Clearing all entries : `clear`

Clears all patient and tasks entry from NovaCare.

Format: `clear`

### Exiting the program : `exit`

Exits the program.

Format: `exit`

### Saving the data

AddressBook data are saved in the hard disk automatically after any command that changes the data. There is no need to save manually.

### Editing the data file

AddressBook data are saved automatically as a JSON file `[JAR file location]/data/addressbook.json`. Advanced users are welcome to update data directly by editing that data file.

<box type="warning" seamless>

**Caution:**
If your changes to the data file makes its format invalid, AddressBook will discard all data and start with an empty data file at the next run.  Hence, it is recommended to take a backup of the file before editing it.<br>
Furthermore, certain edits can cause the AddressBook to behave in unexpected ways (e.g., if a value entered is outside the acceptable range). Therefore, edit the data file only if you are confident that you can update it correctly.
</box>

### Archiving data files `[coming in v2.0]`

_Details coming soon ..._

--------------------------------------------------------------------------------------------------------------------

## FAQ

**Q**: How do I transfer my data to another Computer?<br>
**A**: Install the app in the other computer and overwrite the empty data file it creates with the file that contains the data of your previous AddressBook home folder.

--------------------------------------------------------------------------------------------------------------------

## Known issues

1. **When using multiple screens**, if you move the application to a secondary screen, and later switch to using only the primary screen, the GUI will open off-screen. The remedy is to delete the `preferences.json` file created by the application before running the application again.
2. **If you minimize the Help Window** and then run the `help` command (or use the `Help` menu, or the keyboard shortcut `F1`) again, the original Help Window will remain minimized, and no new Help Window will appear. The remedy is to manually restore the minimized Help Window.

--------------------------------------------------------------------------------------------------------------------

## Command summary

### Person-related commands:
| Action                    | Format Examples                                                                                                                                          |
|---------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------|
| **Add**                   | `add n/NAME p/PHONE_NUMBER e/EMAIL a/ADDRESS [t/TAG] ` <br> e.g., `add n/James Ho p/94391857 e/jamesho@gmail.com a/123, Clementi Rd, 1234665 t/diabetes` |
| **Edit**                  | `edit INDEX [n/NAME] [p/PHONE] [e/EMAIL] [a/ADDRESS] [t/TAG]` <br> e.g., `edit 1 p/91234567 e/john13432@gmail.com`                                       |
| **Change Priority**       | `priority /id INDEX /level PRIORITY_LEVEL` <br> e.g., `priority /id 1 /level 2`                                                                          |
| **Delete Priority**       | `priority deletelevel INDEX` <br> e.g., `deletelevel 1`                                                                                                  |
| **Add Emergency Contact** | `emergency INDEX n/EMERGENCY CONTACT NAME p/EMERGENCY CONTACT NUMBER` <br> e.g., `emergency 1 n/tom tan p/91237171`                                      |
| **Delete Emergency Contact** | `delemergency INDEX` <br> e.g., `delemergency 1`                                                                                                        |
| **List**                  | `list`                                                                                                                                                   |
| **Delete**                | `delete INDEX`<br> e.g., `delete 3`                                                                                                                      |
| **Find**                  | `find KEYWORD [MORE_KEYWORDS]`<br> e.g., `find John`                                                                                                     |
| **Clear**                 | `clear`                                                                                                                                                  |


### Task-related commands:
| Action              | Format, Examples                                                                   |
|---------------------|------------------------------------------------------------------------------------|
| **Add Task**        | `addtask INDEX d/TASK_DESCRIPTION` <br> e.g., `addtask 1 d/Eat paracetamol 1000mg` |
| **Delete Task**     | `deletetask INDEX`<br> e.g., `deletetask 1`                                        |
| **Find Task**       | `findtask INDEX`<br> e.g., `findtask 1`                                            |
| **List Task**       | `listtask`                                                                         |
| **Mark Task**       | `marktask INDEX`<br> e.g., `marktask 1`                                            |
| **List Incomplete** | `listincomplete`                                                                   |
### Other commands:
| Action                | Format, Examples       |
|-----------------------|------------------------|
|**Help**               | `help`                 |
|**Exit**               | `exit`                 |
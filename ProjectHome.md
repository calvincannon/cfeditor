# What is the cfeditor? #
cfeditor stays for configuration editor and is designed for the System Administrator. It is implemented as an Eclipse plugin. More about Eclipse platform: http://www.eclipse.org

Using the cfeditor, system administrators can create the structured projects, check the syntax, use the Version Control system to manage the project changes, and others... Currently, the list of the Configuration Management Engines includes:
  * cfengine version 3 (more about cfengine: http://www.cfengine.org)


# Why do we need it? #
To provide the [Integrated development environment (IDE)](http://en.wikipedia.org/wiki/Integrated_development_environment) for System Administrators (primary for the Linux System Administrators) to create the projects for the Configuration Management Engines.

The main purpose is to reduce the gap between software development and the system administration, and provide the useful interface to the System Configuration Engine, by using the rich Eclipse platform functionality.

Can be useful for the system administrators, which are newcomers to the Configuration Management Platform (currently cfengine version 3) language syntax. And also to provide the way to make a system administration tasks structure similar to the software development projects.

# How to get it? #

---

## for Eclipse Juno ##
**PREREQUISITES:
  * Install a JDK or JRE -- the minimum required version is 5.0.
    * http://wiki.eclipse.org/PDT/Installation#Install_a_JVM
  * Download and unpack the Eclipse (minimal package get less time to download) for example
    * http://www.eclipse.org/downloads/packages/eclipse-testers/junosr1**


**INSTALLATION:
  * start eclipse Juno
  * go to Help->Install New Software
  * click the Add button and enter as location:
    * http://svn.codespot.com/a/eclipselabs.org/cfeditor/branches/juno/updatesite/
  * click Ok
  * select Cfeditor
  * click on Next and follow the instructions of the wizard
  * restart Eclipse**


---

## for Eclipse Helios ##
**PREREQUISITES:
  * Install a JDK or JRE -- the minimum required version is 5.0.
    * http://wiki.eclipse.org/PDT/Installation#Install_a_JVM
  * Download and unpack the Platform Runtime Binary
    * http://www.eclipse.org/downloads/packages/eclipse-classic-362/heliossr2**<a href='Hidden comment: 
* http://www.eclipse.org/downloads/moreinfo/custom.php
http://download.eclipse.org/eclipse/downloads/drops/R-3.6-201006080911/index.php#PlatformRuntime
'></a>

**INSTALLATION:
  * start eclipse helios
  * go to Help->Install New Software
  * click the add button and enter "http://svn.codespot.com/a/eclipselabs.org/cfeditor/tags/0.2/updatesite/" as location
  * click ok
  * select Cfeditor
  * click on Next and follow the instructions of the wizard**


---

# Our presentation #
  * [release 0.2](http://code.google.com/a/eclipselabs.org/p/cfeditor/downloads/detail?name=cfeditor110315.pdf&can=2&q=)

# It is useful #
  * To use the Version control System to manage changes for the System Administration Project.  The Subversive Project can be used for this (http://www.eclipse.org/subversive/downloads.php).
# HybridFreamworkCucumberPOM
Test Driven Developement(TDD) Vs Behavior Driven Developement(BDD)
Test Case ----Test Class---xml---Report -----(TDD TestNG)
feature File---Step Defination File----Test Runner---(BDD-Cucumber)

BDD tools - Cucumber, Spaceflow
ItteleJ,Eclips === Editor

Functional Test Case-------TDD(Uderstandable by Only Technical People)
TestNG

Acceptance Test Case------BDD.(Easily uderstandable by Non Technical & Technical People)
Cucumber 

(BDD-To filled the gap between Technical(IT) & Non Tecnical Pepoles(NonIT))

Large Requirement =Epic
Small Requirement =Stories
Product Manager Responsible for Writing Epic or Stories From the Customer.
Product Manager = Non Technical
Dev & QA = Technical 

*Cucumber is a BDD Freamwork by which we can automate UAT Test case. It Support BDD Approch.

Gherkin---->

1)Feature File- is an Entry Point in Cucumber.
Name Can be Anything but extension shouuld be feature
Here we write Steps (Scenarios in simple English Language)
Feature File Can Create By Anyone, PM,BA,DEV,QA

2)Step Defination----Java class
Here we write Methods(Selenium code write inside the methods) For Scenarios
We Cannot Miss any steps in Feature File
Whatever the steps implemented in Feature File All Method should be implements in Step Defi
nation File)It will not allow to miss/ leave any one of the steps.
Step Defination File is like a Technical Part Like TestNG.

3)Test Runner class ----------To Run Step Defination File.
If U have Multiple Feature File then u have to create Test Runner class.
This is main Class. This is Basically JUnit class.

Feature -Followed by :
Scenario-Followed by :
Given--Prerequesities
When---Action
Then---Outcome 
And--Contineous of Then.

Exa:
1)Feature File
Feature :Bitbatua Login
Scenario:Logo Presence on Bitbatua Home Page.
Given I launch chrome browser
When  I Open Bibtatua HomePage
Then  I Verify that the logo Present on Page
And   Close Browser

2)Step Defination File
Run Feature File.

3)TestRunner
@Runwith(cucumber.class) ---Parameter
@CucumberOption (features="Path of Feature File"
                glue="Package Name stepDefination")
DryRUN--If u take Dryrun=True
It will cross check whether every steps is having corrosponding methods implemented or not.

MonoChrome= true
It will Remove Unnecessary Character From console window.
It will give clear output in your Console Window.
Make Sure while Running our POM.xlm file 
Cucumber-core
Cucumber-java
Cucumber-Junit Should be same Version

Background:If their are some common steps in every Scenario we can also separate them into 
Scenario Background.
Scenari Background is one more section where we can Specify the common Steps instead of writting
thease steps every time i can separate those steps in Scenario Background.

**If u want to Run Multiple features files(If u have 10 feature file and run all 10 features file)
Then (features=".//Features/",)
**If u want to Run only 1 out of 10.
Then ( features=".//Features//CreateBusinessAccount.feature",)
**If u want to Run only 2 out of 10
Then    features={".//Features//CreateBusinessAccount.feature",".//Features//Login.feature"}
Same for the Step Defination

Selenium= we have 2 types of wait 1)Explecit wait 2)Implicite wait
Implicit wait- which is applicable for all the element int the same class
Explecit wait - is specific to element
Explecit Wait is conditional Based Not a time Based.
Under utility we create one helper class- Class Name WaitHelper



------------------------------------------------------------------------------------------
Hybrid Freamwork Coocumber with Java.
1)Download Java+Eclips 
2)Create 1 Maven Project
3)Update POM.XML
a)Cucumber-core -------------- io.cucumber
b)Cucumber-html -------------- io.cucumber
c)Cucumber-java -------------- io.cucumber
d)Cucumber-junit
e)Cucumber-jvm-deps
f)Cucumber-reporting
g)Hamcrest.core
h)Gherkin 
i)Junit
i)log4j
j)Selenium.java
k)Cobertura Code Coverage ----------net.sourceforge.cobertura » cobertura
4)Tools Mvn Sun
5)we need to add Cucumber plugin for Eclips from Help--->Market Place
  Search For Cucumber 
           Natrual
           Cucumber Eclips Plugins
           
**Create Folder Structure
features(Folder)
Page Objects(Package)
StepDefination(Package)
TestRunner(Package)
Utility(Package)
Driver(Folder)
Target(Reports)
Pom.xml
------------------------------------------
**Copy Drivers in Driver Folder
--------------------------------------
**Automating Login Test Case
1.Create login.feature Under Feature File Folder 
2.Create Page Objects Class LoginPage.java Under Page Objects Package
Page Objects class contains the one constructor , Driver & Every page elements which is presents on the webpage
3.Create Steps.java Under StepDefination Package implement Required methods.
4.Create TestRunner.java Under MyRunner Package.

**Automating Create Business Account
1.Create CreateBusinessAccount.feature Under Feature File Folder
2.Create Page Objects Class CreateBusinessAccount.java Under Page Objects Package.
3.Add step.java Under Step Defination Package and implement Required method.
4.Create TestRunner.java Under MyRunner Package.

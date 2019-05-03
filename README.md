# Project02
Candace, Kyle, Rico, and Sal Project02

Name: Project MEI 

Team:
Revature:

Candace
Kyle
Rico
Sal

----------------------------------------------------------------------------
Goal: 
  Develop a dashboard intended for use by those in higher education.
  
User stories include:

  General: Login/Logout, Scheduler, Registration
  Student: Check professor schedule, impose on proffessor schedule, Check Advisor schedule, Impose on Advisor Schedule, choose a major
  Proffessor: Impose on student Schedule, class creation
  Admin (Dean): Class creation and approval of classes
  Advisor: Approve of and manipulate schedule imposements. 

Stretch goals:
  
  E-mail based registry
  
Technologies:
  Front end: Angular 7
  Back end: Java w/Hibernate & Jenkins
  Database: JDBC AWS Server (RDS)
  GitBash: Git Hub
  Documentation: Google Chrome
  
Workflow:
Agile 
Sprint 1: TBA
-----------------------------------------------------------------------------
DB Heriarchy:
Field
  Has a Student: 
    Has many classes
        has a Proffessor
        
Field 
  Has a Dean
  Has an advisor

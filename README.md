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
  
User stories(full sentences) include:
  Student:
    a student should be able to login.
    a student should be able to view their schedule.
    a student should be able to view their grades.
    a student should be able to make appointments to see an advisor or professor.
    a student should be able to register for classes.
    a student should be able to request a major(to be approved or denied by admin).
    a student should be able to ...
    a student should be able to logout.
   
  Professor:
    a professor should be able to login.
    a professor should be able to view their schedule.
    a professor should be able to set their appointment availability.
    a professor should be able to create assignments.
    a professor should be able to create classes.
    a professor should be able to input grades for assignments.
    a professor should be able to ...
    a professor should be able to logout.
    
  Advisor:
    an advisor should be able to login.
    an advisor should be able to view their schedule.
    an advisor should be able to set their appointment availability.
    an advisor should be able to send a message(maybe via email) to students
    an advisor should be able to ...
    an advisor should be able to logout.
    
  Admin:
    an admin should be able to login.
    an admin should be able to approve/deny major change requests.
    an admin should be able to change all schedules(essentially has override permission)(this can be split into a lot of stories).
    an admin should be able to ...
    an admin should be able to logout.
  
  General: Login/Logout, Scheduler, Registration
  Student: Check professor schedule, impose on proffessor schedule, Check Advisor schedule, Impose on Advisor Schedule, choose a major
  Proffessor: Impose on student Schedule, class creation
  Admin (Dean): Class creation and approval of classes
  Advisor: Approve of and manipulate schedule imposements. 

Stretch goals:
  an advisor should be able to send a message(maybe via email) to students
  E-mail based registry
  
Technologies:
  Front end: Angular 7
  Back end: Java w/Hibernate & Jenkins
  Database: JDBC AWS Server (RDS)
  Host: AWS EC2
  GitBash: Git Hub
  Documentation: Google Chrome
  API: Google Calendar
  
Workflow:
Agile 
Sprint 1: TBA
-----------------------------------------------------------------------------


DB Heriarchy:
Field
  Has a Student: 
    Has many Courses
        has a Proffessor
        
Field 
  Has a Dean
  Has an advisor

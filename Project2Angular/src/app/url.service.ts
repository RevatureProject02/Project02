import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UrlService {
  public base: string = "http://localhost:8085/Project2/";
  public addCourse: string = this.base + "course/add/";
  //public delete: string = this.base + "delete/";
  public showCourses: string = this.base + "course/all/";
  public addMeeting: string = this.base + "meeting/add/";
  public showMeetings: string = this.base + "meeting/all/";

<<<<<<< HEAD
  public getProfessors: string = this.base + "professor/all";

  public addAdmin: string = this.base + "administrator/add/"
  public getAdmin: string = this.base + "administrator/all/"
  
=======
  public addAdmin: string = this.base + "administrator/add/"
  public getAdmin: string = this.base + "administrator/all/"
  public adminLogin: string = this.base + "administrator/login"
>>>>>>> d6c0d9386b96ddbd20c09ce26fcf6de445e11b8a

  //Student methods
  public addStudent: string = this.base + "student/add";
  public showStudents: string = this.base + "student/all";
  public studentLogin: string = this.base + "student/login";

<<<<<<< HEAD
  //Professor methods
  public addProfessor: string = this.base + "Professor/add";
  public showProfessors: string = this.base + "professor/all";

  //Logins
  public advisorLogin: string = this.base + "advisor/Login";
  public profLogin: string =  this.base + "professor/login";
  public studentLogin: string = this.base + "student/login";
  public adminLogin: string = this.base + "administrator/login";
=======
  //advisor
  public advisorLogin: string = this.base + "advisor/login";

  //professor
  public profLogin: string = this.base + "professor/login";
  public getProfessors: string = this.base + "professor/all";
>>>>>>> d6c0d9386b96ddbd20c09ce26fcf6de445e11b8a
  constructor() { }
}
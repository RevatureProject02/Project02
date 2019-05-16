import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UrlService {
  public base: string = "http://localhost:8085/Project2/";
  //public delete: string = this.base + "delete/";
  public showCourses: string = this.base + "course/all/";
  public showCoursesOfStudents: string = this.base + "student/courseList";
  public addMeeting: string = this.base + "meeting/add/";
  public showMeetings: string = this.base + "meeting/all/";;
  


  public getProfessors: string = this.base + "professor/all";

  public addAdmin: string = this.base + "administrator/add/"
  public getAdmin: string = this.base + "administrator/all/"
  
  public adminLogin: string = this.base + "administrator/login"

  //Student methods
  public addStudent: string = this.base + "student/add";
  public showStudents: string = this.base + "student/all";
  public studentLogin: string = this.base + "student/login";
  public showGrades: string = this.base + "student/grades";

  //Professor methods
  public addProfessor: string = this.base + "professor/add";
  public showProfessors: string = this.base + "professor/all";

  //Logins
  public advisorLogin: string = this.base + "advisor/Login";
  public profLogin: string =  this.base + "professor/login";
  public login: string = this.base + "/loginController/login"
  //advisor
  public allAdvisors: string = this.base + "advisor/allAdvisors/";
  public findAdvisor: string = this.base + "advisor/advisorById/";
  public newAdvisor: string = this.base + "advisor/addAdvisor/";
  public deleteAdvisor: string = this.base +"advisor/delete/{id}";

  //professor

  //Courses
  public addCourse: string = this.base + "course/add/";
  public deleteCourse: string = this.base + "course/delete/{id}/";
  public updateCourse: string = this.base + "course/update/";
  public addNewCourse: string = this.base + "student/addCourse";

  constructor() { }
}
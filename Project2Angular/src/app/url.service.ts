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
  public addAdmin: string = this.base + "administrator/add/"
  public getAdmin: string = this.base + "administrator/all/"
  
=======
<<<<<<< HEAD
  //Student methods
  public addStudent: string = this.base + "student/add";
  public showStudents: string = this.base + "student/all";

  
=======
  public getProfessors: string = this.base + "professor/all"
>>>>>>> 1ff5da1adb6f2a8b4a2619ef60c3c5dcc054fe1d

>>>>>>> 6be0e6b906ea27896959437cc7c14f1ce5973178
  constructor() { }
}
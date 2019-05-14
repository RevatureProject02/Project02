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
  //Student methods
  public addStudent: string = this.base + "student/add";
  public showStudents: string = this.base + "student/all";

  

  constructor() { }
}

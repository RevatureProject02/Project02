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
  public allAdvisors: string = this.base + "advisor/allAdvisors/";
  public findAdvisor: string = this.base + "advisor/advisorById/";
  public newAdvisor: string = this.base + "advisor/addAdvisor/";
  public deleteCourse: string = this.base + "course/delete/{id}/";
  public updateCourse: string = this.base + "course/update/";
  


  constructor() { }
}
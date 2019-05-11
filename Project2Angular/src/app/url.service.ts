import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UrlService {
  public base: string = "http://localhost:8085/Project2/";
  public addCourse: string = this.base + "course/add";
  public delete: string = this.base + "delete/";

  constructor() { }
}

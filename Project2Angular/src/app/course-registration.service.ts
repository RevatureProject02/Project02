import { Injectable } from '@angular/core';
import { Course } from './course';
import { HttpErrorResponse } from '@angular/common/http/src/response';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { UrlService } from './url.service';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CourseRegistrationService {

  headers = new HttpHeaders();

  constructor(private http: HttpClient, private url: UrlService) {
    this.headers.append("Content-Type", "application/json");
  }
    getCourses(): Observable<any> {
      return this.http.get(this.url.showCourses, {responseType: "text", headers: this.headers});
  
    }
   
}

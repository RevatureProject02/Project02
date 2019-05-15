import { Injectable } from '@angular/core';
import { HttpHeaders, HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Course } from './course';
import { UrlService } from './url.service';

@Injectable({
  providedIn: 'root'
})
export class CourseService {

  headers = new HttpHeaders();

  constructor(private http: HttpClient, private url: UrlService) { 
  this.headers.append('Content-Type', 'application/json');
  }
  
  insertCourse(c: Course): Observable<any> {
    return this.http.post(this.url.addCourse, c, {headers: this.headers});
  }

  showCourses(): Observable<any>{
    return this.http.get(this.url.showCourses, {responseType: "text", headers: this.headers });
  }

  showCoursesOfStudent(name): Observable<any>
  {
    return this.http.get(this.url.showCoursesOfStudents, {responseType: 'text', headers: this.headers});
  }
}

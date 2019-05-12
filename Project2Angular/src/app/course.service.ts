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

  getCourses(): Observable<any> {
    return this.http.get(this.url.base, { responseType: "text", headers: this.headers });
  }

  
  insertCourse(c: Course): Observable<any> {
    return this.http.post(this.url.base, c, {headers: this.headers});
  }
}

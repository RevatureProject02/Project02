import { Injectable } from '@angular/core';
import { HttpHeaders, HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Student } from './student'
import { UrlService } from './url.service';
@Injectable({
  providedIn: 'root'
})
export class ViewGradesService 
{
  headers = new HttpHeaders();

  constructor(private http: HttpClient, private url: UrlService) 
  { 
  this.headers.append('Content-Type', 'application/json');
  }
  
  insertStudent(s: Student): Observable<any> {
    return this.http.post(this.url.addStudent, Student, {headers: this.headers});
  }

  showStudents(): Observable<any>{
    return this.http.get(this.url.showStudents, {responseType: "text", headers: this.headers });
  }
}

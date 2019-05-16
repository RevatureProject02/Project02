import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { UrlService } from './url.service';
import { Observable } from 'rxjs';
import { Course } from './course';
import { Student } from './student';

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  headers = new HttpHeaders();
  
  constructor(private http: HttpClient, private url: UrlService, private student:Student, private course:Course) { 
    this.headers.append('Content-Type', 'application/json');
    
    }

    getStudents(): Observable<any>{
      return this.http.get(this.url.showStudents, {responseType: "text", headers: this.headers });
    }

    getGrades(): Observable<any>
    {
    return this.http.get(this.url.showGrades,{responseType: "text",headers: this.headers});
    }

    
}

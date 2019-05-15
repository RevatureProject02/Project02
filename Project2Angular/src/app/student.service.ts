import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { UrlService } from './url.service';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  headers = new HttpHeaders();
  
  constructor(private http: HttpClient, private url: UrlService) { 
    this.headers.append('Content-Type', 'application/json');
    }

    getProfessors(): Observable<any>{
      return this.http.get(this.url.showStudents, {responseType: "text", headers: this.headers });
    }
}

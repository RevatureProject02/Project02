import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { UrlService } from './url.service';
import { Observable } from 'rxjs';
import { Professor } from './professor';

@Injectable({
  providedIn: 'root'
})
export class ProfessorService {

  headers = new HttpHeaders();
  
  constructor(private http: HttpClient, private url: UrlService) { 
    this.headers.append('Content-Type', 'application/json');
    }

    getProfessors(): Observable<any>{
      return this.http.get(this.url.showProfessors, { responseType: "text", headers: this.headers });
    }

    addProfessor(p: Professor): Observable<any>{
      return this.http.post(this.url.addProfessor, p, {headers: this.headers});
    }
}
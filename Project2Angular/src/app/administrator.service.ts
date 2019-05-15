import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { UrlService } from './url.service';
import { Administrator } from './administrator';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AdministratorService {

  headers = new HttpHeaders();

  constructor(private http: HttpClient, private url: UrlService) {
    this.headers.append('content type', 'application/json');
   }
   
   getAdministrator(): Observable<any> {
     return this.http.get(this.url.getAdmin, {responseType: "text", headers: this.headers});
   }

   addAdministrator(a: Administrator): Observable<any>{
     return this.http.post(this.url.addStudent, a, {headers: this.headers})
   }
}

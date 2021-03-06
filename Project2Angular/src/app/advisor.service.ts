import { Injectable } from '@angular/core';
import { HttpHeaders, HttpClient } from '@angular/common/http';
import { UrlService } from './url.service';
import { Observable } from 'rxjs';
import { Advisor } from './advisor';
import { headersToString } from 'selenium-webdriver/http';


@Injectable({
  providedIn: 'root'
})
export class AdvisorService {

  headers = new HttpHeaders();

  constructor(private http: HttpClient, private url: UrlService) {
    this.headers.append('Content-Type', 'application/json');
   }
  
   getAdvisors(): Observable<any>{
     return this.http.get(this.url.allAdvisors, { responseType: "text", headers: this.headers });
   }
   addAdvisor(a: Advisor): Observable<any>{
     return this.http.post(this.url.newAdvisor, a, {headers: this.headers});
   }

   

  //  deleteAdvisor(): Observable<any>{
  //    return this.http.delete(this.url.deleteAdvisor )
  //  }
}

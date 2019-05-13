import { Injectable } from '@angular/core';
import { HttpHeaders, HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Meeting } from './meeting'
import { UrlService } from './url.service';

@Injectable({
  providedIn: 'root'
})
export class MeetingService {

  headers = new HttpHeaders();

  constructor(private http: HttpClient, private url: UrlService) { 
  this.headers.append('Content-Type', 'application/json');
  }
  
  insertMeeting(m: Meeting): Observable<any> {
    return this.http.post(this.url.addMeeting, m, {headers: this.headers});
  }

  showMeetings(): Observable<any>{
    return this.http.get(this.url.showMeetings, {responseType: "text", headers: this.headers });
  }
}
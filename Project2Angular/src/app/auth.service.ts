import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { UrlService } from './url.service';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  headers = new HttpHeaders();
  private loggedInStatus = false;

  constructor(private http: HttpClient, private url: UrlService) {
    this.headers.append('Content-Type', 'application/json')
  }

  setLoggedIn(value: boolean) {
    this.loggedInStatus = value;
  }

  get isLoggedIn() {
    return this.loggedInStatus
  }

  getUserDetails(username, password, role) {
    if (role == "admin") {
      return this.http.post<any>(this.url.login, {
        username, password, role
      })
    } else if (role == "advisor") {
      return this.http.post<any>(this.url.login, {
        username, password, role
      })
    } else if (role == "professor") {
      return this.http.post<any>(this.url.login, {
        username, password, role
      })
    } else if (role == "student") {
      return this.http.post<any>(this.url.login, {
        username, password, role
      })
    } else {
      console.log(" Invalid role selected")
    }
  }
}




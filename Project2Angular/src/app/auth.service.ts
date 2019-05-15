import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { UrlService } from './url.service';

interface myData {
  success: boolean,
  message: string
}


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
      return this.http.post<any>(this.url.adminLogin, {
        username, password, role})
    } else if (role == "advisor") {
      return this.http.put<any>(this.url.advisorLogin, {
        username, password, role
      })
    } else if (role == "professor") {
      return this.http.put<any>(this.url.profLogin, {
        username, password, role
      })
    } else if (role == "student") {
      return this.http.put<any>(this.url.studentLogin, {
        username, password, role
      })
    } else {
      console.log(" Invalid role selected")
     }
  }
}
    



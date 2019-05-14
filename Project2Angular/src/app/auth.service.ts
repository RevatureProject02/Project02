import { Injectable } from '@angular/core';
import {  HttpClient } from '@angular/common/http';
import { UrlService } from './url.service';

interface myData{
  success: boolean,
  message: string
}


@Injectable({
  providedIn: 'root'
})
export class AuthService {

  private loggedInStatus = false;

  constructor(private http: HttpClient, private url: UrlService) { }

  setLoggedIn(value: boolean){
    this.loggedInStatus = value;
  }  

  get isLoggedIn(){
    return this.loggedInStatus
  }

  getUserDetails(username, password, role){ 
    if(role == "admin"){
    return this.http.post<myData>(this.url.adminLogin, {
      username, password, role
    })}else if(role == "advisor"){
      return this.http.post<myData>(this.url.advisorLogin,{
        username, password, role
      })}else if(role == "professor"){
        return this.http.post<myData>(this.url.profLogin,{
          username, password, role
        })}else if(role == "student"){
          return this.http.post<myData>(this.url.studentLogin,{
            username, password, role
          })}
        }
      }
    }
  }
}

import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  flip() {
    document.getElementById("form").style.transform = 'rotateY(180deg)';
  }
  flip1() {
    document.getElementById("form").style.transform = 'rotateY( 0deg)';
  }

  loginUser(event){
    console.log(event)
  }
  constructor() { }

  ngOnInit() {
  }

}

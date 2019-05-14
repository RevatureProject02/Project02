import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor() { }

  fillBar()
  {
    var bar = document.getElementById("navigationBar");
    switch(localStorage.getItem('role'))
    {
      case "admin": bar.outerHTML = ('<app-admin-navbar></app-admin-navbar>');
      case "advisor": bar.outerHTML = ('<app-advisor-navbar></app-advisor-navbar>');
      case "professor": bar.outerHTML = ('<app-professor-navbar></app-professor-navbar>');
      case "student": bar.outerHTML = ('<app-student-navbar></app-student-navbar>');
      default : ;
    }
  }
  ngOnInit() {
  }
}
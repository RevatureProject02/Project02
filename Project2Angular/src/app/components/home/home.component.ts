import { Component, OnInit } from '@angular/core';
import { AdminNavbarComponent } from '../admin-navbar/admin-navbar.component';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor() { }

  buildBar()
  {
   
  }
 
  ngOnInit() 
  {
    var baseBar = document.getElementById("nav-bar");
    switch(localStorage.getItem('role'))
    {
        case 'admin': baseBar.hidden = true; document.getElementById("adminbar").hidden = false; break;
        case 'advisor':  baseBar.hidden = true; document.getElementById("advisorbar").hidden = false; break;
        case 'professor': baseBar.hidden = true; document.getElementById("professorbar").hidden = false; break; 
        case 'student':  baseBar.hidden = true; document.getElementById("studentbar").hidden = false; break;
    }
  }
}
import { Component, OnInit } from '@angular/core';
import { AdminNavbarComponent } from '../admin-navbar/admin-navbar.component';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor() { }

  ngOnInit() 
  {
    var baseBar = document.getElementById("nav-bar");
    var adminBar = document.getElementById("adminbar");
    var advisorBar = document.getElementById("advisorBar");
    var studentBar = document.getElementById('studentBar');
    var professorBar = document.getElementById('professorBar');
    switch(localStorage.getItem('Role'))
    {
        case 'admin': baseBar.hidden = true; adminBar.hidden = false; break;
        case 'advisor':  baseBar.hidden = true; advisorBar.hidden = false; break;
        case 'professor': baseBar.hidden = true; professorBar.hidden = false; break; 
        case 'student':  baseBar.hidden = true; studentBar.hidden = false; break;
        default: baseBar.hidden = false;  adminBar.hidden = true; advisorBar.hidden = true; professorBar.hidden = true; studentBar.hidden = true;
    }
    
    var LoginName = document.getElementById("Log")
    if(localStorage.getItem('Username') != null)
    {
      LoginName.innerHTML = localStorage.getItem('Username');
    }
    
  }
}
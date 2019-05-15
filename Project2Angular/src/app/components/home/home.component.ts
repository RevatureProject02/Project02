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
<<<<<<< HEAD
=======
    var adminBar = document.getElementById("adminbar");
    var advisorBar = document.getElementById("advisorbar");
    var studentBar = document.getElementById('studentbar');
    var professorBar = document.getElementById('professorbar');
>>>>>>> f63ef46b2125d166bd6dd4103dafde41084d0d90
    switch(localStorage.getItem('Role'))
    {
        case 'admin': baseBar.hidden = true; document.getElementById('adminbar').hidden = false; break;
        case 'advisor':  baseBar.hidden = true; document.getElementById('advisor').hidden = false; break;
        case 'professor': baseBar.hidden = true; document.getElementById('professor').hidden = false; break; 
        case 'student':  baseBar.hidden = true; document.getElementById('studentBar').hidden = false; break;
        default: baseBar.hidden = false;  
        document.getElementById('adminbar').hidden = true; 
        document.getElementById('advisor').hidden = true; 
        document.getElementById('professor').hidden = true; 
        document.getElementById('studentBar').hidden = true;
    }
    
    var LoginName = document.getElementById("Log")
    if(localStorage.getItem('Username') != null)
    {
      LoginName.innerHTML = localStorage.getItem('Username');
    }
    
  }
}
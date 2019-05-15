import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router';
import { AuthService } from 'src/app/auth.service';
@Component({
  selector: 'app-logout',
  templateUrl: './logout.component.html',
  styleUrls: ['./logout.component.css']
})
export class LogoutComponent implements OnInit {

  constructor( private auth: AuthService, private router: Router ) { }

  ngOnInit() 
  {
      localStorage.removeItem("Username");
      localStorage.removeItem("Password");
      localStorage.removeItem("Role");
      this.auth.setLoggedIn(false);
      this.router.navigate(['home']);
  }

}

import { Component, OnInit } from '@angular/core';
import { Administrator } from 'src/app/administrator';
import { AdministratorService } from 'src/app/administrator.service';
import { AuthService } from 'src/app/auth.service';
import { Router } from '@angular/router';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  model = new Administrator(0, "name", 0, "username", "password", "email")

  flip() {
    document.getElementById("form").style.transform = 'rotateY(180deg)';
  }
  flip1() {
    document.getElementById("form").style.transform = 'rotateY( 0deg)';
  }
  constructor(private as: AdministratorService, private auth: AuthService,
  private router: Router ) { }

  ngOnInit() {


  }
 addAdministrator() {
    this.as.addAdministrator(this.model).subscribe(x=>{"This does nothing"})
    this.model = new Administrator(0, "", 0, "", "", "")
  }
  loginUser(event){
    // event.preventDefault();
    const target = event.target;
    const username = target.querySelector('#username').value;
    const password = target.querySelector('#password').value;
    const role = target.querySelector('input[name="role"]:checked').value;
    this.auth.getUserDetails(username, password, role).subscribe(data => {
      console.log(data.key);
      if(data.key == "Administrator") {
        this.router.navigate(['admin'])
        this.auth.setLoggedIn(true);
      }else if(data.key == "Student") {
        this.router.navigate(['home'])
        this.auth.setLoggedIn(true);
      }else if(data.key == "Advisor") {
        this.router.navigate(['home'])
        this.auth.setLoggedIn(true);
      }else if(data.key == "Professor") {
        this.router.navigate(['home'])
        this.auth.setLoggedIn(true);
      }else{
        alert("You shall not paaaaaassssss!!")
      }
    })
    console.log(username, password, role);

  }
}

import { Component, OnInit } from '@angular/core';
import { Administrator } from 'src/app/administrator';
import { AdministratorService } from 'src/app/administrator.service';

@Component({
  selector: 'app-add-admin',
  templateUrl: './add-admin.component.html',
  styleUrls: ['./add-admin.component.css']
})
export class AddAdminComponent implements OnInit {

  model = new Administrator(0, "name", 0, "username", "password", "email")

  constructor(private as: AdministratorService) { }

  ngOnInit() {
  }

  addAdministrator() {
    this.as.addAdministrator(this.model).subscribe(x=>{"This does nothing"})
    this.model = new Administrator(0, "", 0, "", "", "")
  }

}

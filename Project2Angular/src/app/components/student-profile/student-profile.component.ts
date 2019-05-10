import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { THIS_EXPR } from '@angular/compiler/src/output/output_ast';

@Component({
  selector: 'app-student-profile',
  templateUrl: './student-profile.component.html',
  styleUrls: ['./student-profile.component.css']
})
export class StudentProfileComponent implements OnInit {

  constructor() { } //private route: ActivatedRoute

  ngOnInit() {

    // gets the paramater of username... which should be the user id value and turns the string to a number
    // service.getProfile(id); test on console.log(id ) to verify it is working 
    
  }

}

import { Component, OnInit } from '@angular/core';
import { Location } from'@angular/common';

@Component({
  selector: 'app-viewschedule',
  templateUrl: './viewschedule.component.html',
  styleUrls: ['./viewschedule.component.css']
})
export class ViewscheduleComponent implements OnInit {

  constructor(private locay: Location) { }

  ngOnInit() {
  }

  goBack(){
    this.locay.back;
  }
}



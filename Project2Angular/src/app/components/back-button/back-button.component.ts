import { Component, OnInit } from '@angular/core';
import { Location } from '@angular/common';

@Component({
  selector: 'app-back-button',
  template: `<button (click)="goBack">Back</button>`,
  templateUrl: './back-button.component.html',
  styleUrls: ['./back-button.component.css']
})
export class BackButtonComponent implements OnInit {

  constructor(private locay: Location) { }
  

  ngOnInit() {
  }

  goBack(){
    this.locay.back();
  }
}

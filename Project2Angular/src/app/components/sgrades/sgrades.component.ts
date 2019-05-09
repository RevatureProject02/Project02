import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-sgrades',
  templateUrl: './sgrades.component.html',
  styleUrls: ['./sgrades.component.css']
})
export class SGradesComponent implements OnInit {

  constructor() { }

  
  ngOnInit() 
  {
  var select = document.getElementById("class select");
  select.innerHTML = "<option>Grapes!<option>";
  }

}

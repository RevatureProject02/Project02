import { Component, OnInit } from '@angular/core';
import { AdvisorService } from 'src/app/advisor.service';
import { Advisor } from 'src/app/advisor';
@Component({
  selector: 'app-advisor',
  templateUrl: './advisor.component.html',
  styleUrls: ['./advisor.component.css']
})
export class AdvisorComponent implements OnInit {

  availableAdvisors= [];

  advisorModel = new Advisor(0,"name",0,"username","password","email");

  constructor(private advisor: AdvisorService) { }

  ngOnInit() {
    this.allAdvisors();
  }


  allAdvisors(){
    this.advisor.getAdvisors().subscribe(x => this.availableAdvisors = JSON.parse(x));
  }
  
  addAdvisor(){
    this.advisor.addAdvisor(this.advisorModel).subscribe(x=>{});
    this.advisorModel = new Advisor(0,"",0,"","","");
  }

  // deleteAdvisor(){
  //   this.advisor.deleteAdvisor().subscribe(x => this.deleteAdvisor = JSON.parse(x));
  // }

}

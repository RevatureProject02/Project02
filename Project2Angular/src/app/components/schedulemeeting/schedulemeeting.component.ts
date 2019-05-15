import { Component, OnInit } from '@angular/core';
import { Meeting } from 'src/app/meeting';
import { MeetingService } from 'src/app/meeting.service';
import { ProfessorService } from 'src/app/professor.service';
import { Professor } from 'src/app/professor';

@Component({
  selector: 'app-schedulemeeting',
  templateUrl: './schedulemeeting.component.html',
  styleUrls: ['./schedulemeeting.component.css']
})
export class SchedulemeetingComponent implements OnInit {
  public professor1: Professor;
  meeting_list = [];
  professor_list = [];
  professors = [];
  advisors = [];
  
  model = new Meeting(0, "summary", "myDate", "time", "location", this.advisors,  this.professors);
  constructor(private ms: MeetingService, private ps: ProfessorService) { }

  ngOnInit() {
    this.getProfessors();
  }
  insertMeeting(){
    this.ms.insertMeeting(this.model).subscribe(x=>{"this does nothing"});
    this.model = new Meeting(0, "", "yyyy-mm-dd", "","",[],[]);
  }

  showMeetings() {
    this.ms.showMeetings().subscribe(x => this.meeting_list = JSON.parse(x));
  }

  getProfessors(){
    this.ps.getProfessors().subscribe(x => this.professor_list = JSON.parse(x));
  }
  getAttendingProfessor(){
    this.model.professors=[];
    
    this.model.professors.push(this.professor1);
  }
}
import { Component, OnInit } from '@angular/core';
import { Meeting } from 'src/app/meeting';
import { MeetingService } from 'src/app/meeting.service';

@Component({
  selector: 'app-schedulemeeting',
  templateUrl: './schedulemeeting.component.html',
  styleUrls: ['./schedulemeeting.component.css']
})
export class SchedulemeetingComponent implements OnInit {
  
  meeting_list = [];
  model = new Meeting(0, "summary", "myDate", "time", "location");
  constructor(private ms: MeetingService) { }

  ngOnInit() {
    this.model.myDate = "yyyy-mm-dd";
  }
  insertMeeting(){
    this.ms.insertMeeting(this.model).subscribe(x=>{"this does nothing"});
    this.model = new Meeting(0, "", "yyyy-mm-dd", "","");
  }

  showMeetings() {
    this.ms.showMeetings().subscribe(x => this.meeting_list = JSON.parse(x));
  }
}
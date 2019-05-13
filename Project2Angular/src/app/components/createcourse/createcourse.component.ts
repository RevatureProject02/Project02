import { Component, OnInit } from '@angular/core';
import { Course } from '../../course';
import { CourseService } from '../../course.service';

@Component({
  selector: 'app-createcourse',
  templateUrl: './createcourse.component.html',
  styleUrls: ['./createcourse.component.css']
})
export class CreatecourseComponent implements OnInit {

  
  course_list = [];

  model = new Course(0, "name", "time", "location", "days");
  constructor(private cs: CourseService) { }

  ngOnInit() {
  }
  insertCourse(){
    //this.model = new Course(0, "name", "time", "location", "days");
    this.cs.insertCourse(this.model).subscribe(x=>{"this does nothing"});
    this.model = new Course(0, "", "", "", "");
  }

  showCourses() {
    this.cs.showCourses().subscribe(x => this.course_list = JSON.parse(x));
  }
}

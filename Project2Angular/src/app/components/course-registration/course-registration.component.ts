import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { HttpErrorResponse } from '@angular/common/http/src/response';
import { CourseService } from 'src/app/course.service';

@Component({
  selector: 'app-course-registration',
  templateUrl: './course-registration.component.html',
  styleUrls: ['./course-registration.component.css']
})
export class CourseRegistrationComponent implements OnInit {

    availableCourses= [];

  constructor(private courseS: CourseService) { }

  ngOnInit() {
    this.listCourses();
  }

  listCourses(){
    this.courseS.showCourses().subscribe(x => this.availableCourses = JSON.parse(x));
  }

}

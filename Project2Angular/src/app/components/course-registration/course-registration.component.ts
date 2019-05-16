import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { HttpErrorResponse } from '@angular/common/http/src/response';
import { CourseService } from 'src/app/course.service';
import { studentCorse } from 'src/app/studentcourse';
import { Student } from 'src/app/student';
import { Course } from 'src/app/course';

@Component({
  selector: 'app-course-registration',
  templateUrl: './course-registration.component.html',
  styleUrls: ['./course-registration.component.css']
})
export class CourseRegistrationComponent implements OnInit {

    availableCourses= [];
    // firstCourseModel = new Course(0,"","","","");
    // studentModel = new Student(0,0,"","","",);
    courseModel = new studentCorse(0,0);

  constructor(private courseS: CourseService, private newCourse: CourseService) { }

  ngOnInit() {
    this.listCourses();
  }

  listCourses(){
    this.courseS.showCourses().subscribe(x => this.availableCourses = JSON.parse(x));
  }

  addNewCourse()
    {
      this.newCourse.addNewCourse(this.courseModel).subscribe(x=>{});
      this.courseModel = new studentCorse(0,0);

    } 

}

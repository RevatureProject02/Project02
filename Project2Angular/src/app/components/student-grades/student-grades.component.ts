import { Component, OnInit } from '@angular/core';
import { Student } from 'src/app/student';
import { StudentService } from 'src/app/student.service';
import {CourseService} from 'src/app/course.service';
@Component({
  selector: 'app-student-grades',
  templateUrl: './student-grades.component.html',
  styleUrls: ['./student-grades.component.css']
})
export class StudentGradesComponent implements OnInit {

  constructor(private s: StudentService, private c: CourseService) { }

  ngOnInit() 
  {
        document.getElementById("student").innerHTML = localStorage.getItem("Username") + 'grades';

      var gradeSheet =   document.getElementById("GradeSheet");
      var gradeList = document.getElementById("CourseList");

  }

}

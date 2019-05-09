import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
//components:
import { AppComponent } from './app.component';
import { CreateAssignmentsComponent } from './components/create-assignments/create-assignments.component';
import { GradeAssignmentsComponent } from './components/grade-assignments/grade-assignments.component';
import { StudentGradesComponent } from './components/student-grades/student-grades.component';
import { AdminNavbarComponent } from './components/admin-navbar/admin-navbar.component';
import { AdvisorNavbarComponent } from './components/advisor-navbar/advisor-navbar.component';
import { StudentNavbarComponent } from './components/student-navbar/student-navbar.component';
import { ProfessorNavbarComponent } from './components/professor-navbar/professor-navbar.component';

@NgModule({
  declarations: [
    AppComponent,
    CreateAssignmentsComponent,
    GradeAssignmentsComponent,
    StudentGradesComponent,
    AdminNavbarComponent,
    AdvisorNavbarComponent,
    StudentNavbarComponent,
    ProfessorNavbarComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

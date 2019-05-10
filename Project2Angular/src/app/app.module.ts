import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
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
import { CreatecourseComponent } from './components/createcourse/createcourse.component';
import { SchedulemeetingComponent } from './components/schedulemeeting/schedulemeeting.component';
import { ViewscheduleComponent } from './components/viewschedule/viewschedule.component';
import { SetavailabilityComponent } from './components/setavailability/setavailability.component';
import { LoginComponent } from './components/login/login.component';
import { HomeComponent } from './components/home/home.component';
import { NavbarComponent } from './components/navbar/navbar.component';


@NgModule({
  declarations: [

    AppComponent, 
    CreateAssignmentsComponent,
    GradeAssignmentsComponent,
    StudentGradesComponent,
    AdminNavbarComponent,
    AdvisorNavbarComponent,
    StudentNavbarComponent,
    ProfessorNavbarComponent,
    CreatecourseComponent, 
    SchedulemeetingComponent, 
    ViewscheduleComponent, 
    SetavailabilityComponent, 
    LoginComponent, 
    HomeComponent,
    NavbarComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {}

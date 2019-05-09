import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
<<<<<<< HEAD
//components:
import { AppComponent } from './app.component';
import { CreateAssignmentsComponent } from './components/create-assignments/create-assignments.component';
import { GradeAssignmentsComponent } from './components/grade-assignments/grade-assignments.component';
import { StudentGradesComponent } from './components/student-grades/student-grades.component';
import { AdminNavbarComponent } from './components/admin-navbar/admin-navbar.component';
import { AdvisorNavbarComponent } from './components/advisor-navbar/advisor-navbar.component';
import { StudentNavbarComponent } from './components/student-navbar/student-navbar.component';
import { ProfessorNavbarComponent } from './components/professor-navbar/professor-navbar.component';
=======
import { FormsModule } from '@angular/forms';

//components
import { AppComponent } from './app.component';
import { LoginComponent } from './components/login/login.component';
import { HomeComponent } from './components/home/home.component';
>>>>>>> e01bbc3a9d6cd4f50db8bc64db26e7a9d1175a83

@NgModule({
  declarations: [
    AppComponent,
<<<<<<< HEAD
    CreateAssignmentsComponent,
    GradeAssignmentsComponent,
    StudentGradesComponent,
    AdminNavbarComponent,
    AdvisorNavbarComponent,
    StudentNavbarComponent,
    ProfessorNavbarComponent
=======
    LoginComponent,
    HomeComponent
>>>>>>> e01bbc3a9d6cd4f50db8bc64db26e7a9d1175a83
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {}

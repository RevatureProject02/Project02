import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { StudentGradesComponent } from './components/student-grades/student-grades.component';
import { CreateAssignmentsComponent } from './components/create-assignments/create-assignments.component';
import { GradeAssignmentsComponent } from './components/grade-assignments/grade-assignments.component';
import { LoginComponent } from './components/login/login.component';
import { HomeComponent } from './components/home/home.component';

const routes: Routes = [
//Student navbar
  {
    path: 'student-grades',
    component: StudentGradesComponent
  },
//Admin navbar
  {
    path: 'create-assignments',
    component: CreateAssignmentsComponent
  },
  {
    path: 'grade-assignments',
    component: GradeAssignmentsComponent
  },
  {
    path: 'home',
    component: HomeComponent
  },
  //Back to login page
  {
    path: "",
    component: LoginComponent
  },
  {
    path: '**',
    redirectTo: "login",
    pathMatch:"full"
  }


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

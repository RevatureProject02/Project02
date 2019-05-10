import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { LoginComponent } from './components/login/login.component';
import { HomeComponent } from './components/home/home.component';
import { CreateAssignmentsComponent } from './components/create-assignments/create-assignments.component';
import { GradeAssignmentsComponent } from './components/grade-assignments/grade-assignments.component';
import { CreatecourseComponent } from './components/createcourse/createcourse.component';
import { SchedulemeetingComponent } from './components/schedulemeeting/schedulemeeting.component';
import { SetavailabilityComponent } from './components/setavailability/setavailability.component';
import { ViewscheduleComponent } from './components/viewschedule/viewschedule.component';
import { StudentGradesComponent } from './components/student-grades/student-grades.component';
const routes: Routes = [
{
  path:'createcourse',
  component: CreatecourseComponent
},
{
  path:'schedulemeeting',
  component: SchedulemeetingComponent
},
{
  path:'setavailability',
  component: SetavailabilityComponent
},
{
  path:'viewschedule',
  component: ViewscheduleComponent
},
{
  path: '',
  component: LoginComponent
},
{
  path: 'login',
  component: LoginComponent
},
{
  path: 'home',
  component: HomeComponent
},
{
  path: '**',
  redirectTo: 'login',
  pathMatch: 'full'
},
{
  path: 'student-grades',
  component: StudentGradesComponent
},
{
  path: 'create-assignments',
  component: CreateAssignmentsComponent
},
{
  path: 'grade-assignments',
  component: GradeAssignmentsComponent
}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

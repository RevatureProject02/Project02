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
import { StudentProfileComponent } from './components/student-profile/student-profile.component';
import { StudentComponent } from './components/student/student.component';
import { AuthGuard } from './auth.guard';
import { AdminComponent } from './admin/admin.component';
import { LogoutComponent } from './components/logout/logout.component';
import { AdvisorComponent } from './components/advisor/advisor.component';
import { CourseRegistrationComponent } from './components/course-registration/course-registration.component';
import { ProfessorComponent } from './components/professor/professor.component';

const routes: Routes = [
  {
    path: 'admin',
    component: AdminComponent
  },
  {
    path: 'createcourse',
    component: CreatecourseComponent
  },
  {
    path: 'schedulemeeting',
    component: SchedulemeetingComponent
  },
  {
    path: 'setavailability',
    component: SetavailabilityComponent
  },
  {
    path: 'course-registration',
    component: CourseRegistrationComponent

  },
  {
    path: 'viewschedule',
    component: ViewscheduleComponent
  },
  {
    path: '',
    component: HomeComponent
  },
  {
    path: 'login',
    component: LoginComponent
  },
  {
    path: 'logout',
    component: LogoutComponent
  },
  {
    path: 'home',
    component: HomeComponent
  },
  {
    path: 'student-grades',
    component: StudentGradesComponent
  },
  {
    path: 'profile/:id',
    component: StudentProfileComponent
  },
  {
    path: 'student',
    component: StudentComponent
  },
  {
    path: 'advisor',
    component: AdvisorComponent
  },
  {
    path: 'professor',
    component: ProfessorComponent
  },
  {
    path: 'create-assignments',
    component: CreateAssignmentsComponent
  },
  {
    path: 'grade-assignments',
    component: GradeAssignmentsComponent
  }, {
    path: '**',
    redirectTo: 'home',
    pathMatch: 'full'
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

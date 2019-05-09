import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { StudentGradesComponent } from './components/student-grades/student-grades.component';

const routes: Routes = [

  {
    path: 'student-grades',
    component: StudentGradesComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

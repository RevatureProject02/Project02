import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
<<<<<<< HEAD
import { StudentGradesComponent } from './components/student-grades/student-grades.component';

const routes: Routes = [

  {
    path: 'student-grades',
    component: StudentGradesComponent
=======
import { LoginComponent } from './components/login/login.component';
import { HomeComponent } from './components/home/home.component';

const routes: Routes = [
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
>>>>>>> e01bbc3a9d6cd4f50db8bc64db26e7a9d1175a83
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

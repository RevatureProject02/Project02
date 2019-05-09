import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { SGradesComponent } from './components/sgrades/sgrades.component';

const routes: Routes = [

  {
    path: 'sgrades',
    component: SGradesComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

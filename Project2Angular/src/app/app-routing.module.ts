import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CreatecourseComponent } from './components/createcourse/createcourse.component';
import { SchedulemeetingComponent } from './components/schedulemeeting/schedulemeeting.component';
import { SetavailabilityComponent } from './components/setavailability/setavailability.component';
import { ViewscheduleComponent } from './components/viewschedule/viewschedule.component';

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
}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

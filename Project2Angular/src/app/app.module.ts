import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';

//components
import { AppComponent } from './app.component';

import { CreatecourseComponent } from './components/createcourse/createcourse.component';
import { SchedulemeetingComponent } from './components/schedulemeeting/schedulemeeting.component';
import { ViewscheduleComponent } from './components/viewschedule/viewschedule.component';
import { SetavailabilityComponent } from './components/setavailability/setavailability.component';
import { LoginComponent } from './components/login/login.component';
import { HomeComponent } from './components/home/home.component';

@NgModule({
  declarations: [
    AppComponent, CreatecourseComponent, SchedulemeetingComponent, ViewscheduleComponent, SetavailabilityComponent, LoginComponent, HomeComponent
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

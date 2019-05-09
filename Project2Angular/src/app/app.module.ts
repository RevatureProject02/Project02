import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
//components:
import { AppComponent } from './app.component';
import { SGradesComponent } from './components/sgrades/sgrades.component';
import { StudentNavbarComponent } from './components/student-navbar/student-navbar.component';

@NgModule({
  declarations: [
    AppComponent,
    SGradesComponent,
    StudentNavbarComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

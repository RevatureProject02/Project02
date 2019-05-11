import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CourseRegistrationComponent } from './course-registration.component';

describe('CourseRegistrationComponent', () => {
  let component: CourseRegistrationComponent;
  let fixture: ComponentFixture<CourseRegistrationComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CourseRegistrationComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CourseRegistrationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

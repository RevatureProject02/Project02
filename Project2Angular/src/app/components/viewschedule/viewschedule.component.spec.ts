import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewscheduleComponent } from './viewschedule.component';

describe('ViewscheduleComponent', () => {
  let component: ViewscheduleComponent;
  let fixture: ComponentFixture<ViewscheduleComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ViewscheduleComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ViewscheduleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

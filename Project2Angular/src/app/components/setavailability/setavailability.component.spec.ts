import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SetavailabilityComponent } from './setavailability.component';

describe('SetavailabilityComponent', () => {
  let component: SetavailabilityComponent;
  let fixture: ComponentFixture<SetavailabilityComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SetavailabilityComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SetavailabilityComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

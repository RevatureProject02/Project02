import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SchedulemeetingComponent } from './schedulemeeting.component';

describe('SchedulemeetingComponent', () => {
  let component: SchedulemeetingComponent;
  let fixture: ComponentFixture<SchedulemeetingComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SchedulemeetingComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SchedulemeetingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

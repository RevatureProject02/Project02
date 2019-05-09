import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CreateAssignmentsComponent } from './create-assignments.component';

describe('CreateAssignmentsComponent', () => {
  let component: CreateAssignmentsComponent;
  let fixture: ComponentFixture<CreateAssignmentsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CreateAssignmentsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CreateAssignmentsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

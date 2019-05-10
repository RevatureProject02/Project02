import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CreatecourseComponent } from './createcourse.component';

describe('CreatecourseComponent', () => {
  let component: CreatecourseComponent;
  let fixture: ComponentFixture<CreatecourseComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CreatecourseComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CreatecourseComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

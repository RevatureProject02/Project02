import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ProfessorNavbarComponent } from './professor-navbar.component';

describe('ProfessorNavbarComponent', () => {
  let component: ProfessorNavbarComponent;
  let fixture: ComponentFixture<ProfessorNavbarComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ProfessorNavbarComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ProfessorNavbarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

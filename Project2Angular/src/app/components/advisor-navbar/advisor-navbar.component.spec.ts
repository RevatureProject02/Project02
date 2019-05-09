import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AdvisorNavbarComponent } from './advisor-navbar.component';

describe('AdvisorNavbarComponent', () => {
  let component: AdvisorNavbarComponent;
  let fixture: ComponentFixture<AdvisorNavbarComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AdvisorNavbarComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AdvisorNavbarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

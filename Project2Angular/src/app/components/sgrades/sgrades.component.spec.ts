import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SGradesComponent } from './sgrades.component';

describe('SGradesComponent', () => {
  let component: SGradesComponent;
  let fixture: ComponentFixture<SGradesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SGradesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SGradesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

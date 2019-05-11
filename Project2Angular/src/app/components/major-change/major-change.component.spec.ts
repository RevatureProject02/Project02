import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MajorChangeComponent } from './major-change.component';

describe('MajorChangeComponent', () => {
  let component: MajorChangeComponent;
  let fixture: ComponentFixture<MajorChangeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MajorChangeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MajorChangeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

import { TestBed } from '@angular/core/testing';

import { ViewGradesService } from './view-grades.service';

describe('ViewGradesService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ViewGradesService = TestBed.get(ViewGradesService);
    expect(service).toBeTruthy();
  });
});

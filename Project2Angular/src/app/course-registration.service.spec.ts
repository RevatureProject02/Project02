import { TestBed } from '@angular/core/testing';

import { CourseRegistrationService } from './course-registration.service';

describe('CourseRegistrationService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: CourseRegistrationService = TestBed.get(CourseRegistrationService);
    expect(service).toBeTruthy();
  });
});

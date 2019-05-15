import { TestBed } from '@angular/core/testing';

import { StudentcourseService } from './studentcourse.service';

describe('StudentcourseService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: StudentcourseService = TestBed.get(StudentcourseService);
    expect(service).toBeTruthy();
  });
});

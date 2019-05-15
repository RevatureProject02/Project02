import { TestBed } from '@angular/core/testing';

import { ProfessorService } from './professor.service';

describe('ProfessorService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ProfessorService = TestBed.get(ProfessorService);
    expect(service).toBeTruthy();
  });
});

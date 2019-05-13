import { TestBed } from '@angular/core/testing';

import { AdvisorService } from './advisor.service';

describe('AdvisorService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: AdvisorService = TestBed.get(AdvisorService);
    expect(service).toBeTruthy();
  });
});

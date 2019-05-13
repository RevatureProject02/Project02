import { TestBed } from '@angular/core/testing';

import { AdministratorService } from './administrator.service';

describe('AdministratorService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: AdministratorService = TestBed.get(AdministratorService);
    expect(service).toBeTruthy();
  });
});

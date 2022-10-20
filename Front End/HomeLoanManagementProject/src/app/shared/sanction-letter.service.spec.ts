import { TestBed } from '@angular/core/testing';

import { SanctionLetterService } from './sanction-letter.service';

describe('SanctionLetterService', () => {
  let service: SanctionLetterService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(SanctionLetterService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});

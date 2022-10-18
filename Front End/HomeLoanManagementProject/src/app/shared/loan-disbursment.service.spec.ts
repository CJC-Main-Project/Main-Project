import { TestBed } from '@angular/core/testing';

import { LoanDisbursmentService } from './loan-disbursment.service';

describe('LoanDisbursmentService', () => {
  let service: LoanDisbursmentService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(LoanDisbursmentService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});

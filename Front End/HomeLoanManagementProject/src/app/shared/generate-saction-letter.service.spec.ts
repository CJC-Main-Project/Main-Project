import { TestBed } from '@angular/core/testing';

import { GenerateSactionLetterService } from './generate-saction-letter.service';

describe('GenerateSactionLetterService', () => {
  let service: GenerateSactionLetterService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(GenerateSactionLetterService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});

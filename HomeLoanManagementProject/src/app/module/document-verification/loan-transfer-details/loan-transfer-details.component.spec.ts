import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LoanTransferDetailsComponent } from './loan-transfer-details.component';

describe('LoanTransferDetailsComponent', () => {
  let component: LoanTransferDetailsComponent;
  let fixture: ComponentFixture<LoanTransferDetailsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LoanTransferDetailsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(LoanTransferDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LoanTranferDetailsComponent } from './loan-tranfer-details.component';

describe('LoanTranferDetailsComponent', () => {
  let component: LoanTranferDetailsComponent;
  let fixture: ComponentFixture<LoanTranferDetailsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LoanTranferDetailsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(LoanTranferDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

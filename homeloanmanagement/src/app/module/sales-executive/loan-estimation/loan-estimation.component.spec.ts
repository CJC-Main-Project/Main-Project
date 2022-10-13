import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LoanEstimationComponent } from './loan-estimation.component';

describe('LoanEstimationComponent', () => {
  let component: LoanEstimationComponent;
  let fixture: ComponentFixture<LoanEstimationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LoanEstimationComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(LoanEstimationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { EmiCalculatorComponent } from './emi-calculator/emi-calculator.component';
import { ApplicantDetailsComponent } from './applicant-details/applicant-details.component';
import { ViewDetailsComponent } from './view-details/view-details.component';
import { LoanEstimationComponent } from './loan-estimation/loan-estimation.component';
import { GenerateReportComponent } from './generate-report/generate-report.component';



@NgModule({
  declarations: [
    EmiCalculatorComponent,
    ApplicantDetailsComponent,
    ViewDetailsComponent,
    LoanEstimationComponent,
    GenerateReportComponent
  ],
  imports: [
    CommonModule
  ]
})
export class SalesExecutiveModule { }

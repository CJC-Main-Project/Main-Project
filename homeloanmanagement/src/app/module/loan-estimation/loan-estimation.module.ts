import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { EmiCalculatorComponent } from './emi-calculator/emi-calculator.component';
import { ViewDetailsComponent } from './view-details/view-details.component';
import { GenerateReportComponent } from './generate-report/generate-report.component';



@NgModule({
  declarations: [
    EmiCalculatorComponent,
    ViewDetailsComponent,
    GenerateReportComponent
  ],
  imports: [
    CommonModule
  ]
})
export class LoanEstimationModule { }

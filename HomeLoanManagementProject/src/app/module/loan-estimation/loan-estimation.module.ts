import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { EmiCalculatorComponent } from './emi-calculator/emi-calculator.component';
import { ViewDetailsComponent } from './view-details/view-details.component';
import { GenerateReportComponent } from './generate-report/generate-report.component';
import { RouterModule, Routes } from '@angular/router';

const lerouting:Routes=[
  {
    path:'emi-calculator',component:EmiCalculatorComponent
  },
  {
    path:'generate-report',component:GenerateReportComponent
  },
  {
    path:'view-details',component:ViewDetailsComponent
  }
]

@NgModule({
  declarations: [
    EmiCalculatorComponent,
    ViewDetailsComponent,
    GenerateReportComponent
  ],
  imports: [
    CommonModule,RouterModule.forChild(lerouting)
  ]
})
export class LoanEstimationModule { }

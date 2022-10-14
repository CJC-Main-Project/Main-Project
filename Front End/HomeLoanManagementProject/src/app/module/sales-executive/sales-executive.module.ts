import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { EmiCalculatorComponent } from './emi-calculator/emi-calculator.component';
import { ApplicantDetailsComponent } from './applicant-details/applicant-details.component';
import { ViewDetailsComponent } from './view-details/view-details.component';
import { RouterModule, Routes } from '@angular/router';

const serouting:Routes=[
  {
    path:'applicant-details',component:ApplicantDetailsComponent
  },
  {
    path:'emi-calculator',component:EmiCalculatorComponent
  },
  {
    path:'view-details',component:ViewDetailsComponent
  }
]

@NgModule({
  declarations: [
    EmiCalculatorComponent,
    ApplicantDetailsComponent,
    ViewDetailsComponent
  ],
  imports: [
    CommonModule,RouterModule.forChild(serouting)
  ]
})
export class SalesExecutiveModule { }

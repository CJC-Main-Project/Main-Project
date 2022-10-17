import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { EmiCalculatorComponent } from './emi-calculator/emi-calculator.component';
import { ApplicantDetailsComponent } from './applicant-details/applicant-details.component';
import { ViewDetailsComponent } from './view-details/view-details.component';
import { RouterModule, Routes } from '@angular/router';
import { EnquiryDetailsComponent } from './enquiry-details/enquiry-details.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

const serouting:Routes=[
  {
    path:'applicant-details',component:ApplicantDetailsComponent
  },
  {
    path:'emi-calculator',component:EmiCalculatorComponent
  },
  {
    path:'view-details',component:ViewDetailsComponent
  },
  {
    path:'enquiry-details',component:EnquiryDetailsComponent
  }
]

@NgModule({
  declarations: [
    EmiCalculatorComponent,
    ApplicantDetailsComponent,
    ViewDetailsComponent,
    EnquiryDetailsComponent
  ],
  imports: [
    CommonModule,RouterModule.forChild(serouting),ReactiveFormsModule,FormsModule
  ]
})
export class SalesExecutiveModule { }

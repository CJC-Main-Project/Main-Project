import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ViewDetailsComponent } from './view-details/view-details.component';
import { EmailGenerateComponent } from './email-generate/email-generate.component';
import { LoanTransferDetailsComponent } from './loan-transfer-details/loan-transfer-details.component';
import { RouterModule, Routes } from '@angular/router';

const dvrouting:Routes=[
  {
    path:'email-generate',component:EmailGenerateComponent
  },
  {
    path:'loan-transfer-details',component:LoanTransferDetailsComponent
  },
  {
    path:'view-details',component:ViewDetailsComponent
  }
]

@NgModule({
  declarations: [
    ViewDetailsComponent,
    EmailGenerateComponent,
    LoanTransferDetailsComponent
  ],
  imports: [
    CommonModule,RouterModule.forChild(dvrouting)
  ]
})
export class DocumentVerificationModule { }

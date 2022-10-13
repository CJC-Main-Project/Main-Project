import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ViewDetailsComponent } from './view-details/view-details.component';
import { EmailGenerateComponent } from './email-generate/email-generate.component';
import { LoanTranferDetailsComponent } from './loan-tranfer-details/loan-tranfer-details.component';



@NgModule({
  declarations: [
    ViewDetailsComponent,
    EmailGenerateComponent,
    LoanTranferDetailsComponent
  ],
  imports: [
    CommonModule
  ]
})
export class DocumentVerificationModule { }

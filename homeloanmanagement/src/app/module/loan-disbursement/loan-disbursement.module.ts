import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ViewDetailsComponent } from './view-details/view-details.component';
import { LoanTransferComponent } from './loan-transfer/loan-transfer.component';
import { EmailRecipeComponent } from './email-recipe/email-recipe.component';



@NgModule({
  declarations: [
    ViewDetailsComponent,
    LoanTransferComponent,
    EmailRecipeComponent
  ],
  imports: [
    CommonModule
  ]
})
export class LoanDisbursementModule { }

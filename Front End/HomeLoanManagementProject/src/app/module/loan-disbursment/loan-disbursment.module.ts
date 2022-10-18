import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ViewDetailsComponent } from './view-details/view-details.component';
import { LoanTransferComponent } from './loan-transfer/loan-transfer.component';
import { EmailRecipeComponent } from './email-recipe/email-recipe.component';
import { RouterModule, Routes } from '@angular/router';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

const ldrouting:Routes=[
  {
    path:'view-details',component:ViewDetailsComponent
  },
  {
    path:'email-recipe',component:EmailRecipeComponent
  },
  {
    path:'loan-transfer',component:LoanTransferComponent
  }
]

@NgModule({
  declarations: [
    ViewDetailsComponent,
    LoanTransferComponent,
    EmailRecipeComponent
  ],
  imports: [
    CommonModule,RouterModule.forChild(ldrouting),FormsModule,ReactiveFormsModule
  ]
})
export class LoanDisbursmentModule { }

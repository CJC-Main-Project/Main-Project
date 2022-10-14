import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ViewDetailsComponent } from './view-details/view-details.component';
import { GenerateSactionLetterComponent } from './generate-saction-letter/generate-saction-letter.component';
import { RouterModule, Routes } from '@angular/router';

const lsrouting:Routes=[
  {
    path:'view-details',component:ViewDetailsComponent
  },
  {
    path:'generate-sanction-letter',component:GenerateSactionLetterComponent
  }
]

@NgModule({
  declarations: [
    ViewDetailsComponent,
    GenerateSactionLetterComponent
  ],
  imports: [
    CommonModule,RouterModule.forChild(lsrouting)
  ]
})
export class LoanSanctionModule { }

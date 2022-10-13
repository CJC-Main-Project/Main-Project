import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ViewDetailsComponent } from './view-details/view-details.component';
import { GenerateSanctionLetterComponent } from './generate-sanction-letter/generate-sanction-letter.component';



@NgModule({
  declarations: [
    ViewDetailsComponent,
    GenerateSanctionLetterComponent
  ],
  imports: [
    CommonModule
  ]
})
export class LoanSanctionModule { }

import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ViewDetailsComponent } from './view-details/view-details.component';
import { RouterModule, Routes } from '@angular/router';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

const svrouting:Routes=[
  {
    path:'view-details',component:ViewDetailsComponent
  }
]

@NgModule({
  declarations: [
    ViewDetailsComponent
  ],
  imports: [
    CommonModule,RouterModule.forChild(svrouting),FormsModule,ReactiveFormsModule
  ]
})
export class SiteVisitModule { }

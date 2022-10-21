import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AllDetailComponent } from './all-detail/all-detail.component';
import { Route, RouterModule, Routes } from '@angular/router';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

const adrouting:Routes=[
  {
    path:'all-details/:id',component:AllDetailComponent
  }
]

@NgModule({
  declarations: [
    AllDetailComponent
  ],
  imports: [
    CommonModule,RouterModule.forChild(adrouting),FormsModule,ReactiveFormsModule
  ]
})
export class AllDetailsModule { }

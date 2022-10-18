import { NgModule } from '@angular/core';
import { CommonModule, } from '@angular/common';
import { BrowserModule  } from '@angular/platform-browser';
import { Routes, RouterModule } from '@angular/router';

import { AdminLayoutComponent } from './layouts/admin-layout/admin-layout.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { LoginComponent } from './login/login.component';
import { SalesExecutiveModule } from './module/sales-executive/sales-executive.module';
import { LoanEstimationModule } from './module/loan-estimation/loan-estimation.module';
import { DocumentVerificationModule } from './module/document-verification/document-verification.module';
import { SiteVisitModule } from './module/site-visit/site-visit.module';
import { LoanSanctionModule } from './module/loan-sanction/loan-sanction.module';
import { LoanDisbursmentModule } from './module/loan-disbursment/loan-disbursment.module';
import { ContactUsComponent } from './contact-us/contact-us.component';
import { AboutUsComponent } from './about-us/about-us.component';

const routes: Routes =[
  {
    path: '',
    redirectTo: 'home',
    pathMatch: 'full',
  },
  {
    path:'home',component:DashboardComponent,
    children:[
      {
        path:'contact-us',component:ContactUsComponent
      },
      {
        path:'about-us',component:AboutUsComponent
      }
    ]
  },
  {
    path:'login',component:LoginComponent
  },
  
  {
    path:'role',component:AdminLayoutComponent,
    children:[
      {
        path:'se',loadChildren:()=>SalesExecutiveModule
      },
      {
        path:'le',loadChildren:()=>LoanEstimationModule
      },
      {
        path:'dv',loadChildren:()=>DocumentVerificationModule
      },
      {
        path:'sv',loadChildren:()=>SiteVisitModule
      },
      {
        path:'ls',loadChildren:()=>LoanSanctionModule
      },
      {
        path:'ld',loadChildren:()=>LoanDisbursmentModule
      }
    ]
  }
  // {
  //   path: '**',
  //   redirectTo: 'dashboard'
  // }
];

@NgModule({
  imports: [
    CommonModule,
    BrowserModule,
    RouterModule.forRoot(routes,{
       useHash: true
    })
  ],
  exports: [
  ],
})
export class AppRoutingModule { }

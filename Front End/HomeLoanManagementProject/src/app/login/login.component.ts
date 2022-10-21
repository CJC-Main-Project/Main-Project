import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
export interface User{
  username:string;
  password:string;
}

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {

  u:User={
    username:"",
    password:"",
  }
  constructor(private router:Router) { }

  ngOnInit(): void {
  }

  login(u)
  {
     
     if(u.username === 'se' && u.password ==='se')
     {
      sessionStorage.setItem('role','se');
       this.router.navigateByUrl("role/se/emi-calculator");
       alert("Sales Executavive Login Successfully....");
     }
     if(u.username === 'le' && u.password ==='le')
     {
      sessionStorage.setItem('role','le');
       this.router.navigateByUrl("role/le/view-details");
       alert("Loan Estimation Login Successfully....");
     }
     if(u.username === 'dv' && u.password ==='dv')
     {
      sessionStorage.setItem('role','dv');
       this.router.navigateByUrl("role/dv/view-details");
       alert("Document Verification Login Successfully....");
     }
     if(u.username === 'sv' && u.password ==='sv')
     {
      sessionStorage.setItem('role','sv');
       this.router.navigateByUrl("role/sv/view-details");
       alert("Site Visit Login Successfully....");
     }
     if(u.username === 'ls' && u.password ==='ls')
     {
      sessionStorage.setItem('role','ls');
       this.router.navigateByUrl("role/ls/view-details");
       alert("Loan Sanction Login Successfully....");
     }
     if(u.username === 'ld' && u.password ==='ld')
     {
      sessionStorage.setItem('role','ld');
       this.router.navigateByUrl("role/ld/view-details");
       alert("Loan Disbursment Login Successfully....");
     }
  }
}

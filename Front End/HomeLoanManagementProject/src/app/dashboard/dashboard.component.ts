import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.scss']
})
export class DashboardComponent implements OnInit {

  constructor(private router:Router) { }

  ngOnInit(): void {
  }

  log(){
    this.router.navigate(['login']);
  }
  contact(){
    this.router.navigate(['home','contact-us']);
  }
  about(){
    this.router.navigate(['home','about-us']);
  }

}

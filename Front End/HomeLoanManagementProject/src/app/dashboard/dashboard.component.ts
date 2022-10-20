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

  home(){
    this.router.navigate(['dashbord','home']);
  }
  log(){
    this.router.navigate(['login']);
  }
  contact(){
    this.router.navigate(['dashbord','contact-us']);
  }
  about(){
    this.router.navigate(['dashbord','about-us']);
  }

}

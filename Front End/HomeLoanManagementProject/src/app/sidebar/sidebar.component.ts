import { Component, OnInit } from '@angular/core';
import { Menu } from 'app/model/menu';

declare const $: any;
declare interface RouteInfo {
    path: string;
    title: string;
    icon: string;
    class: string;
}
export const ROUTES: RouteInfo[] = [
    { path: '/view-details', title: 'View Details',  icon:'pe-7s-news-paper', class: '' },
    { path: '/emi-calculator', title: 'EMI Calculator',  icon:'pe-7s-science', class: '' },
    { path: '/applicant-details', title: 'Applicant Details',  icon:'pe-7s-map-marker', class: '' },
    { path: '/generate-report', title: 'Generate Report',  icon:'pe-7s-bell', class: '' },
    { path: '/loan-transfer-details', title: 'Loan Transfer Details',  icon:'pe-7s-rocket', class: 'active-pro' },
    { path: '/email-generate', title: 'Email Generate',  icon: 'pe-7s-graph', class: '' },
    { path: '/generate-sanction-letter/:id', title: 'Generate Sanction Letter',  icon: 'pe-7s-graph', class: '' },
    { path: '/email-recipe', title: 'Email Recipe',  icon: 'pe-7s-graph', class: '' },
    { path: '/loan-transfer/:id', title: 'Loan Transfer',  icon: 'pe-7s-graph', class: '' },
    { path: '/enquiry-details', title: 'Enquiry Details',  icon:'pe-7s-news-paper', class: '' },
    { path: '/all-details/:id', title: 'All Details',  icon:'pe-7s-news-paper', class: '' },
];

@Component({
  selector: 'app-sidebar',
  templateUrl: './sidebar.component.html'
})
export class SidebarComponent implements OnInit {
 public menuItems: any[];
 role:string;
  constructor() { }

  ngOnInit() {
   // this.menuItems = ROUTES.filter(menuItem => menuItem);
   this.menuItems=Menu.menu;
   this.role=sessionStorage.getItem("role");
  }
  isMobileMenu() {
      if ($(window).width() > 991) {
          return false;
      }
      return true;
  };
}

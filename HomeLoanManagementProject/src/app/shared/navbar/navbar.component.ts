import { Component, OnInit, ElementRef } from '@angular/core';
import { ROUTES } from '../../sidebar/sidebar.component';
import {Location, LocationStrategy, PathLocationStrategy} from '@angular/common';

@Component({
    // moduleId: module.id,
    selector: 'navbar-cmp',
    templateUrl: 'navbar.component.html'
})

export class NavbarComponent implements OnInit{
    private listTitles: any[];
    location: Location;
    private toggleButton: any;
    private sidebarVisible: boolean;

    constructor(location: Location,  private element: ElementRef) {
      this.location = location;
          this.sidebarVisible = false;
    }

    ngOnInit(){
      this.listTitles = ROUTES.filter(listTitle => listTitle);
      const navbar: HTMLElement = this.element.nativeElement;
      this.toggleButton = navbar.getElementsByClassName('navbar-toggle')[0];
    }
    sidebarOpen() {
        const toggleButton = this.toggleButton;
        const body = document.getElementsByTagName('body')[0];
        setTimeout(function(){
            toggleButton.classList.add('toggled');
        }, 500);
        body.classList.add('nav-open');

        this.sidebarVisible = true;
    };
    sidebarClose() {
        const body = document.getElementsByTagName('body')[0];
        this.toggleButton.classList.remove('toggled');
        this.sidebarVisible = false;
        body.classList.remove('nav-open');
    };
    sidebarToggle() {
        // const toggleButton = this.toggleButton;
        // const body = document.getElementsByTagName('body')[0];
        if (this.sidebarVisible === false) {
            this.sidebarOpen();
        } else {
            this.sidebarClose();
        }
    };

    getTitle(){
      var titlee = this.location.prepareExternalUrl(this.location.path());
      console.log("Carector  "+titlee.charAt(0));
      console.log("Carector  "+titlee.charAt(2));
      if(titlee.charAt(5) === 'e'){
        console.log("maseg..-"+titlee.slice(2));
        console.log("maseg..-"+titlee.slice(9));
          titlee = titlee.slice( 9 );
      }

      for(var item = 0; item < this.listTitles.length; item++){
            console.log("maseg listtitel path."+this.listTitles[item].path);
            console.log("masgt-."+titlee)
          if(this.listTitles[item].path === titlee){
              
              return this.listTitles[item].title;
          }
      }
      return  this.listTitles[item].title;
    }
}

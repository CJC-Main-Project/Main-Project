import { Component, OnInit } from '@angular/core';
import { Customer } from 'app/model/customer';
import { CustomerService } from 'app/shared/customer.service';

@Component({
  selector: 'app-view-details',
  templateUrl: './view-details.component.html',
  styleUrls: ['./view-details.component.scss']
})
export class ViewDetailsComponent implements OnInit {

  constructor(private ser:CustomerService) { }

  customerList:Customer[];

  ngOnInit(): void {
    this.ser.getCustomer().subscribe((data:Customer[])=>{
      this.customerList=data;
    })
  }

}
